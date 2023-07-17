package com.xworkz.July14th_AssociationTask;

public class Owner {
	String name;
	int age;
	long contactNumber;
	
	Owner(){
		System.out.println("Running....................");
	}
	
	Owner(String name,int age,long contactNumber){
		this.name = name;
		this.age = age;
		this.contactNumber = contactNumber;
	}
	
	
	void print_info() {
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("contact number:"+contactNumber);
		
	}

}
