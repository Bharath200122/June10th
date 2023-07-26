package com.xworkz.rider.runner;

import com.xworkz.rider.Calculator;

public class CalculatorRunner {

	public static void main(String[] args) {
		
		
		Calculator ref = new Calculator();
		
		System.out.println(ref);
		
		ref.setBatteryLife("2year");
		ref.setColor("black");
		ref.setPrice(1000);
		ref.setName("Casio");
		ref.setType("FX500");
		
		System.out.println(ref.toString());

	}

}
