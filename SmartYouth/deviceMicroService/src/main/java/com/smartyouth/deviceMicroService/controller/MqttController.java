package com.smartyouth.deviceMicroService.controller;

import com.smartyouth.deviceMicroService.entities.RequestMqtt;
import com.smartyouth.deviceMicroService.service.MqttGateway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MqttController {


    @Autowired
    MqttGateway mqttGateway;
    @PostMapping("/sendMessage")
    public ResponseEntity<?> publish(@RequestBody RequestMqtt requestMqtt){

        try {
          //  JsonObject convertObject = new Gson().fromJson(mqttMessage, JsonObject.class);
            //mqttGateway.sendToMqtt(convertObject.get("message").toString(), convertObject.get("topic").toString());
           // mqttGateway.sendToMqtt("{'data':'hello'}", "oussama111/feeds/ouss");
            mqttGateway.sendToMqtt(requestMqtt.getData().toJsonString() , requestMqtt.getTopic());
            return ResponseEntity.ok("Success");
        }catch (Exception e){
            System.out.println(e);
            return ResponseEntity.ok("fail");
        }
    }



}