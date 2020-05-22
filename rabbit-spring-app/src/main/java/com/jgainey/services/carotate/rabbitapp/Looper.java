package com.jgainey.services.carotate.rabbitapp;


import com.rabbitmq.client.*;

import java.io.IOException;

public class Looper  {

    String uri;
    Connection connection;


    public void init() {
        CredGetterVCAP getter = new CredGetterVCAP();
        getter.setup();
        uri = getter.getUri();
        Utils.logInfo("init called");
        ConnectionFactory factory = new ConnectionFactory();
        try{
            factory.setUri(uri);
            messageLoop(factory);
        }catch(Exception e){
            Utils.logError(e.getMessage());
        }
    }


    //Will send a message every 5 seconds
    private void messageLoop(ConnectionFactory factory) {
        while(true){
            try {
                connection = factory.newConnection();
                Channel channel = connection.createChannel();
                while(connection.isOpen()){
                    channel.queueDeclare("JavaAppQueue", false, false, false, null);
                    Utils.logInfo("Connection active - message sent at " + System.currentTimeMillis());
                    channel.basicPublish("", "JavaAppQueue", null, "JavaAppQueue".getBytes());
                    Thread.sleep(5000);
                    if(!connection.isOpen()){
                        connection.close();
                    }
                }
            } catch (Exception e) {
                Utils.logError(e.getMessage());
                e.printStackTrace();
            }
        }

    }


}
