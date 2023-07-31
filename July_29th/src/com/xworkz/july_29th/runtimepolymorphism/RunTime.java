package com.xworkz.july_29th.runtimepolymorphism;

public class RunTime {
	int id ;
	String name;
	
	
	
	
	public RunTime(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}




	void info() {
		
		System.out.println(id);
		System.out.println(name);
		
	
	}

}
