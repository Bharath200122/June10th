package com.xworkz.raj;

public class Gold {
	
	private String address;
	private int price;
	private String design;
	private int time;
	
	
	public Gold(String address, int price, String design, int time) {
		super();
		this.address = address;
		this.price = price;
		this.design = design;
		this.time = time;
	}
	
	

	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking address price and design and time in gold");
		if(obj!=null) {
			System.out.println("not null");
			
			if(obj instanceof Gold) {
				System.out.println(this);
				System.out.println(obj);
				
				Gold ref = (Gold)obj;
				
				System.out.println(ref);
				
				
				if(this.address == ref.address && this.design == ref.design && this.price == ref.price && this.time == ref.time) {
					return true;
				}
				
				else {
					System.out.println("hey macha");
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
	
	
	@Override
	public String toString() {
		return "address"+ address + "price" + price + "design " + design + "time " + time ; 
	}
	
	

}
