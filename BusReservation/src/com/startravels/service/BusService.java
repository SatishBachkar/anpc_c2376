package com.startravels.service;
import com.startravels.DAO.BusDAO;
import com.startravels.model.Bus;
import com.startravels.model.*;
import com.startravels.view.*;

public class BusService {

	public static boolean addbus(Bus busobj) {
		boolean result = false;
		BusDAO.addbus(busobj);
         return result;
		
	}
	public static boolean addBusRoute(BusRoute busRoutObj) {
		boolean busRoute = false;
	    BusDAO.addBusRoute(busRoutObj);
		return busRoute;
	}
	public static boolean newPassenger(Passenger objAtService) {
		boolean result = false;
		BusDAO.newPassenger(objAtService);
		return result;
	}

	
}
