package com.startravels.model;

import java.util.Objects;

public class Passenger {

	String passangerName ;
	long mobileNumber;
	String passengerAddress;
	Gender passengerGender;
	
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Passenger(String passangerName, long mobileNumber, String passengerAddress, Gender passengerGender) {
		super();
		this.passangerName = passangerName;
		this.mobileNumber = mobileNumber;
		this.passengerAddress = passengerAddress;
		this.passengerGender = passengerGender;
	}

	public String getPassangerName() {
		return passangerName;
	}

	public void setPassangerName(String passangerName) {
		this.passangerName = passangerName;
	}

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPassengerAddress() {
		return passengerAddress;
	}

	public void setPassengerAddress(String passengerAddress) {
		this.passengerAddress = passengerAddress;
	}

	public Gender getPassengerGender() {
		return passengerGender;
	}

	public void setPassengerGender(Gender passengerGender) {
		this.passengerGender = passengerGender;
	}

	@Override
	public String toString() {
		return "Passennger [passangerName=" + passangerName + ", mobileNumber=" + mobileNumber + ", passengerAddress="
				+ passengerAddress + ", passengerGender=" + passengerGender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(mobileNumber, passangerName, passengerAddress, passengerGender);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Passenger other = (Passenger) obj;
		return mobileNumber == other.mobileNumber && Objects.equals(passangerName, other.passangerName)
				&& Objects.equals(passengerAddress, other.passengerAddress) && passengerGender == other.passengerGender;
	}
	
	

}
