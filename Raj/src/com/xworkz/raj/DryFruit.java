package com.xworkz.raj;

public class DryFruit {
	
	private int price;
	private String location;
	private String name;
	private String quantity;
	private int weight;
	private String color;
	
	public DryFruit(int price, String location, String name, String quantity, int weight, String color) {
		super();
		this.price = price;
		this.location = location;
		this.name = name;
		this.quantity = quantity;
		this.weight = weight;
		this.color = color;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking");
		
		if(obj!=null) {
			System.out.println("not null");
			
			if(obj instanceof DryFruit) {
				System.out.println(this);
				System.out.println(obj);
				
				DryFruit ref = (DryFruit)obj;
				System.out.println(ref);
				
				if(this.color == ref.color && this.location == ref.location && this.name == ref.name && this.price == ref.price && this.weight == ref.weight && this.quantity == ref.quantity) {
					return true;
				}
			} 
			
			
			else {
				System.out.println("");
			}
			
		}
		else {
			System.out.println("");
		}
		
		
		return false;
	}
	
	
	

}
