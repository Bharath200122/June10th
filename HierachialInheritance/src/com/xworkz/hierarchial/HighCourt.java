package com.xworkz.hierarchial;

public class HighCourt extends SupremeCourt {
	
	void criminalCase() {
		System.out.println("invoking criminalCase in HighCourt......");
	}
	
	void forgery() {
		System.out.println("invoking forgeryCase in HighCourt....");
	}

	@Override
	void importantCase() {
		System.out.println("invoking importantCase in HighCourt....");
	}
}
