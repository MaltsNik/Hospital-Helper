package com.razrabyata.helper.controller.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class CheckPatientDto {
    private final String fullName;
    private final int birthdate;
    private final int phoneNumber;
}
