package com.smartdev.service;

import com.smartdev.entities.AlarmeAction;
import com.smartdev.repository.AlarmeActionRepo;
import com.smartdev.repository.AlarmeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlarmeActionService {
    @Autowired
    AlarmeActionRepo alarmeActionRepo;

    public AlarmeAction addalarmeaction (AlarmeAction alarmeAction){
        return alarmeActionRepo.save(alarmeAction);
    }
    public void addLalarmeaction (List<AlarmeAction> alarmeAction){
        for (AlarmeAction a : alarmeAction){
            alarmeActionRepo.save(a);
        }
    }


}
