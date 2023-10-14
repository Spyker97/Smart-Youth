package com.smartyouth.deviceMicroService.controller;


import com.smartyouth.deviceMicroService.entities.Device;
import com.smartyouth.deviceMicroService.entities.DeviceTopic;
import com.smartyouth.deviceMicroService.service.IDeviceTopicService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device-topic")
@Tag(name="Web Services - Device Topic")
public class DeviceTopicController {
    @Autowired
    IDeviceTopicService deviceTopicService ;

    @PostMapping("/add")
    public DeviceTopic addDevice(@RequestBody DeviceTopic device){
        return  deviceTopicService.addDeviceTopic(device);
    }

    @PutMapping("/update")
    public  DeviceTopic updateDevice(@RequestBody DeviceTopic device){
        return deviceTopicService.addDeviceTopic(device);
    }

    @GetMapping("/getbyid/{id}")
    public DeviceTopic getDeviceById(@PathVariable("id") String deviceId){
        return deviceTopicService.getDeviceTopicById(deviceId);
    }

    @GetMapping("/getAll")
    public List<DeviceTopic> getAllDevice(){
        return deviceTopicService.getAllDeviceTopic();
    }

    @DeleteMapping("/delete/{deviceid}")
    public void DeliceDevice(@PathVariable("deviceid") String deviceId){
        deviceTopicService.removeDeviceTopic(deviceId);
    }

}
