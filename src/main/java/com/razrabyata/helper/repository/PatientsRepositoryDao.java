package com.razrabyata.helper.repository;

import com.razrabyata.helper.entity.Patients;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.UUID;

public interface PatientsRepositoryDao extends CrudRepository<Patients, UUID> {
    @Modifying
    @Query("DELETE FROM patients WHERE fullName=:fullName")
    void deleteByFullName(@Param("fullName") String fullName);
}
