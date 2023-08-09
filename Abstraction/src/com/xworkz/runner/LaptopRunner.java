package com.xworkz.runner;

import com.xworkz.implement.ManishLap;

import com.xworkz.abstraction.*;

public class LaptopRunner {

	public static void main(String[] args) {
		
		Laptop lap = new LaptopImplements();
		
		ManishLap mani = new ManishLap(lap);
		
		mani.games();

	}

}
