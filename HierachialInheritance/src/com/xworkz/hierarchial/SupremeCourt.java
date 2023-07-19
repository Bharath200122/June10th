package com.xworkz.hierarchial;

public class SupremeCourt extends Court{
	
	void importantCase() {
		System.out.println("invoking importantCase in SupreCourt......");
	}

	
	@Override
	void justice() {
		System.out.println("invoking  justice in SupremeCourt.....");
		
	}
}
