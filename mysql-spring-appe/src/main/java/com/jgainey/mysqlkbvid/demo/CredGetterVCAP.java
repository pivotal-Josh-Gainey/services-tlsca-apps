package com.jgainey.mysqlkbvid.demo;
import com.google.gson.JsonParser;

class CredGetterVCAP {

    private String jdbcUri;


    public void setup(){

        String VCAP_SERVICES  = System.getenv("VCAP_SERVICES");
    //    String VCAP_SERVICES  = VCAPSTEST.VCAPSERVICES();


        JsonParser parser = new JsonParser();
        jdbcUri = parser.parse(VCAP_SERVICES).getAsJsonObject()
                .getAsJsonArray("p.mysql")
                .get(0).getAsJsonObject()
                .getAsJsonObject("credentials")
                .get("jdbcUrl").getAsString();
    }

    String getjdbcUri() {
        return jdbcUri;
    }
}
