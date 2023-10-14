package com.smartyouth.deviceMicroService.service;

public interface IMqttService {

    String sendMqttRequest(String topic , String data);
}
