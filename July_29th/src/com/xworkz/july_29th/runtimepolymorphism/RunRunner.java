package com.xworkz.july_29th.runtimepolymorphism;

public class RunRunner {

	public static void main(String[] args) {
		
		RunTime ref = new RunTime(7,"Beautiful");
		
		ref.info();
		System.out.println("Next is..............");
		
		RunTime ref1 = new RunTimePolymorphism(5,"Hey","Nice");
		
		ref1.info();
		
		

	}

}
