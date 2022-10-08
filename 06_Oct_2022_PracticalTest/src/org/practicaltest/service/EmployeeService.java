package org.practicaltest.service;

import org.practicaltest.dao.EmployeeDAO;
import org.practicaltest.model.Employee;

public class EmployeeService {
	
	public void addEmpoyeeDetails(Employee obj) {
		EmployeeDAO empdao = new EmployeeDAO();
		empdao.addEmpoyeeDetails(obj);
		
	}

}
