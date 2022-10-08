package org.practicaltest.dao;

import java.util.HashSet;

import org.practicaltest.model.Employee;

public class EmployeeDAO {
	static HashSet<Employee> hsEmployees = new HashSet<>();
    public void addEmpoyeeDetails(Employee objDAO) {
		hsEmployees.add(objDAO);
		System.out.println(hsEmployees);
		System.out.println("Data Added Successfully!");
	}

}
