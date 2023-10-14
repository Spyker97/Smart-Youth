package com.smartyouth.deviceMicroService.controller;

import com.smartyouth.deviceMicroService.entities.RequestScenario;
import com.smartyouth.deviceMicroService.entities.Response;
import com.smartyouth.deviceMicroService.entities.ScenarioAction;
import com.smartyouth.deviceMicroService.service.IScenarioActionService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/scenario-action")
@Tag(name="Web Services - scenarioAction")
public class ScenarioActionController {

    @Autowired
    IScenarioActionService scenarioActionService ;

    @PostMapping("/add/{idScenario}")
    public Response addAll(@PathVariable("idScenario") Integer idScenario , @RequestBody RequestScenario requestScenario){

        return  scenarioActionService.addAll(requestScenario.scenarioActionList() , requestScenario.deviceListe() , idScenario);
    }
}
