package com.razrabyata.helper.service;

import com.razrabyata.helper.entity.Patient;
import com.razrabyata.helper.repository.PatientRepositoryDao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GetAllPatient {
    private final PatientService patientService;
    private final PatientRepositoryDao patientRepositoryDao;

    public GetAllPatient(PatientService patientService, PatientRepositoryDao patientRepositoryDao) {
        this.patientService = patientService;
        this.patientRepositoryDao = patientRepositoryDao;
    }

    public List<Patient> getAllPatient() {
        Iterable<Patient> patients = patientService.getAll();
        List<Patient> allPatients = new ArrayList<>();
        for (Patient patient : patients) {
            Patient patient1 = new Patient(patient.getId(), patient.getFullName(),
                    patient.getBirthdate(), patient.getPhoneNumber(), patient.getAddress(),
                    patient.getInspectionDate(), patient.getFluоrogramDate());
            allPatients.add(patient1);
            patientRepositoryDao.save(patient1);
        }
        return allPatients;
    }
}
