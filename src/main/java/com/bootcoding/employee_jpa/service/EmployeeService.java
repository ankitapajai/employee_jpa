package com.bootcoding.employee_jpa.service;

import com.bootcoding.employee_jpa.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee insertEmployee(Employee employee);

    List<Employee> getAllEmployee();

    Optional getEmployeeById(int id);

    void deleteEmployeeById(int id);

}
