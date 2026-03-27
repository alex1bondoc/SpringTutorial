package com.alex.demo.Service;

import com.alex.demo.Entities.Employee;
import com.alex.demo.Repositories.EmployeeRepository;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeRepository employeeRepository;
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    public List<Employee> getEmployeesByJob(String Job) {
        return employeeRepository.findByJob(Job);
    }
}
