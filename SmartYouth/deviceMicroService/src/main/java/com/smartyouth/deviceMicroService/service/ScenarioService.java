package com.smartyouth.deviceMicroService.service;


import com.smartyouth.deviceMicroService.entities.Scenario;
import com.smartyouth.deviceMicroService.repository.ScenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ScenarioService implements IScenarioService{

    @Autowired
    ScenarioRepository scenarioRepository ;


    @Override
    public Scenario addScenario(Scenario scenario) {

        return scenarioRepository.saveAndFlush(scenario);
    }

    @Override
    public List<Scenario> getAllScenarion() {
        return scenarioRepository.findAll();
    }

    @Override
    public Scenario getById(Integer id) {
        Optional<Scenario> scenarioOptional = scenarioRepository.findById(id);
        if (scenarioOptional.isPresent()) {
            Scenario scenario = scenarioOptional.get();
           return  scenario ;
        } else {
            // Handle the case where the id was not found
            return null;
        }

    }
}
