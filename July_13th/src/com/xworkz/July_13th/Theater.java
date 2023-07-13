package com.xworkz.July_13th;

public class Theater {
	String theaterName;
	int seats = 100;
	TheaterType theaterType;
	String movieName;
	
	Theater(String theaterName){
		this.theaterName=theaterName;
		
	}
	
	void settheaterType(TheaterType theaterType)
	{
		this.theaterType = theaterType;
		
	}
	void display() {
		System.out.println("theater Name:"+this.theaterName);
		System.out.println("theater seats"+this.seats);
		System.out.println("movie name "+this.movieName);
		System.out.println("theater type :"+this.theaterType);
		
	}
	

}
