package com.smartdev.Controller;

import com.smartdev.entities.Alarme;
import com.smartdev.service.AlarmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/alarme")
public class AlarmeController {
    @Autowired
    AlarmeService alarmeService;

    @GetMapping("/test")
    public String test() {
        return "Hello test Alarme";
    }

    @PostMapping("/add")
    public Alarme addalarme(@RequestBody Alarme alarme) {
        return alarmeService.addAlarme(alarme);
    }
    @GetMapping("/getAlarme")
    public List<Alarme> getAlarmes(){
        return alarmeService.getAlarmes();
    }
    @DeleteMapping("/deleteAlarme/{alarmeid}")
    public void removeAlarme(Integer alarmeid){
        alarmeService.removeAlarme(alarmeid);
    }
    @GetMapping("/mot")
    public int sds(String mot){
        return alarmeService.exerciceSteing(mot);
    }
}
