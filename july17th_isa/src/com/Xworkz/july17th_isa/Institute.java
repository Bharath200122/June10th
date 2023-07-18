package com.Xworkz.july17th_isa;

public class Institute {
	
	String name;
	String location;
	int noOfStudents;
	
	
	Institute(){
		
	}
	
	Institute(String name,String location,int noOfStudents){
		this.location = location;
		this.name = name;
		this.noOfStudents = noOfStudents;
		
	}
	
	void print_info() {
		System.out.println("name is : "+name);
		System.out.println("location is : "+location);
		System.out.println("noOfStudents is : "+noOfStudents);
		
	}

}
