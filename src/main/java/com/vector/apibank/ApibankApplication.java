package com.vector.apibank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApibankApplication {

    public static void main(String[] args) {
        System.out.println("Hello,Welcome to api Bank!");
        SpringApplication.run(ApibankApplication.class, args);
    }

}
