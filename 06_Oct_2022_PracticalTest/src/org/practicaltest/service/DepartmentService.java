package org.practicaltest.service;

import org.practicaltest.dao.DepartmentDAO;
import org.practicaltest.model.Department;
import org.practicaltest.model.Employee;

public class DepartmentService {
	
   public void addDepartmentDetails(Department obj) {
	   DepartmentDAO deptDAO = new DepartmentDAO();
	   deptDAO.addDepartmentDetails(obj);
		
	}

}
