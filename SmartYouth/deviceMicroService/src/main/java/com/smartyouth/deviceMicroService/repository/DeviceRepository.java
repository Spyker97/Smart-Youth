package com.smartyouth.deviceMicroService.repository;

import com.smartyouth.deviceMicroService.entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviceRepository extends JpaRepository<Device , Integer> {
}
