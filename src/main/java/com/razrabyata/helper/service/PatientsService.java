package com.razrabyata.helper.service;

import com.razrabyata.helper.entity.Patients;
import com.razrabyata.helper.repository.PatientsRepositoryDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientsService {
    private final PatientsRepositoryDao patientsRepositoryDao;

    public Patients save(Patients patients) {
        return patientsRepositoryDao.save(patients);
    }

    public void deleteAllPatients() {
        patientsRepositoryDao.deleteAll();
    }

    public void deletePatients(String fullName) {
        patientsRepositoryDao.deleteByFullName(fullName);
    }

}

