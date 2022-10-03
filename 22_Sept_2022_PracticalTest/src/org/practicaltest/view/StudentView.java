package org.practicaltest.view;
import org.practicaltest.service.*;
import org.practicaltest.model.Student;
import java.util.Scanner;
import java.util.TreeSet;

import  org.practicaltest.model.*;

public class StudentView {
	static String id;
	static String name;
	static String dateAdd;
     
	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  TreeSet<org.practicaltest.model.Student> studentDetails= new TreeSet<>();
	  for(int i =1; i<=10;i++) {
		  System.out.println("enter id :");
		  id = sc.nextLine();
		  System.out.println("enter name :");
		  name = sc.nextLine();
		  System.out.println("enter date of addmission in format YYYY-MM-DD: ");
		  dateAdd = sc.nextLine();
		  StudentService.studentInfo(id,name,dateAdd,studentDetails);
		  
		    }
	  StudentService.printStudent(studentDetails);
	  sc.close();

	  
		
		
	}

}
