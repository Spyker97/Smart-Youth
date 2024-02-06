package com.smartdev.service;

import com.smartdev.entities.DeviceTopic;
import com.smartdev.repository.DeviceTopicRempository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTopicService implements IDeviceTopicService {

    @Autowired
    DeviceTopicRempository deviceTopicRempository ;


    @Override
    public DeviceTopic addDeviceTopic(DeviceTopic device) {
        return deviceTopicRempository.save(device);
    }

    @Override
    public List<DeviceTopic> getAllDeviceTopic() {
        return deviceTopicRempository.findAll();
    }

    @Override
    public void removeDeviceTopic(String deviceid) {
        deviceTopicRempository.deleteById(deviceid);
    }

    @Override
    public DeviceTopic getDeviceTopicById(String deviceid) {
        return deviceTopicRempository.findById(deviceid).get();
    }
}
