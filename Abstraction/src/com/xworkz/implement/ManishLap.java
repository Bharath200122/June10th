package com.xworkz.implement;

import com.xworkz.abstraction.Laptop;

public class ManishLap {
	
	private Laptop laptop;
	
	public ManishLap(Laptop laptop) {
		this.laptop = laptop;
	}
	
	public void games() {
		if(laptop!=null) {
			System.out.println("it is not null");
			this.laptop.display();
		}
		else {
			System.err.println("it contain null");
		}
	}

}
