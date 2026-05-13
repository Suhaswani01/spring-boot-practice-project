package com.example.Miniproject04.model;

public class Employee {
	private int empno;
    private String ename;
    private double sal;
    private int deptno;
    
    
	public Employee(int empno, String ename, double sal, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.sal = sal;
		this.deptno = deptno;
	}
	public int getEmpno() {
		return empno;
	}
	public String getEname() {
		return ename;
	}
	public double getSal() {
		return sal;
	}
	public int getDeptno() {
		return deptno;
	}
	
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + ", sal=" + sal + ", deptno=" + deptno + "]";
	}
	
	

}
