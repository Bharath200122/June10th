package com.xworkz.implement;

import com.xworkz.abstraction.WashingMachine;

public class RathodWash {
	
	private WashingMachine wash;
	
	public RathodWash(WashingMachine wash) {
		this.wash = wash;
	}
	
	public void machine() {
		if(wash!=null) {
			System.out.println("machine in RathodWash");
			this.wash.dry();
		}
		else {
			System.out.println("its contain null values");
		}
	}

}
