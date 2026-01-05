package com.example.BootTest.Repository;

import com.example.BootTest.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepostiory extends JpaRepository<EmployeeEntity,Long> {
}
