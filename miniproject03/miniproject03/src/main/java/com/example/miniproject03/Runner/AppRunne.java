package com.example.miniproject03.Runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.miniproject03.Model.Student;
import com.example.miniproject03.Service.StudentService;

@Component
public class AppRunne implements CommandLineRunner{

	@Autowired
    private StudentService studentService;

    @Override
    public void run(String... args) throws Exception {
        
        
        studentService.addStudent(new Student(0, "Rahul", 20));
        studentService.addStudent(new Student(0, "Priya", 22));
        studentService.addStudent(new Student(0, "Amit", 21));

       
        System.out.println("\n=== all Students ===");
        List<Student> students = studentService.getAllStudents();
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("====================");
    }
}


