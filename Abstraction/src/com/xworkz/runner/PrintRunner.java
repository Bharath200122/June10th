package com.xworkz.runner;

import com.xworkz.implement.ViratKohli;

import com.xworkz.abstraction.*;

public class PrintRunner {

	public static void main(String[] args) {
		
		PrintingMachine print = new PrintSheet();
		
		ViratKohli virat = new ViratKohli(print);
		virat.current();
		
		
		

	}

}
