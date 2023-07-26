package com.xworkz.rider.runner;

import com.xworkz.rider.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		
		Helmet ref = new Helmet();
		
		System.out.println(ref);
		
		ref.setBrand("Vega");
		ref.setColor("black");
		ref.setPrice(1500);
		ref.setWithCamera("yes");
		ref.setWithOutNoise("No");
		
		
		System.out.println(ref.toString());

	}

}
