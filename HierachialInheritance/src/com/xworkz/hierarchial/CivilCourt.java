package com.xworkz.hierarchial;

public class CivilCourt extends HighCourt{
	
	void propertyCase() {
		System.out.println("invoking property in CivilCourt.....");
		
		
	}
	
	void theftCase() {
		System.out.println("invoking theft case in CivilCourt....");
	}
	
	
	@Override
	void criminalCase() {
		System.out.println("invoking criminalCase in CivilCourt.....");
	}
	
	void forgery() {
		System.out.println("invoking forgeryCase in CivilCourt....");
	}


	

}
