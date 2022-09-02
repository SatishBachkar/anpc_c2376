package com.startravels.model;

import java.util.Objects;

public class Bus {

	private int busId;
	private int busRegNumber;
	private BusType busType;
	private int numberOfSeats;
	
	public Bus() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Bus(int busId, int busRegNumber, BusType busType, int numberOfSeats) {
		super();
		this.busId = busId;
		this.busRegNumber = busRegNumber;
		this.busType = busType;
		this.numberOfSeats = numberOfSeats;
	}


	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int getBusRegNumber() {
		return busRegNumber;
	}

	public void setBusRegNumber(int busRegNumber) {
		this.busRegNumber = busRegNumber;
	}

	public BusType getBusType() {
		return busType;
	}

	public void setBusType(BusType busType) {
		this.busType = busType;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	@Override
	public String toString() {
		return "Bus [busId=" + busId + ", busRegNumber=" + busRegNumber + ", busType=" + busType + ", numberOfSeats="
				+ numberOfSeats + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(busId, busRegNumber, busType, numberOfSeats);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bus other = (Bus) obj;
		return busId == other.busId && busRegNumber == other.busRegNumber && busType == other.busType
				&& numberOfSeats == other.numberOfSeats;
	}
	
	
	

	
	
	

}
