package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public final static String MODEL_PACKAGE = "com.ehsaniara.multidatasource.model";

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
