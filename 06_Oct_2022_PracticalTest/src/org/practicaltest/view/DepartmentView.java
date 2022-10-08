package org.practicaltest.view;

import java.util.Scanner;

import org.practicaltest.model.Department;
import org.practicaltest.service.DepartmentService;
import org.practicaltest.service.EmployeeDepartmentService;

public class DepartmentView {
	
	static Scanner sc = new Scanner(System.in);

	public void addDepartmentDetails() {
		DepartmentService deptSer = new DepartmentService();
		EmployeeDepartmentService empDeptObj = new EmployeeDepartmentService();
		System.out.println("Enter Department Id :");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Department Name :");
		String name = sc.nextLine();
	    Department deptobj = new Department(id,name);
	
	    deptSer.addDepartmentDetails(deptobj);
	    empDeptObj.departmentService(deptobj);
	}

}
