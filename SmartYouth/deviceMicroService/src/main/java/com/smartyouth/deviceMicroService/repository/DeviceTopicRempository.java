package com.smartyouth.deviceMicroService.repository;

import com.smartyouth.deviceMicroService.entities.DeviceTopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceTopicRempository extends JpaRepository<DeviceTopic , String> {
}
