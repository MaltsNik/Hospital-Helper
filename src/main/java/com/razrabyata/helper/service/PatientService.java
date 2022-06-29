package com.razrabyata.helper.service;

import com.razrabyata.helper.entity.Patient;
import com.razrabyata.helper.repository.PatientRepositoryDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepositoryDao patientRepositoryDao;

    public Iterable<Patient> getAll() {
        return patientRepositoryDao.findAll();
    }

    public Patient save(Patient patient) {
        return patientRepositoryDao.save(patient);
    }

    public void deleteAllPatients() {
        patientRepositoryDao.deleteAll();
    }

    public void deletePatients(String fullName) {
        patientRepositoryDao.deleteByFullName(fullName);
    }

}

