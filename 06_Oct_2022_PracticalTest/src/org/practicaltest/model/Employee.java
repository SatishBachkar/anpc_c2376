package org.practicaltest.model;

import java.util.Objects;

public class Employee {
	private int employeeId;
	private String employeeName;
	private Gender empGender;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, Gender empGender) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.empGender = empGender;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Gender getEmpGender() {
		return empGender;
	}

	public void setEmpGender(Gender empGender) {
		this.empGender = empGender;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", empGender=" + empGender
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empGender, employeeId, employeeName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return empGender == other.empGender && employeeId == other.employeeId
				&& Objects.equals(employeeName, other.employeeName);
	}
	
	
	
	
}