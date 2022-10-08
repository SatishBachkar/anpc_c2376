package org.practicaltest.service;

import org.practicaltest.dao.EmployeeDepartmentDAO;
import org.practicaltest.model.Department;
import org.practicaltest.model.Employee;

public class EmployeeDepartmentService {
	EmployeeDepartmentDAO empDeptObj = new EmployeeDepartmentDAO();
	
	public void employeeService(Employee empObj) {
		empDeptObj.employeeDAO(empObj);
		
	}
    public void departmentService(Department deptObj) {
		empDeptObj.departmentDAO(deptObj);
	}

}
