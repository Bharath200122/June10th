package com.xworkz.rider.runner;

import com.xworkz.rider.Satellite;

public class SatelliteRunner {

	public static void main(String[] args) {
		
		Satellite ref = new Satellite();
		
		System.out.println(ref);
		
		ref.setEngine("Vikas");
		ref.setMadeupOf("Aluminium");
		ref.setPrice(60000000);
		ref.setName("Chandrayan3");
		ref.setSpeedPerMinute("720 km per sec");
		
		
		System.out.println(ref.toString());
	}

}
