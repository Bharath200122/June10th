package com.xworkz.rider;

public class Dosa {

	private int price;
	private String type;
	private String place;
	private String quantity;
	private String color;
	
	
	

	
	public void setprice(int price) {
		this.price = price;
	}
	
	public void setcolor(String color) {
		this.color = color;
	}
	
	public void setplace(String place) {
		this.place = place;
	}
	
	public void setquantity(String quantity) {
		this.quantity = quantity;
	}
	
	public void settype(String type) {
		this.type = type;
	}
	
	
	public int getprice(){
		
		return price ;
		
	}
	
	public String getColor(){
		
		return color ;
		
	}
	
public String getplace(){
		
		return place ;
		
	}

public String getquantity(){
	
	return quantity ;
	
}

public String gettype(){
	
	return type ;
	
}

	

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Price " +this.price +" "+"color " +this.color+"" +"place " +this.place+"" + "quantity "+ this.quantity + ""+"type " +this.type ;
			
}
	
	
	
}
