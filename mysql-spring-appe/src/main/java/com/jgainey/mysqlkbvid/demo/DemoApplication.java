package com.jgainey.mysqlkbvid.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        Utils.initLogger();
        Looper looper = new Looper();
        looper.start();
    }

}
