package com.jgainey.services.carotate.rabbitapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RabbitappApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitappApplication.class, args);
        Utils.initLogger();
        Looper looper = new Looper();
        looper.init();
    }

}
