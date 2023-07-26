package com.xworkz.rider;

public class Grinder {

	private int price;
	private String speed;
	private String type;
	private String weight;
	private String name;
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getSpeed() {
		return speed;
	}
	
	public String getType() {
		return type;
	}
	
	public String getWeight() {
		return weight;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		
		return "name"+name+""+"price"+price+""+"speed"+speed+""+"type"+type+""+"weight"+weight;
	}
}
