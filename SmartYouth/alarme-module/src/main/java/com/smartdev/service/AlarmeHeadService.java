package com.smartdev.service;

import com.smartdev.entities.Alarme;
import com.smartdev.entities.AlarmeAction;
import com.smartdev.entities.AlarmeHead;
import com.smartdev.repository.AlarmeActionRepo;
import com.smartdev.repository.AlarmeHeadRepo;
import com.smartdev.repository.AlarmeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmeHeadService {
    @Autowired
    AlarmeHeadRepo alarmeHeadRepo;

    @Autowired
    AlarmeRepo alarmeRepo;
    @Autowired
    AlarmeActionRepo alarmeActionRepo;

    public void addAlarmeHead (AlarmeHead alarmeHead , List<Alarme> alarmes , List<AlarmeAction> alarmeActions) {

        AlarmeHead ah = alarmeHeadRepo.save(alarmeHead);
        for (int i= 0; i < alarmes.size(); i++) {
            alarmes.get(i).setAlarmeHead(ah);
           Alarme alarme = alarmeRepo.save( alarmes.get(i));
               alarmeActions.get(i).setAlarme(alarme);
                alarmeActionRepo.save(alarmeActions.get(i));

        }

    }
    public void getAlarmes(){
        alarmeHeadRepo.findAll();
    }
}
