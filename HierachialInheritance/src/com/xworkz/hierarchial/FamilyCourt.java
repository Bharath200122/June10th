package com.xworkz.hierarchial;

public class FamilyCourt extends CivilCourt {
	
	void divorce() {
		System.out.println("invoking divorce in FamilyCourt");
	}
	
	@Override
	void propertyCase() {
		System.out.println("invoking property in FamilyCourt.....");
		
		
	}
	
	void theftCase() {
		System.out.println("invoking theft case in FamilyCourt....");
	}

}
