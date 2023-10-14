package com.smartyouth.deviceMicroService.service;

import com.smartyouth.deviceMicroService.entities.RequestData;
import com.smartyouth.deviceMicroService.entities.RequestMqtt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MqttService implements IMqttService{
    @Autowired
    MqttGateway mqttGateway ;
    static String TOPIC_BODY = "oussama111/feeds/";
    @Override
    public String sendMqttRequest(String topic, String data) {
        try {
            RequestMqtt requestMqtt = new RequestMqtt(
                    TOPIC_BODY+topic ,
                    new RequestData(data)
            );

            mqttGateway.sendToMqtt(requestMqtt.getData().toJsonString() , requestMqtt.getTopic());
            return "Success";

        }catch(Exception e){
            System.out.println(e);
            return "fail";

        }

    }
}
