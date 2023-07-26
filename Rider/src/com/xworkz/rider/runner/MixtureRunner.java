package com.xworkz.rider.runner;

import com.xworkz.rider.Mixture;

public class MixtureRunner {

	public static void main(String[] args) {
		
		
		Mixture ref = new Mixture();
		
		System.out.println(ref);
		
		ref.setColor("red");
		ref.setName("MTR");
		ref.setPrice(100);
		ref.setType("spicy");
		ref.setWeight(1);
		
		System.out.println(ref.toString());

	}

}
