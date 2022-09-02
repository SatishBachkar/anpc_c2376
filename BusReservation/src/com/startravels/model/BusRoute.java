package com.startravels.model;

import java.util.Objects;

public class BusRoute {

	private int busId;
	private int routeId;
	private String busStartCity;
	private String busDestinationCity;
	
	
	
	public BusRoute() {
		super();

	}

	public BusRoute(int busId, int routeId, String busStartCity, String busDestinationCity) {
		super();
		this.busId = busId;
		this.routeId = routeId;
		this.busStartCity = busStartCity;
		this.busDestinationCity = busDestinationCity;
	}

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int getRouteId() {
		return routeId;
	}

	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}

	public String getBusStartCity() {
		return busStartCity;
	}

	public void setBusStartCity(String busStartCity) {
		this.busStartCity = busStartCity;
	}

	public String getBusDestinationCity() {
		return busDestinationCity;
	}

	public void setBusDestinationCity(String busDestinationCity) {
		this.busDestinationCity = busDestinationCity;
	}

	@Override
	public String toString() {
		return "BusRoute [busId=" + busId + ", routeId=" + routeId + ", busStartCity=" + busStartCity
				+ ", busDestinationCity=" + busDestinationCity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(busDestinationCity, busId, busStartCity, routeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BusRoute other = (BusRoute) obj;
		return Objects.equals(busDestinationCity, other.busDestinationCity) && busId == other.busId
				&& Objects.equals(busStartCity, other.busStartCity) && routeId == other.routeId;
	}
	
	
	
	

}
