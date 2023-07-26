package com.xworkz.rider;

public class HeadSet {
	
	private int price;
	private String name;
	private String wired;
	private String wireless;
	private String color;
	
	
	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getWired() {
		return wired;
	}
	
	public String getWireless() {
		return wireless;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setWired(String wired) {
		this.wired = wired;
	}
	
	public void setWireless(String wireless) {
		this.wireless = wireless;
	}
	
	@Override
	public String toString() {
		
		return "name"+name+""+"wired"+wired+"wireless"+wireless+"price"+price+"color"+color;
	}

}
