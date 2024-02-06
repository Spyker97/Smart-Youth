package com.smartdev.Controller;

import com.smartdev.entities.Alarme;
import com.smartdev.entities.AlarmeAction;
import com.smartdev.entities.AlarmeHead;
import com.smartdev.entities.RequestAddAlarme;
import com.smartdev.service.AlarmeHeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alarmehead")
public class AlarmeHeadController {

    @Autowired
    AlarmeHeadService alarmeHeadService;

    @GetMapping("/test")
    public String test() {
        return "Hello test Alarme";
    }

    @PostMapping("/addalarme")
    public void addalarme(@RequestBody RequestAddAlarme requestAddAlarme) {
         alarmeHeadService.addAlarmeHead(requestAddAlarme.getAlarmeHead(), requestAddAlarme.getAlarmes() , requestAddAlarme.getAlarmeActions());
    }
    @GetMapping("/getalarmes")
    public void getAlarme(){
        alarmeHeadService.getAlarmes();
    }
}
