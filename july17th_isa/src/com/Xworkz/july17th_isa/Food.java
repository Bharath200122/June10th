package com.Xworkz.july17th_isa;

public class Food {
	
	String name;
	String origin;
	int cost;
	  
	  
	Food(){
		
	}
	  
	  
	  
	  public Food(String name, String origin, int cost) {
	    
	    this.name=name;
	    this.origin=origin;
	    this.cost=cost;
	  
	  }
	  
	  void printInfo() {
	    System.out.println("Name : "+this.name);
	    System.out.println("Origin : "+this.origin);
	    System.out.println("Cost : "+this.cost);
	  }
	  


}
