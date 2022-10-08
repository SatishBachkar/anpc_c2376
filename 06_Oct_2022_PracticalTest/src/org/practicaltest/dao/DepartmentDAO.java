package org.practicaltest.dao;

import java.util.HashSet;

import org.practicaltest.model.Department;

public class DepartmentDAO {
	static HashSet<Department> hsDepartment = new HashSet<>();
	 public void addDepartmentDetails(Department objdao) {
		 hsDepartment.add(objdao);
			System.out.println(hsDepartment);
			System.out.println("Data Added Successfully!");
		}

}
