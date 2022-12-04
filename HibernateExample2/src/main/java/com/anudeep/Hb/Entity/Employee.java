package com.anudeep.Hb.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EmployeeData")
public class Employee {
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column(length = 2, name = "EmployeeAge",nullable = false)
	private int empAge;
	@Column(length = 30, name = "EmployeeName", nullable = false, unique = true)
	private String empname;
	@Column (length = 30, name = "EmployeeDepartment", nullable = false)
	private String empDepartment;
	
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpDepartment() {
		return empDepartment;
	}
	public void setEmpDepartment(String empDepartment) {
		this.empDepartment = empDepartment;
	}
	
	

}
