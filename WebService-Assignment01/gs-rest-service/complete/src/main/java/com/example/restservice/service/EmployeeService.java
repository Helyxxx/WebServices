package com.example.restservice.service;

import com.example.restservice.model.Address;
import com.example.restservice.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    public List<Employee> getAllEmployees() {

        Employee emp1 = new Employee(001, "Peter Paker",
                new Address(123, "Baker Street", "F0X 5J7"));
        Employee emp2 = new Employee(002, "Steven Strange",
                new Address(456, "Holiday Street", "PiL 3C9"));
        Employee emp3 = new Employee(003, "Gwen Stacy",
                new Address(789, "Silk Street", "T0M 1U5"));

        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        return employeeList;

    }

    public Employee getById(int id){
        for(Employee emp : employeeList){
            if (emp.getId() == id){
                return emp;
            }
        }
        return null;
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }
}