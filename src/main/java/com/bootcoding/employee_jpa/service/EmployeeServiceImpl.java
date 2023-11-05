package com.bootcoding.employee_jpa.service;

import com.bootcoding.employee_jpa.entity.Employee;
import com.bootcoding.employee_jpa.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeRepo employeeRepo;


    @Override
    public Employee insertEmployee(Employee employee) {
      return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional getEmployeeById(int id) {
        return employeeRepo.findById(id);
    }

    @Override
    public void deleteEmployeeById(int id) {
       employeeRepo.deleteById(id);
    }
}
