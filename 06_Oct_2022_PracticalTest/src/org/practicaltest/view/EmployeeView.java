package org.practicaltest.view;

import java.util.Scanner;

import org.practicaltest.model.Employee;
import org.practicaltest.model.Gender;
import org.practicaltest.service.EmployeeDepartmentService;
import org.practicaltest.service.EmployeeService;

  public class EmployeeView {
	static Scanner sc = new Scanner(System.in);

	public void addEmployeeDetails() {
		EmployeeService empse = new EmployeeService();
		EmployeeDepartmentService empDeptObj = new EmployeeDepartmentService();
		System.out.println("Enter Employee Id :");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name :");
		String name = sc.nextLine();
		System.out.println("Enter Employee Gender :");
		String demo = sc.nextLine();
		Gender gender = Gender.valueOf(demo);
		Employee emp = new Employee(id,name,gender);
		
		empse.addEmpoyeeDetails(emp);
		empDeptObj.employeeService(emp);
		
	
	}


}
