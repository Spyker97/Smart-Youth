package com.yt.projectvuejs.controllers;


import com.yt.projectvuejs.models.Patient;
import com.yt.projectvuejs.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:5173")
@RequestMapping("/testjs")
public class PatientController {
    @Autowired
    private PatientService patientService;

    @GetMapping("/")
    public String Hello_Patient(){
        return "Hello_Patient";
    }

    @PostMapping("/add")
    public String addPatient (@RequestBody Patient patient){
        patientService.addPatient(patient);
        return "Patient Aded Succesfully..";
    }
    @RequestMapping("/patient/{id}")
    public Patient getPatientById(@PathVariable ("id") Long id){
        return patientService.getPatientById(id);
    }
    @RequestMapping("/patients")
    public List<Patient> getPatients(){
        return patientService.getPatients();
    }
    @PutMapping("/patient")
    public Patient updatePatient(@RequestBody Patient patient){
        return patientService.updatePatient(patient);
    }

    @DeleteMapping("/patient/{id}")
    public String deletePatient(@PathVariable Long id){
        patientService.deletePatient(id);
        return "Patient deleted";
    }
}
