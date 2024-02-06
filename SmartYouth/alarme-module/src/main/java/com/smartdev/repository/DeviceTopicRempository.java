package com.smartdev.repository;


import com.smartdev.entities.DeviceTopic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceTopicRempository extends JpaRepository<DeviceTopic, String> {
}
