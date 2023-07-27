package com.xworkz.raj;

public class Vehicle {
	
	private int price;
	private String location;
	private int cc;
	private String color;
	private String fuelType;
	
	
	public Vehicle(int price, String location, int cC, String color, String fuelType) {
		super();
		this.price = price;
		this.location = location;
		this.cc = cc;
		this.color = color;
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "price "+price +"location "+ location + "cc"+cc +"color "+color +"fuelType "+fuelType;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			System.out.println("not null");
			
			if(obj instanceof Vehicle) {
				System.out.println(this);
				System.out.println(obj);
				
				Vehicle ref = (Vehicle)obj;
				
				System.out.println(ref);
				
				if(this.cc == ref.cc && this.color == ref.color && this.fuelType == ref.fuelType && this.location == ref.location) {
					return true;
					
				}
				else {
					return false;
				}
				
				
			}
			else {
				System.out.println("not an instance");
			}
			
		}
		else {
			System.out.println("is null");
		}
		
		return false;
	}
	
	

}
