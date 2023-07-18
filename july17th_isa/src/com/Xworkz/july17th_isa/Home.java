package com.Xworkz.july17th_isa;

public class Home extends Building{
	Home(String building_Name,int building_height,int building_width){
		
		super(building_Name,building_height,building_width);
		System.out.println("invoking String ,int ,int in Home");
		System.out.println("building_Name"+this.building_Name);
		System.out.println("building_height"+this.building_height);
		System.out.println("building_width"+this.building_width);
		
		
		
	}
	
	

}
