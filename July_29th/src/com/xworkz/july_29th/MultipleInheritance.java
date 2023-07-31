package com.xworkz.july_29th;

public class MultipleInheritance {
	
	String name = "hey";
	int id = 4;
	
	
	MultipleInheritance(){
		
	}
	
	MultipleInheritance(int id ,String name){
		this.id = id;
		this.name = name;
		
		System.out.println("invoking Multiple Inheritance"+id);
		System.out.println("invoking Multiple Inheritance "+name);
		
	}

}
