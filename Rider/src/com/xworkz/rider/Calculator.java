package com.xworkz.rider;

public class Calculator {
	
	private int price;
	private String type;
	private String name;
	private String color;
	private String batteryLife;
	
	
	
	public int getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	
	}
	public String getName() {
		return name;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getBatteryLife() {
		return batteryLife;
	}
	
	public void setPrice(int price) {
		this.price = price; 
	}
	
	public void setBatteryLife(String batteryLife) {
		this.batteryLife = batteryLife;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		
		return "name "+name+""+"color"+color+""+"batteryLife"+""+batteryLife+""+"type"+type+""+"price"+price;
	}
}
