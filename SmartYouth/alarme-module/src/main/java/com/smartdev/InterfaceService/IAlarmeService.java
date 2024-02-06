package com.smartdev.InterfaceService;

import com.smartdev.entities.Alarme;

import java.util.List;

public interface IAlarmeService {
     Alarme addAlarme (Alarme alarme);
     List<Alarme>getAlarmes();
     void removeAlarme(Integer alarmeid);
}
