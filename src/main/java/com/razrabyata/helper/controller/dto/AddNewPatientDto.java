package com.razrabyata.helper.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;

@AllArgsConstructor
@Getter
public class AddNewPatientDto {
    private final String fullName;
    private final int birthdate;
    private final int phoneNumber;
    private final String address;
    private final LocalDate inspectionDate;
    private final LocalDate fluоrogramDate;
}
