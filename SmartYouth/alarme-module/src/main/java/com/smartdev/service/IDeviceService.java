package com.smartdev.service;


import com.smartdev.entities.Device;

import java.util.List;

public interface IDeviceService {

    public Device addDevice(Device device , String matriculeDeviceTopic);
    public Device updateDevice(Device device);
    public void addSlaveToMaster(List<Device> slaves , Integer masterId , List<String> matriculeslaveliste);

    public List<Device> getAllDevice() ;
    public void removeDevice(Integer deviceid);
    public Device getDeviceById(Integer deviceid);

}
