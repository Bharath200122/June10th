package com.xworkz.rider.runner;

import com.xworkz.rider.Tap;

public class TapRunner {

	public static void main(String[] args) {
		
		Tap ref = new Tap();
		
		System.out.println(ref);
		
		
		ref.setBrand("jaguar");
		ref.setColor("black");
		ref.setNoOfTaps("4");
		ref.setPrice(400);
		ref.setType("plastic");
		
		
		System.out.println(ref.toString());

	}

}
