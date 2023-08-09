package com.xworkz.implement;

import com.xworkz.abstraction.PrintingMachine;

public class ViratKohli {
	
	private PrintingMachine printmachine;
	

	
	
	public ViratKohli(PrintingMachine printmachine){
		this.printmachine = printmachine;
	}
	
	public void current() {
		if(printmachine!=null) {
			System.out.println("its is doesnot contain null values");
			this.printmachine.print();
		}
		else {
			System.err.println("its contain null values");
		}
	}

}
