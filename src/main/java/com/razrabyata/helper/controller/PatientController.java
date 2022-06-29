package com.razrabyata.helper.controller;

import com.razrabyata.helper.entity.Patient;
import com.razrabyata.helper.service.GetAllPatient;
import com.razrabyata.helper.service.PatientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class PatientController {
    private PatientService patientService;
    private GetAllPatient getAllPatient;

    public PatientController(PatientService patientService, GetAllPatient getAllPatient) {
        this.patientService = patientService;
        this.getAllPatient = getAllPatient;
    }

    @GetMapping("/all")
    String getAll(Model model) {
        List<Patient> patients = getAllPatient.getAllPatient();
    }
}
