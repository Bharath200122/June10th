package com.Xworkz.july17th_isa;

public class Animal {
	
	String name;
	String location;
	int age;
	
	
	Animal(){
		
	}
	
	Animal(String name,String location,int age){
		this.location = location;
		this.name = name;
		this.age = age;
		
	}
	
	void print_info() {
		System.out.println("name is : "+name);
		System.out.println("location is : "+location);
		System.out.println("age is : "+age);
		
	}

}
