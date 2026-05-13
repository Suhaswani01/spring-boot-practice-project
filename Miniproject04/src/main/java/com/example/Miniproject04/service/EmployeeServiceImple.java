package com.example.Miniproject04.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Miniproject04.dao.EmployeeDao;
import com.example.Miniproject04.model.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService{

	@Autowired
	public EmployeeDao e1;
	
	@Override
	public void registerEmployee(Employee emp) {
		e1.insertEmployee(emp);
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		return e1.getAllEmployees();
	}

}
