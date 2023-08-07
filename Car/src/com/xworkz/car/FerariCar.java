package com.xworkz.car;

public interface FerariCar extends Lambhorgini{

	void price() ;
	
	default void color() {
		System.out.println("color in Ferari");
	}
	
	
}
