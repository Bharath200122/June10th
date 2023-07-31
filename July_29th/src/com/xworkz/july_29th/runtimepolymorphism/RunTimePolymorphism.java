package com.xworkz.july_29th.runtimepolymorphism;

public class RunTimePolymorphism extends RunTime{
	String address;
	
	public RunTimePolymorphism(int id, String name,String address){
		super(id,name);
		this.address = address;
	
		
	}
		
	@Override
	void info(){
			super.info();
			System.out.println(address);
			System.out.println();
			System.out.println();
		}
		
	}


