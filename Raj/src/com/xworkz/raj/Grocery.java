package com.xworkz.raj;

public class Grocery {
	
	private int price;
	private String address;

	public Grocery(int price, String address) {
		super();
		this.price = price;
		this.address = address;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking equals");
		if(obj!=null) {
			System.out.println("is not null");
			
			if(obj instanceof Grocery) {
				
				System.out.println(this);
				System.out.println(obj);
				
				
				
				Grocery cast = (Grocery)obj ;
				
				
				if(this.address==cast.address && this.price == cast.price) {
				
				System.out.println(cast);
				
				return true;
				}
				else {
					System.out.println("hello");
					return false;
				}
				
			}
			else {
				System.out.println("it doesnt contain any property");
			}
		}
		else {
			System.out.println("Is null");
			
		}
	return false;}
	
	@Override
	public String toString() {
		
		return "price is " + price+"" + "address "+address;
	}
	
	


}
