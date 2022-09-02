package com.startravels.view;
import com.startravels.model.*;
import com.startravels.service.BusService;

import java.util.*;

public class BusView {
	
	static Scanner sc = new Scanner(System.in);

	public static boolean addBus() {
		boolean result = false;
		System.out.println("Enter BusId : ");
		int busId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter BusRegistraTion Number : ");
		int busRegNumber = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter BusType : ");
		String BusEnum  = sc.next();
		BusType busType = BusType.valueOf(BusEnum);
		System.out.println("Enter Numbers of Seats :");
		int numberOfSeats = sc.nextInt();
		sc.nextLine();
		
		Bus busobj = new Bus(busId,busRegNumber,busType,numberOfSeats);
		BusService.addbus(busobj);
		
		return result;
	}
	
	public static boolean addBusRoute() {
		boolean busRoute = false;
		System.out.println("Enter BusId : ");
		int busId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter RouteId : ");
		int routeId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Start City : ");
		String startCity = sc.nextLine();
		System.out.println("Enter Destination City :");
		String destinationCity = sc.nextLine();
		
		BusRoute busRouteobj = new BusRoute(busId,routeId,startCity,destinationCity);
		BusService.addBusRoute(busRouteobj);
		return busRoute;
	}
	
	public static boolean newPassenger() {
		boolean result = false;
		System.out.println("Enter Your Name : ");
		String passengerName = sc.nextLine();
		System.out.println("Enter Mobile Number :");
		long mobileNumber = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Address : ");
		String address = sc.nextLine();
		System.out.println("Enter Gender : ");
		String passGender = sc.nextLine();
		Gender passengerGender = Gender.valueOf(passGender);
		
		Passenger passobj =new  Passenger(passengerName,mobileNumber,address,passengerGender);
		BusService.newPassenger(passobj);
		return result;
	}
	
	public static boolean ticketBooking() {
		boolean result = false;
		System.out.println("Enter busId : ");
		int busId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter routeId : ");
		int routeId = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Number Of Seats : ");
		int numberOfSeats = sc.nextInt();
		sc.nextLine();
		if (numberOfSeats <= 50) {
			System.out.println("Seats are Available");
			System.out.println("Your Charges Are");
			for(int i= 0;  i<=numberOfSeats ; i++) {
				double ticket = numberOfSeats*100;
				System.out.println(ticket);
				System.exit(0);
			}
		}else {
			System.out.println("Seats Not Available");
			System.exit(0);
		}
		return result;
	}
}
