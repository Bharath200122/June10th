package com.xworkz.raj.runner;

import com.xworkz.raj.*;

public class GroceryRunner {

	public static void main(String[] args) {
		
		Grocery ref = new Grocery(1000,"RR");
		
		Object ref1 = new Grocery(2000,"btm");
		
		System.out.println(ref.equals(ref1));

	}

}
