package org.practicaltest.dao;

import java.util.HashMap;

import org.practicaltest.model.Department;
import org.practicaltest.model.Employee;

public class EmployeeDepartmentDAO {
	
	static HashMap<Employee, Department> hsHashMap = new HashMap<>();
    public void employeeDAO(Employee empObj) {
		hsHashMap.put(empObj, null);
	}
    public void departmentDAO(Department deptObj) {
		hsHashMap.put(null, deptObj);
	}
    public HashMap getHashMap() {
    	return hsHashMap;
    }

}

