package com.xworkz.Laptop;

public interface Hp {
	
	void price();
	
	default void ram() {
		System.out.println("ram in Hp");
	}

}
