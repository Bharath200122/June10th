package com.xworkz.Laptop;

public interface Acer extends Hp {

	void degree();
	
	default void display() {
		System.out.println("display in Acer");
	}
	
}
