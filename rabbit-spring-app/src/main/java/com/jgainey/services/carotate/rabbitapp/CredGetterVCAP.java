package com.jgainey.services.carotate.rabbitapp;
import com.google.gson.JsonParser;

class CredGetterVCAP {

    private String uri;


    public void setup(){

        String VCAP_SERVICES  = System.getenv("VCAP_SERVICES");
        //String VCAP_SERVICES = VCAPSTEST.getNONTLSVCAP();
        //String VCAP_SERVICES = VCAPSTEST.getTLSVCAP();

        JsonParser parser = new JsonParser();
        uri = parser.parse(VCAP_SERVICES).getAsJsonObject()
                .getAsJsonArray("p.rabbitmq")
                .get(0).getAsJsonObject()
                .getAsJsonObject("credentials")
                .get("uri").getAsString();
    }

    String getUri() {
        return uri;
    }
}
