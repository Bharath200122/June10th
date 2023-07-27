package com.xworkz.raj.runner;

import com.xworkz.raj.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		
		Vehicle ref = new Vehicle(200000,"BTM",200,"black","petrol");
		
		Vehicle ref2 = new Vehicle(200000,"BTM",200,"black","petrol");
		
		System.out.println(ref.equals(ref2));

	}

}
