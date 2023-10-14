package com.smartyouth.deviceMicroService.controller;


import com.smartyouth.deviceMicroService.entities.Device;
import com.smartyouth.deviceMicroService.entities.RequestSlaves;
import com.smartyouth.deviceMicroService.service.IDeviceService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/device")
@Tag(name="Web Services - Device")
public class DeviceController {
    @Autowired
    IDeviceService deviceService ;


    @PostMapping("/add/{matriculedevicetopic}")
    public Device addDevice( @PathVariable("matriculedevicetopic") String matricule ,  @RequestBody Device device ){
        return  deviceService.addDevice(device , matricule);
    }
    @PostMapping("/addslave/{masterId}")
    public void addSlaveToMaster(@PathVariable("masterId") Integer masterId , @RequestBody RequestSlaves requestSlaves){
            deviceService.addSlaveToMaster(requestSlaves.slaves() , masterId , requestSlaves.listeMatricule());

    }

    @PutMapping("/update")
    public  Device updateDevice(@RequestBody Device device){
        return deviceService.updateDevice(device);
    }

    @GetMapping("/getbyid/{id}")
    public Device getDeviceById(@PathVariable("id") Integer deviceId){
        return deviceService.getDeviceById(deviceId);
    }

    @GetMapping("/getAll")
    public List<Device> getAllDevice(){
        return deviceService.getAllDevice();
    }

    @DeleteMapping("/delete/{deviceid}")
    public void DeliceDevice(@PathVariable("deviceid") Integer deviceId){
        deviceService.removeDevice(deviceId);
    }
}
