package com.xworkz.junk;

public interface Panipuri extends Gobi{

	void withsoup();
	
	default void roundpuri() {
		System.out.println("roundpuri in Panipuri");
	}
	
}
