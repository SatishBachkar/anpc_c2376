package org.practicaltest.main;
import java.util.Scanner;

import org.practicaltest.view.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static EmployeeView emp = new EmployeeView();
	static DepartmentView dept = new DepartmentView();
	
	public void displaySubMenu() {
		System.out.println("For Employee Details Enter 1");
		System.out.println("For Department Details Enter 2");
		System.out.println("Enter Your Choice 1 or 2 :");
		int choice = sc.nextInt();
		sc.nextLine();
		switch (choice) {
		case 1 : emp.addEmployeeDetails();
			break;
		case 2 : dept.addDepartmentDetails();
			break;
		case 3 : 
			break;
		default : 
			System.out.println("Input Invalid!");
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.displaySubMenu();
		
		
	}

}
