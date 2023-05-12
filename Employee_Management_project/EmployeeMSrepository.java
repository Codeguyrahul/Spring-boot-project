package com.rahul.springboot.project.springboot.EmployeeManagementSystem.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.rahul.springboot.project.springboot.EmployeeManagementSystem.project.model.Employee;

@Repository
public interface EmployeeMSrepository extends JpaRepository<Employee,Long>{

}