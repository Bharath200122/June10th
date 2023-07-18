package com.Xworkz.july17th_isa;

public class Architect {
	
	String name ;
	int salary;
	String location;
	
	Architect(){
		
	}
	Architect(String name,int salary,String location){
		this.name = name;
		this.salary = salary;
		this.location = location;
	}
	
	void print_info() {
		System.out.println("name is : "+name);
		System.out.println("salary is : "+salary);
		System.out.println("location is : "+location);
	}


}
