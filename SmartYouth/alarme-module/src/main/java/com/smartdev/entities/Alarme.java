package com.smartdev.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Alarme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String sensor;
    @Enumerated(EnumType.STRING)
    private ConditionAlarme conditionAlarme;
    private int value;
    private Boolean action;
    @DateTimeFormat
    private LocalTime alarmeTime;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "alarme")
     Set<AlarmeAction> alarmeActions;

    @ManyToOne
    @JsonIgnore
    AlarmeHead alarmeHead;


}
