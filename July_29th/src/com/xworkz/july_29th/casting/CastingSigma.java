package com.xworkz.july_29th.casting;

public class CastingSigma extends Casting{

	String address;
	String frndName;
	
	CastingSigma(int id,int number,String name,String address,String FrndName){
		super(id,name,number);
		this.address = address;
		this.frndName = frndName;
	}
	
	void print() {
		super.print();
		System.out.println(this.address);
		System.out.println(this.frndName);
	}
	
}
