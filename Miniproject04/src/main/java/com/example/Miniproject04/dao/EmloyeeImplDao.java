package com.example.Miniproject04.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.Miniproject04.model.Employee;


@Repository
public class EmloyeeImplDao implements EmployeeDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void insertEmployee(Employee emp) {

        String sql =
            "INSERT INTO employee (ENAME, SAL, DEPTNO) VALUES (?, ?, ?)";

        jdbcTemplate.update(
            sql,
            emp.getEname(),
            emp.getSal(),
            emp.getDeptno()
        );

        System.out.println("Employee inserted: " + emp.getEname());
    }

    @Override
    public List<Employee> getAllEmployees() {

        String sql = "SELECT * FROM employee";

        return jdbcTemplate.query(sql, (rs, rowNum) ->
            new Employee(
                rs.getInt("EMPNO"),
                rs.getString("ENAME"),
                rs.getDouble("SAL"),
                rs.getInt("DEPTNO")
            )
        );
    }
}