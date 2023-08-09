package com.xworkz.runner;

import com.xworkz.abstraction.*;

import com.xworkz.implement.*;

public class WaterRunner {

	public static void main(String[] args) {
		
		WaterPurify water1 = new Water();
		
		KapilWater kapil = new KapilWater(water1);
		kapil.water();

	}

}
