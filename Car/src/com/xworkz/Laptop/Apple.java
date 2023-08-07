package com.xworkz.Laptop;

public interface Apple extends Hp{
	
	void macBook();
	
	default void security() {
		System.out.println("security in Apple");
	}

}
