package com.example.dockerdemo.controller;


import com.example.dockerdemo.entity.Employee;
import com.example.dockerdemo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/docker")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @GetMapping("/test")
    @ResponseBody
    public String testService(){

        return "hello how are you?";
    }
    @GetMapping("/all")
    public ResponseEntity<?> fetchAllEmployee(){

        return  new ResponseEntity<List<Employee>>(employeeService.getAllEmployee(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<?> addEmployee(@RequestBody Employee e){
        return new ResponseEntity<Employee>(employeeService.addEmployee(e), HttpStatus.OK);
    }


}
