package com.smartyouth.deviceMicroService.repository;

import com.smartyouth.deviceMicroService.entities.ScenarioAction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ScenarioActionRepository extends JpaRepository<ScenarioAction , Integer> {

    List<ScenarioAction> findAllByScenario_Id(Integer scenarioId);
}
