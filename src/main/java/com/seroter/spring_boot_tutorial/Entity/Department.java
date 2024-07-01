package com.seroter.spring_boot_tutorial.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

    // primary key for DB
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long departmentID;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;


}
