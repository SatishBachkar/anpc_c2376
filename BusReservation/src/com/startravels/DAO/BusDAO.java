package com.startravels.DAO;
import com.startravels.model.*;
import com.startravels.service.*;

public class BusDAO {
	public static Bus busArray[]= new Bus[10];
	public static BusRoute busRouteArray[]= new BusRoute[10];
	public static Passenger passengerArray[]= new Passenger[50];

	public static boolean addbus(Bus busobj) {
		boolean result = false ;
		 for(int i=0; i<busArray.length; i++) {
   		  if(busArray[i]==null) {
   			  busArray[i]=busobj;
   			  result = true;
   			  break;
   		  }
   	  }
   	  System.out.println(busArray[0]);
		return result;
		
	}
	
	public static boolean addBusRoute(BusRoute busRouteObj) {
		boolean result = false;
		for(int j=0; j<busRouteArray.length; j++) {
	   		  if(busRouteArray[j]==null) {
				busRouteArray[j]= busRouteObj;
	   			  result = true;
	   			  break;
	   		  }
	   	  }
	   	  System.out.println(busRouteArray[0]);
			return result;
	}
    public static boolean newPassenger(Passenger objAtDAO) {
    	boolean result = false;
    	for(int i=0; i<passengerArray.length; i++) {
	   		  if(passengerArray[i]==null) {
				passengerArray[i]= objAtDAO;
	   			  result = true;
	   			  break;
	   		  }
	   	  }
    	  System.out.println("Your Details");
	   	  System.out.println(passengerArray[0]);
			return result;
    }
	
}
