package com.smartdev;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AlarmMain {
    public static void main(String[] args) {
        SpringApplication.run(AlarmMain.class, args);
        System.out.println("Hello world!");
    }
}