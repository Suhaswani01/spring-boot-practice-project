package com.example.miniproject03.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.miniproject03.Model.Student;

@Service
public class StudentImpl implements StudentService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addStudent(Student student) {
        String sql = "INSERT INTO student (name, age) VALUES (?, ?)";
        jdbcTemplate.update(sql, student.getName(), student.getAge());
        System.out.println("Student added: " + student.getName());
    }

    @Override
    public List<Student> getAllStudents() {
        String sql = "select * from student";
        return jdbcTemplate.query(sql, (rs, rowNum) ->
            new Student(
                rs.getInt("id"),
                rs.getString("name"),
                rs.getInt("age")
            )
        );
    }
}