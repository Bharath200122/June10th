package com.xworkz.runner;

import com.xworkz.implement.RathodWash;

import com.xworkz.abstraction.*;

public class WashingRunner {

	public static void main(String[] args) {
		
		WashingMachine wash1 = new Washing();
		
		RathodWash ra = new RathodWash(wash1);
		ra.machine();

	}

}
