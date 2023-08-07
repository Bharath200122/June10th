package com.xworkz.junk;

public interface Pasta extends Gobi{

	void looklikepipe();
	
	default void withCheese() {
		System.out.println("with cheese in Pasta");
	}
	
}
