package com.xworkz.rider.runner;

import com.xworkz.rider.Grinder;

public class GrinderRunner {

	public static void main(String[] args) {
		
		Grinder ref = new Grinder();
		
		System.out.println(ref);
		
		ref.setName("prestige");
		ref.setPrice(2000);
		ref.setSpeed("300rpm");
		ref.setType("hand");
		ref.setWeight("10kg");
		
		System.out.println(ref.toString());
		

	}

}
