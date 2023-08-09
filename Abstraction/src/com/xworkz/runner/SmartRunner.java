package com.xworkz.runner;

import com.xworkz.implement.Kohli;

import com.xworkz.abstraction.*;

public class SmartRunner {

	public static void main(String[] args) {
		
		
		SmartWatch smart = new Time();
		
		Kohli ko = new Kohli(smart);
		ko.hours();

	}

}
