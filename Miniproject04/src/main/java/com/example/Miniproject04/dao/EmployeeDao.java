package com.example.Miniproject04.dao;

import java.util.List;

import com.example.Miniproject04.model.Employee;

public interface EmployeeDao {
	
	void insertEmployee(Employee emp);
    List<Employee> getAllEmployees();

}
