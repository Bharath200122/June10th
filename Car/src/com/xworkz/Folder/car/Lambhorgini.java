package com.xworkz.car;

public interface Lambhorgini extends MaruthiCar{
	
	void type();
	
	default void size() {
		System.out.println("size in Lambhorgini");
	}

}
