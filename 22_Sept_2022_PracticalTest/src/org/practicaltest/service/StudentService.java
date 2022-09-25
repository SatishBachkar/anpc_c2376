package org.practicaltest.service;
import org.practicaltest.view.*;
import java.time.LocalDate;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.practicaltest.model.Student;


public class StudentService {

	
	public static void printStudent(TreeSet<Student>ts) {
		Iterator<Student> itr = ts.iterator();
		Student student =null;
		try {
			while((student =itr.next())!= null) {
				System.out.println(student);
		}
		}catch(NoSuchElementException e) {
			System.out.println("done");
		}
		
	}
	public static void studentInfo(String id,String name,String date,TreeSet<Student>stdInfo ) {
		LocalDate dop = LocalDate.parse(date);
		
		Student student = new Student(id,name,date);
		stdInfo.add(student);
		System.out.println("Student Added SuccessFully");
		
	}

}
