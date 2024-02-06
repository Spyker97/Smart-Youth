package com.smartdev.service;

public interface IMqttService {

    String sendMqttRequest(String topic , String data);
}
