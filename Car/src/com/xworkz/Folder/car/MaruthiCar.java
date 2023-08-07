package com.xworkz.car;

public interface MaruthiCar {
	
	void speed();
	
	default void milage() {
		System.out.println("milage in MaruthiCar");
	}

}
