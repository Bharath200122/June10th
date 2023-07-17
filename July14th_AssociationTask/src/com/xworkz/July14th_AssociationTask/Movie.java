package com.xworkz.July14th_AssociationTask;

public class Movie {
	String movieName;
	float movieTicketPrice = 550;
	String movieHero;
	String movieVillan;
	
	Director director = new Director("Rajmouli","5 year","10000000");
	
	Movie(String movieName){
		this.movieName = movieName;
	}
	
	void setmovieVillan(String movieVillan) {
		this.movieVillan = movieVillan;
	}
	
	void print_info() {
		System.out.println("movie name : "+movieName);
		System.out.println("movie ticket price : "+movieTicketPrice);
		System.out.println("movie hero : "+movieHero);
		System.out.println("movie villan : "+movieVillan);
		
		
		this.director.print_info();
	}
}
