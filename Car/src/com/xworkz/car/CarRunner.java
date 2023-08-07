package com.xworkz.car;

public class CarRunner {

	public static void main(String[] args) {
		
		FerariCar fr = new Car();
		fr.milage();
		fr.price();
		fr.speed();
		fr.type();
		fr.color();
		fr.size();
		
		Lambhorgini lmb = new Car();
		lmb.milage();
		lmb.speed();
		lmb.type();
		lmb.size();
		
		
		MaruthiCar mr = new Car();
		mr.milage();
		mr.speed();
		
		
		Car car = new Car();
		car.price();
		car.speed();
		car.type();
		car.milage();
		car.color();
		car.size();

	}

}
