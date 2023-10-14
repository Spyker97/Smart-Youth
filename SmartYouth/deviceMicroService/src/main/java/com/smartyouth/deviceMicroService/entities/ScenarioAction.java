package com.smartyouth.deviceMicroService.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ScenarioAction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id ;

    @ManyToOne
    @JsonIgnore
    Scenario scenario ;

    @ManyToOne
    Device device ;
    Boolean action ;
}
