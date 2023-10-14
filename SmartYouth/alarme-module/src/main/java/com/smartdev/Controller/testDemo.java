package com.smartdev.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alarme")
public class testDemo {

    @GetMapping("/test")
public String test(){
    return "Hello test";
}
}
