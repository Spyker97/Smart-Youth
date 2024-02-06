package com.smartdev.entities;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RequestAddAlarme {
    private AlarmeHead alarmeHead;
    private List<AlarmeAction> alarmeActions;
    private List<Alarme> alarmes;
}
