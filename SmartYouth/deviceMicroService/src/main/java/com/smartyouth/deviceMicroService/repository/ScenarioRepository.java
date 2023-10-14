package com.smartyouth.deviceMicroService.repository;

import com.smartyouth.deviceMicroService.entities.Scenario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ScenarioRepository extends JpaRepository<Scenario , Integer> {
}
