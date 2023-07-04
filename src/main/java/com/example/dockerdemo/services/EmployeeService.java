package com.example.dockerdemo.services;


import com.example.dockerdemo.entity.Employee;
import com.example.dockerdemo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getAllEmployee() {

        return employeeRepo.findAll();
    }

    public Employee addEmployee(Employee e) {

         return employeeRepo.save(e);
    }
}
