package com.example.restservice.api;

import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;
import com.example.restservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    EmployeeService employeeService = new EmployeeService();

    //GET ALL
    @GetMapping("/employee")
    public List<Employee> getAllEmp(){
        return employeeService.getAllEmployees();
    }

    //GET by ID
    @GetMapping("/employee/{id}")
    public Employee getEmployeeId(@PathVariable int id){
        return employeeService.getById(id);
    }

    //POST
    @PostMapping("/employee")
    public Employee putEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return employee;
    }



}