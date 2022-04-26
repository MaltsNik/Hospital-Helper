package com.razrabyata.helper.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Calendar;
import java.util.UUID;

@Table("patients")
@AllArgsConstructor
@Getter
public class Patients {
    @Id
    @Column
    private final UUID id;
    @Setter
    @Column
    private String fullName;
    @Setter
    @Column
    private int birthdate;
    @Setter
    @Column
    private String address;
    @Setter
    @Column
    private int number;
    @Setter
    @Column
    private Calendar inspectionDate;
    @Setter
    @Column
    private Calendar fluorogramDate;

}
