package com.xworkz.rider;

public class Tap {

	private int price ;
	private String type;
	private String brand;
	private String color;
	private String noOfTaps;
	
	
	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getNoOfTaps() {
		return noOfTaps;
	} 
	
	public int getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setNoOfTaps(String noOfTaps) {
		this.noOfTaps = noOfTaps;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	
	
	@Override
	public String toString() {
		
		return "brand"+brand+""+"color"+color+""+"price"+price+"type"+type+"noOfTaps"+noOfTaps;
	}
}
