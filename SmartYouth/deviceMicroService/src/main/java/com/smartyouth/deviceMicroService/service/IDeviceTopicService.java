package com.smartyouth.deviceMicroService.service;

import com.smartyouth.deviceMicroService.entities.Device;
import com.smartyouth.deviceMicroService.entities.DeviceTopic;

import java.util.List;

public interface IDeviceTopicService {
    public DeviceTopic addDeviceTopic(DeviceTopic device);
    public List<DeviceTopic> getAllDeviceTopic() ;
    public void removeDeviceTopic(String deviceid);
    public DeviceTopic getDeviceTopicById(String deviceid);

}
