package com.smartdev;

import com.smartdev.service.AlarmeService;
import org.apache.logging.log4j.util.Chars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
@EnableDiscoveryClient
public class AlarmMain {

    public static void main(String[] args) {


        SpringApplication.run(AlarmMain.class, args);
        System.out.println("Hello world!");

    }

}