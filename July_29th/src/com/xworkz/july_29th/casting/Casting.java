package com.xworkz.july_29th.casting;

public class Casting {
	
	int id = 10;
	int number = 222345;
	String name = "ramesh";
	
	Casting(int id,String name,int number){
		
		this.id = id;
		this.number = number;
		this.name = name;
		
	}
	
	void print() {
		System.out.println(this.id);
		System.out.println(this.name);
		System.out.println(this.number);
	}

}
