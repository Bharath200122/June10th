package com.xworkz.July14th_AssociationTask;

public class Director {
	
	
		String name;
		String directorTakeTimeForMovie;
		String budget;
	
		Director(){
			System.out.println("Running..,,,,,,,,,,,,,,,,,,,");
		}
		
		Director(String name,String directorTakeTimeForMovie,String budget) {
			this.name = name;
			this.directorTakeTimeForMovie = directorTakeTimeForMovie;
			this.budget = budget;
		}
		
		
			
			
		void print_info() {
			System.out.println("Invoking Director details");
			System.out.println("name : "+this.name);
			System.out.println("director TakeTimeForMovie : "+directorTakeTimeForMovie);
			System.out.println("budget : "+budget);
		}
			
			
		
	}


