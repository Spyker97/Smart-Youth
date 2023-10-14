package com.smartyouth.deviceMicroService.entities;

import java.util.List;

public record RequestScenario(List<ScenarioAction> scenarioActionList , List<Device> deviceListe) {
}
