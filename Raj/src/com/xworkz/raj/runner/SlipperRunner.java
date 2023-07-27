package com.xworkz.raj.runner;

import com.xworkz.raj.Slipper;

public class SlipperRunner {

	public static void main(String[] args) {
		
		Slipper ref = new Slipper(1000,"Sparx","black",true,false,"Hassan","rubber");
		
		Slipper ref2 = new Slipper(1000,"Sparx","black",true,false,"Hassan","rubber");
		
		Boolean c = ref.equals(ref2);
		
		System.out.println(c);

	}

}
