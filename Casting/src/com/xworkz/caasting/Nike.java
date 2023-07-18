package com.xworkz.caasting;

public class Nike extends Shoe{
	String nikeCEO;
	String brandAmbassador;
	
	
	Nike(String nikeCEO,String brandAmbassador,int price,ShoeSize size,ShoeColor color){
		super(price,size,color);
		this.brandAmbassador = brandAmbassador;
		this.nikeCEO = nikeCEO;
		
	}
	
	void print_info() {
		
		System.out.println("price is "+price);
		System.out.println("Shoe size  is "+size);
		System.out.println("shoe color is "+color);
		System.out.println("nike shoe brandAmbassador  is "+brandAmbassador);
		System.out.println("nikeshoe ceo  is "+nikeCEO);
		
	}
}
