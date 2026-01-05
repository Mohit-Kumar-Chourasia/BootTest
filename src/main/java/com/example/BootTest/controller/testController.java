package com.example.BootTest.controller;

import com.example.BootTest.Entity.EmployeeEntity;
import com.example.BootTest.Repository.EmployeeRepostiory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app")
public class testController {

    private final EmployeeRepostiory employeeRepostiory;

    public testController(EmployeeRepostiory employeeRepostiory) {
        this.employeeRepostiory = employeeRepostiory;
    }

    @GetMapping("/{id}")
    public EmployeeEntity getEmployee(@PathVariable Long id){
        return employeeRepostiory.findById(id).orElse(null);
    }

    @GetMapping
    public List<EmployeeEntity> getAllEmployees(){
        return employeeRepostiory.findAll();
    }

    @PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeRepostiory.save(employeeEntity);
    }


    @GetMapping("/t1/{id}")
    public String getTest(@PathVariable Integer id){
       return "Project running successfully "+id ;
    }
}
