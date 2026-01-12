package com.example.BootTest.controller;

import com.example.BootTest.Entity.DepartmentEntity;
import com.example.BootTest.Service.DepartmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    public DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService){
        this.departmentService=departmentService;
    }

    @GetMapping
    public ResponseEntity<List<DepartmentEntity>> getAllDepartments(){
        return departmentService.getDepartments();
    }

}
