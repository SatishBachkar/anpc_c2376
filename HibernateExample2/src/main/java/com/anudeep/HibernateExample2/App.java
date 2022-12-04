package com.anudeep.HibernateExample2;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.anudeep.Hb.Entity.Employee;

public class App {

   static Scanner sc =  new Scanner(System.in);

    public static void main( String[] args ) {
       SessionFactory factory = new Configuration().configure().buildSessionFactory();
       
       Session session = factory.openSession();
       
       Transaction transact = session.beginTransaction();
       
       Employee emp = new Employee();
       emp.setEmpId(11);
       emp.setEmpAge(23);
       emp.setEmpname("Satish");
       emp.setEmpDepartment("Mechanical");
       session.save(emp);
       transact.commit();
       System.out.println("Table Created Successfully");
       session.close();
     
       
       
    }
}
