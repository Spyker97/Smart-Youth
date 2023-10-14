package com.smartyouth.deviceMicroService.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Scenario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id ;
    private LocalTime scenarioTime;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "scenario")
    Set<ScenarioAction> actions = new HashSet<>();



}
