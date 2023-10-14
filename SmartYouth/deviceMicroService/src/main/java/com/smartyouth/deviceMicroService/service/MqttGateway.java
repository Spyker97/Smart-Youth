package com.smartyouth.deviceMicroService.service;

import com.google.gson.JsonObject;
import com.smartyouth.deviceMicroService.entities.RequestData;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

import java.util.Map;

@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
@Service
public interface MqttGateway {

    void sendToMqtt(String data , @Header(MqttHeaders.TOPIC) String topic) ;

    void sendToMqtt2(RequestData data , @Header(MqttHeaders.TOPIC) String topic) ;



}
