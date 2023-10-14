package com.smartyouth.deviceMicroService.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Device implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    private Integer userid ;

    private String titredevice ;

    @OneToOne
    private DeviceTopic deviceTopic ;


    @OneToMany(mappedBy = "master" , cascade = CascadeType.ALL)
    private Set<Device> salves = new HashSet<>();
    @ManyToOne
    @JsonIgnore
    private Device master ;

    @OneToMany(mappedBy = "device")
    Set<ScenarioAction> scenarioAction ;

}
