package com.smartyouth.deviceMicroService.controller;

import com.smartyouth.deviceMicroService.entities.Scenario;
import com.smartyouth.deviceMicroService.service.IScenarioService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/scenario")
@Tag(name="Web Services - Scenario")
public class ScenarioController {
    @Autowired
    IScenarioService scenarioService ;

    @PostMapping("/add")
    public Scenario add(@RequestBody Scenario scenario){
        return  scenarioService.addScenario(scenario);
    }

    @GetMapping("/getAll")
    public List<Scenario> GetAllScenario(){
        return  scenarioService.getAllScenarion();
    }
}
