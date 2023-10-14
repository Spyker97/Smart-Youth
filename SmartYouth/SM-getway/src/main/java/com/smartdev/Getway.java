package com.smartdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Getway {
    public static void main(String[] args) {
        SpringApplication.run(Getway.class,args);
        System.out.println("Hello world!");
    }
}