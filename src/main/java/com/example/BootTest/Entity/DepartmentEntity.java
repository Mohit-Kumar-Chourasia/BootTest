package com.example.BootTest.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.text.DateFormat;

@Entity
public class DepartmentEntity {
    @Id
    private int id;
    private String title;
    private boolean isActive;
    private DateFormat createdAt;
}
