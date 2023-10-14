package com.smartyouth.deviceMicroService.service;

import com.smartyouth.deviceMicroService.entities.Device;
import com.smartyouth.deviceMicroService.entities.Response;
import com.smartyouth.deviceMicroService.entities.ScenarioAction;

import java.util.List;

public interface IScenarioActionService {

    public ScenarioAction add(ScenarioAction scenarioAction);
    public Response addAll(List<ScenarioAction> scenarioActionList , List<Device> listeDevice , Integer scenarioId);
    public List<ScenarioAction> showAll();

    public List<ScenarioAction> getActionByScenario(Integer scenarioId);
}
