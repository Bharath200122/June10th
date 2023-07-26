package com.xworkz.rider;

public class Helmet {
	
	private int price;
	private String brand;
	private String color;
	private String withOutNoise;
	private String withCamera;

	public String getBrand() {
		return brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getWithCamera() {
		return withCamera;
	}
	
	public String getWithOutNoise() {
		return withOutNoise;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setWithCamera(String withCamera) {
		this.withCamera = withCamera;
	}
	
	public void setWithOutNoise(String withOutNoise) {
		this.withOutNoise = withOutNoise;
	}
	
	@Override
	public String toString() {
		
		return "color"+color+""+"withOutNoise"+withOutNoise+""+"withCamera"+""+withCamera+""+"price"+price+"brand"+brand;
	}
}
