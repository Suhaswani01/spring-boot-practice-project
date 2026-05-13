package com.example.Miniproject04.runner;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.Miniproject04.model.Employee;
import com.example.Miniproject04.service.EmployeeService;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private EmployeeService employeeService;

    @Override
    public void run(String... args) throws Exception {

        
        employeeService.registerEmployee(new Employee(0, "Rahul", 50000, 10));
        employeeService.registerEmployee(new Employee(0, "Priya", 60000, 20));
        employeeService.registerEmployee(new Employee(0, "Amit",  55000, 10));

        
        System.out.println("\n=== All Employees ===");
        List<Employee> list = employeeService.getAllEmployees();
        for (Employee e : list) {
            System.out.println(e);
        }
        System.out.println("=====================");
    }
}