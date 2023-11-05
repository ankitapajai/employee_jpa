package com.bootcoding.employee_jpa.controller;

import com.bootcoding.employee_jpa.entity.Employee;
import com.bootcoding.employee_jpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    //-----insert employee-----
    @PostMapping("/employee")
    public Employee insertEmployee(@RequestBody Employee employee){
        return employeeService.insertEmployee(employee);
    }

    //------get all employees at a time ------
    @GetMapping("/employee")
    public List<Employee> getAllEmployee(){
       return employeeService.getAllEmployee();
    }

    //------get employee by id-----
    @GetMapping("/employee/{id}")
    public Optional getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    //-------delete records by id----
    @DeleteMapping("/employee/{id}")
    public void deleteEmployeeById(@PathVariable int id){
        employeeService.deleteEmployeeById(id);
    }
}
