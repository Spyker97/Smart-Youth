package com.smartdev.service;


import com.smartdev.entities.Device;
import com.smartdev.entities.DeviceTopic;
import com.smartdev.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService implements  IDeviceService{

    @Autowired
    DeviceRepository deviceRepository ;
    @Autowired
    IDeviceTopicService deviceTopicService ;

    @Override
    public Device addDevice(Device device, String matriculeDeviceTopic) {

        device.setDeviceTopic(deviceTopicService.getDeviceTopicById(matriculeDeviceTopic));
        return deviceRepository.save(device);
    }

    @Override
    public Device updateDevice(Device device) {
        return deviceRepository.save(device);
    }

    @Override
    public void addSlaveToMaster(List<Device> slaves, Integer masterId, List<String> matriculeslaveliste) {
        Device master = this.getDeviceById(masterId);
        int i = 0 ;
        for(Device slave : slaves){
            DeviceTopic DT = deviceTopicService.getDeviceTopicById(matriculeslaveliste.get(i));
            slave.setDeviceTopic(DT);
            slave.setMaster(master);
            deviceRepository.save(slave);
            i++;

        }

    }

    @Override
    public List<Device> getAllDevice() {
        return deviceRepository.findAll();
    }

    @Override
    public void removeDevice(Integer deviceid) {
        deviceRepository.deleteById(deviceid);
    }

    @Override
    public Device getDeviceById(Integer deviceid) {
        return deviceRepository.findById(deviceid).get();
    }
}
