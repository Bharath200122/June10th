package com.xworkz.rider.runner;

import com.xworkz.rider.Dosa;

public class DosaRunner {

	public static void main(String[] args) {
		
		Dosa dosa = new Dosa();
		
		String name = dosa.getColor();
		
		
		
		System.out.println(dosa);
		
		
		
		dosa.setcolor("white");
		dosa.setprice(200);
		dosa.settype("masala");
		dosa.setplace("RR");
		dosa.setquantity("gud");
		
		System.out.println(dosa.toString());
		

	}

}
