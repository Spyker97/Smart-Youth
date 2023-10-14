package com.smartyouth.deviceMicroService.service;

import com.smartyouth.deviceMicroService.entities.Device;
import com.smartyouth.deviceMicroService.entities.Response;
import com.smartyouth.deviceMicroService.entities.Scenario;
import com.smartyouth.deviceMicroService.entities.ScenarioAction;
import com.smartyouth.deviceMicroService.repository.ScenarioActionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ScenarioActionService implements IScenarioActionService{

    @Autowired
    ScenarioActionRepository scenarioActionRepository ;
    @Autowired
    IDeviceService deviceService ;
    @Autowired
    IScenarioService scenarioService ;
    @Override
    public ScenarioAction add(ScenarioAction scenarioAction) {
        return scenarioActionRepository.save(scenarioAction);
    }

    @Override
    public Response addAll(List<ScenarioAction> scenarioActionList, List<Device> listeDevice , Integer scenarioId) {
        int i = 0 ;
        List<ScenarioAction> lsa = new ArrayList<>();
        for(ScenarioAction scenarioAction : scenarioActionList){
            Device d = listeDevice.get(i);
           scenarioAction.setDevice(d);
            Scenario scenario = this.scenarioService.getById(scenarioId);
           if(scenario == null){
               return new Response(false , "scenario not found ");
           }
           scenarioAction.setScenario(scenario);
           lsa.add(scenarioAction);

        }
        scenarioActionRepository.saveAllAndFlush(lsa);
        return new Response(true , "");
    }

    @Override
    public List<ScenarioAction> showAll() {
        return scenarioActionRepository.findAll();
    }
}
