package com.xworkz.July14th_AssociationTask;

public class Hotel {
	
	String hotelName;
	String hotelLocation;
	int noOfEmployees = 10;
	String foodType;
	
	Owner owner = new Owner ("Bharath",22,9749345676l);
	
	Hotel(String hotelName){
		this.hotelName = hotelName;
		
	}
	
	void sethotelLocation(String hotelLocation) {
		this.hotelLocation = hotelLocation;
	}
	
	void print_info() {
		System.out.println("hotelName : "+hotelName);
		System.out.println("hotelLocation : "+hotelLocation);
		System.out.println("noOfEmployees: "+noOfEmployees);
		System.out.println("foodType : "+foodType);
		
		
		this.owner.print_info();
	}
}
