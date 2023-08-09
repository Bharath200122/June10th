package com.xworkz.runner;

import com.xworkz.implement.Raj;

import com.xworkz.abstraction.*;

public class ElevatorRunner {

	public static void main(String[] args) {
		
		Elevator elevator = new ElevatorImplents();
		
		Raj raj = new Raj(elevator);
		
		raj.lifting();

	}

}
