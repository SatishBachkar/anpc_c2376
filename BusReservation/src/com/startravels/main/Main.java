package com.startravels.main;
import java.util.*;

import com.startravels.view.*;
import com.startravels.model.*;
import com.startravels.service.*;
import com.startravels.view.BusView;
public class Main {
	static Scanner sc = new Scanner(System.in);
	
	static void adminPanel() {
		System.out.println(" Welcome To Admin Panel");
		System.out.println("1.For Add New Bus");
		System.out.println("2.For Add New Bus Route");
		System.out.println("Enter your choice 1 or 2 :");
		int adminChoice =sc.nextInt();
		sc.nextLine();
		switch(adminChoice) {
		case 1 :
			boolean busDetails = BusView.addBus(); 
				System.out.println("Bus Added Successfully");
				System.exit(0);
			break;
			
		case 2 :
			boolean addRoute = BusView.addBusRoute(); 
				System.out.println("Bus Added Successfully");
				System.exit(0);
			break;
			
			default : System.out.println("Entered Invalid input");
			System.exit(0);
		}
	}
	

	     static void adminDetails() {
	    	 System.out.println("Enter User Name :");
	    	 int userName = sc.nextInt();
	    	 sc.nextLine();
	    	 System.out.println("Enter Password :");
	    	 int passWord = sc.nextInt();
	    	 sc.nextLine();
	    	 if(userName == 12345 && passWord == 12345) {
	    		 adminPanel();
	    	 }else {
				System.out.println("You Entered Wrong Details");
				System.exit(0);
			}
	     }
	
	     static void displaySubMenu() {
	    	 System.out.println("1.For Admin Panel :");
	    	 System.out.println("2.For Reservation seat :");
	    	 System.out.println("Enter Your Choice 1 or 2 :");
	    	 int subMenuchoice = sc.nextInt();
	    	 sc.nextLine();
	    	 switch(subMenuchoice) {
	    	 case 1 : adminDetails(); 
	    		 break;
	    	 case 2 : BusView.newPassenger();
	    	          BusView.ticketBooking();
	    		 break;
	    	 default :
	    		 System.out.println("You Entered Invalid Input");
	    	 }
	     }
	     
	    

	public static void main(String[] args) {
		do {
			System.out.println("Welcome To Star Travels");
			System.out.println("1.Start Application");
			System.out.println("2.Stop Application");
			System.out.println("enter your choice 1 or 2");
			int switchCase = sc.nextInt();
			sc.nextLine();
			switch (switchCase) {
			case 1 : System.out.println("Sub Menu:");
			       displaySubMenu();
				
				break;
			case 2 : System.exit(0);
			    break;
			    
			    default: System.out.println("Entered Invalid Input");
			    System.exit(0);
			    
	
			}
		}while(true);

	}

}
