package com.alex.demo.Controllers;

import com.alex.demo.Entities.Employee;
import com.alex.demo.Service.EmployeeService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    // classic mapping
    @GetMapping("/all")
    public List<Employee> list() {
        return employeeService.getAllEmployees();
    }
    // path variable mapping
    @GetMapping("/{job}")
    public List<Employee> listByJob(@PathVariable String job) {
        return employeeService.getEmployeesByJob(job);
    }
    // RequestParam
    @GetMapping("/jobless")
    public List<Employee> listByOk(@RequestParam String job) {
        return employeeService.getEmployeesByJob(job);
    }
    // RequestBody
}
