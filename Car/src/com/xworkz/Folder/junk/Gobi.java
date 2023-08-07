package com.xworkz.junk;

public interface Gobi {
	
	void price();
	
	default void taste() {
		System.out.println("taste in Gobi");
}
}
