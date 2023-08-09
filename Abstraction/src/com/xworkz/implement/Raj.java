package com.xworkz.implement;

import com.xworkz.abstraction.Elevator;

public class Raj {
	
	private Elevator elevator;
	
	public Raj(Elevator elevator){
		this.elevator = elevator;
	}
	
	public void lifting() {
		if(elevator!=null) {
			System.out.println("it is not null");
			this.elevator.carryLaguage();
		}
		else {
			System.out.println("is null");
		}
	}

}
