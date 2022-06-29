package com.razrabyata.helper.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table("patients")
@AllArgsConstructor
@Getter
public class Patient {
    @Id
    @Column("id")
    private final int id;
    @Setter
    @Column("fullName")
    private final String fullName;
    @Setter
    @Column("birthdate")
    private final int birthdate;
    @Setter
    @Column("phoneNumber")
    private final int phoneNumber;
    @Setter
    @Column("address")
    private final String address;
    @Setter
    @Column("inspectionDate")
    private final LocalDate inspectionDate;
    @Setter
    @Column("fluorogramDate")
    private final LocalDate fluоrogramDate;

}
