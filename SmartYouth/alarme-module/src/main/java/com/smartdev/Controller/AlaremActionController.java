package com.smartdev.Controller;

import com.smartdev.entities.AlarmeAction;
import com.smartdev.service.AlarmeActionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alarmeA")
public class AlaremActionController {

    @Autowired
    AlarmeActionService alarmeActionService;

    @PostMapping("/addAlarmeA")
    public AlarmeAction addAlarmeA(@RequestBody AlarmeAction alarmeAction){
        return alarmeActionService.addalarmeaction(alarmeAction);
    }
    @PostMapping("/addLAlarmeA")
    public void addLAlarmeA(@RequestBody List<AlarmeAction> alarmeAction){
         alarmeActionService.addLalarmeaction(alarmeAction);
    }
}
