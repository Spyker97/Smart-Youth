package com.smartdev.service;


import com.smartdev.entities.RequestData;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Service;

@MessagingGateway(defaultRequestChannel = "mqttOutboundChannel")
@Service
public interface MqttGateway {

    void sendToMqtt(String data , @Header(MqttHeaders.TOPIC) String topic) ;

    void sendToMqtt2(RequestData data , @Header(MqttHeaders.TOPIC) String topic) ;



}
