package com.xworkz.implement;

import com.xworkz.abstraction.*;

public class Kohli {
	
	private SmartWatch smart;
	
	public Kohli(SmartWatch smart){
		this.smart= smart;
	}
	
	public void hours() {
		if(smart!=null) {
			System.out.println("hours in Kohli");
			this.smart.showTime();
		}
		else {
			System.err.println("its null");
		}
	}

	

}
