package com.xworkz.abstraction;

public class Washing implements WashingMachine{

	@Override
	public Boolean dry() {
		System.out.println("dry in Washing");
		return null;
	}

}
