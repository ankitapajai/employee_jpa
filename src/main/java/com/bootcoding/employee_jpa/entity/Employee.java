package com.bootcoding.employee_jpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "employee2")

public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String e_name;
    private String e_address;
    private long e_phone;
}
