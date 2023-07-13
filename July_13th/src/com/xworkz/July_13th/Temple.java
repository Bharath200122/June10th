package com.xworkz.July_13th;

public class Temple {
	String templeName;
	int noOfGods = 2;
	TemplePoojariName poojariName;
	String templeAddress;
	
	Temple(String templeName){
		this.templeName = templeName;
		
	}
	
	void setpoojariName(TemplePoojariName poojariName) {
		this.poojariName = poojariName;
	}
	void display() {
		System.out.println("temple name : "+templeName);
		System.out.println("no Of gods : "+noOfGods);
		System.out.println("temple poojari Name : "+this.poojariName);
		System.out.println("temple Address : "+templeAddress);
		
	}
}
