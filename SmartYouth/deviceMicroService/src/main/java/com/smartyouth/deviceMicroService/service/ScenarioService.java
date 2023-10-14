package com.smartyouth.deviceMicroService.service;


import com.smartyouth.deviceMicroService.entities.RequestData;
import com.smartyouth.deviceMicroService.entities.RequestMqtt;
import com.smartyouth.deviceMicroService.entities.Scenario;
import com.smartyouth.deviceMicroService.entities.ScenarioAction;
import com.smartyouth.deviceMicroService.repository.ScenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import java.time.LocalTime;


import java.util.List;
import java.util.Optional;

@Service
public class ScenarioService implements IScenarioService{

    @Autowired
    ScenarioRepository scenarioRepository ;
    @Autowired
    IMqttService mqttService ;

    @Autowired
    IScenarioActionService scenarioActionService ;




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

    @Override
    @Scheduled(fixedRate = 30000)
    public void fetchScenario() {
        List<Scenario> listeScenario = this.getAllScenarion();
        LocalTime localTime = LocalTime.now();
        String timeNow = localTime.toString()
                .split(":")[0] + ":"
                + localTime.toString()
                .split(":")[1];

        listeScenario.stream()
                .filter(s -> s.getScenarioTime().toString().equals(timeNow))
                .forEach(s -> {
                    scenarioActionService.getActionByScenario(s.getId()).forEach(sa -> {

                        String response = mqttService.sendMqttRequest(sa.getDevice().getDeviceTopic().getTopic(), sa.getAction().toString());

                        if (response.equals("Success")) {
                            System.out.println("Success");
                        } else {
                            System.out.println("Fail");
                        }
                    });
                });

    }
}
