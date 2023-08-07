package com.xworkz.Laptop;

public class LaptopRunner {

	public static void main(String[] args) {
		
	Apple ap = new LaptopImplements();
	ap.macBook();
	ap.price();
	ap.ram();
	ap.security();
	
	Acer ac = new LaptopImplements();
	ac.degree();
	ac.display();
	ac.price();
	ac.ram();
	
	Hp hp = new LaptopImplements();
	hp.price();
	hp.ram();
	
	LaptopImplements lap = new LaptopImplements();
	lap.degree();
	lap.display();
	lap.macBook();
	lap.price();
	lap.ram();
	lap.security();
		
		

	}

}
