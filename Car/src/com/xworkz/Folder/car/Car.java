package com.xworkz.car;

public class Car implements FerariCar,Lambhorgini,MaruthiCar{

	@Override
	public void speed() {
		System.out.println("speed in Car");
		
	}

	@Override
	public void type() {
		System.out.println("type in Car");
		
	}

	@Override
	public void price() {
		System.out.println("price in Car");
		
	}
	
	@Override
	public void milage() {
		System.out.println("milage in Car");
		FerariCar.super.milage();
	}
	
	@Override
	public void size() {
		// TODO Auto-generated method stub
		FerariCar.super.size();
	}
	
	@Override
	public void color() {
		// TODO Auto-generated method stub
		FerariCar.super.color();
	}

}
