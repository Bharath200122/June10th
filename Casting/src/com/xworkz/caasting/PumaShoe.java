package com.xworkz.caasting;

public class PumaShoe extends Shoe{
	String model;
	String origin;
	
	
	PumaShoe(String model,String origin,int price,ShoeSize size,ShoeColor color){
		super(price,size,color);
		
		this.model = model;
		this.origin = origin;
	}
	
	void print_info() {
		System.out.println("price is "+price);
		System.out.println("Shoe size  is "+size);
		System.out.println("shoe color is "+color);
		System.out.println("shoe model  is "+model);
		System.out.println("shoe origin is "+origin);
	}
}
