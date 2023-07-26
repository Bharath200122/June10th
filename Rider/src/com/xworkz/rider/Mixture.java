package com.xworkz.rider;

public class Mixture {
	
	private int price;
	private String color;
	private String name;
	private String type;
	private int weight;
	
	
	public String getColor() {
		return color;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getType() {
		return type;
	}
	
	public int getWeight() {
		return weight;
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
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		
		return "color"+color+"name"+name+""+"price"+price+""+"weight"+weight+"type"+type;
	}

}
