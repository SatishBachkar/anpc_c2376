package com.spring.SpringEx.entity;

public class Company {

	private String name;
	private String location;
	private String headOffice;
	private int year;
	private Employee empl; //aggression
	
	
	public Company(String name, String location, String headOffice, int year, Employee empl) {
		super();
		this.name = name;
		this.location = location;
		this.headOffice = headOffice;
		this.year = year;
		this.empl = empl;
	}



	public void display1() {
		System.out.println(name +" " +location+ " "+headOffice+" "+ year);
		System.out.println(empl);
	}
	
	
	
	
}
