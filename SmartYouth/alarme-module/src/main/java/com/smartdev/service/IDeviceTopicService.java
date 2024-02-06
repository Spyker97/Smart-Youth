package com.smartdev.service;



import com.smartdev.entities.DeviceTopic;

import java.util.List;

public interface IDeviceTopicService {
    public DeviceTopic addDeviceTopic(DeviceTopic device);
    public List<DeviceTopic> getAllDeviceTopic() ;
    public void removeDeviceTopic(String deviceid);
    public DeviceTopic getDeviceTopicById(String deviceid);

}
