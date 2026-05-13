package com.example.Miniproject04.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Miniproject04.model.Employee;


public interface EmployeeService {
	
	void registerEmployee(Employee emp);
    List<Employee> getAllEmployees();

}
