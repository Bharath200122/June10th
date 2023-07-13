package com.xworkz.July_13th;

public class Battery {
	String batteryName = "Duresell";
	String batteryLife;
	BatteryCost batteryCost;
	String batteryProducedIn;
	
	
	Battery(String batteryLife){
		this.batteryLife = batteryLife;
		
	}
	void setbatteryCost(BatteryCost batteryCost) {
		this.batteryCost = batteryCost;
	
	}
	void display() {
		System.out.println("battery name: "+batteryName);
		System.out.println("battery life: "+batteryLife);
		System.out.println("battery cost: "+batteryCost);
		System.out.println("battery produced in: "+batteryProducedIn);
	}
}

