package com.xworkz.July_13th;

public class Car {

	String carName = "Lamborghini";
	String carType;
	CarCost carCost;
	String carProduceIn;
	
	
	Car(String carType){
		this.carType = carType;
		
	}
	void setcarCost(CarCost carCost) {
		this.carCost = carCost;
	
	}
	void display() {
		System.out.println("battery name: "+carName);
		System.out.println("battery life: "+carType);
		System.out.println("battery cost: "+carCost);
		System.out.println("battery produced in: "+carProduceIn);
	}
}


