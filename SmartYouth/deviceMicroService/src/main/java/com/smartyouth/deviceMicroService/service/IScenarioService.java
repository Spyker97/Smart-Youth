package com.smartyouth.deviceMicroService.service;

import com.smartyouth.deviceMicroService.entities.Scenario;

import java.util.List;

public interface IScenarioService {

    Scenario addScenario(Scenario scenario);
    List<Scenario> getAllScenarion();
    Scenario getById(Integer id);
}
