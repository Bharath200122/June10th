package com.Xworkz.july17th_isa;

public class LivingThing {
	int lifeSpan;
	String plantName;
	String location;
	
	LivingThing(){
		
	}
	LivingThing(int lifeSpan,String plantName,String location){
		this.lifeSpan = lifeSpan;
		this.plantName = plantName;
		this.location = location;
	}
	
	void print_info() {
		System.out.println("lifeSpan is : "+lifeSpan);
		System.out.println("plantName is : "+plantName);
		System.out.println("location is : "+location);
	}

}
