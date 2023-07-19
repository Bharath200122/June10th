package com.xworkz.hierarchial;

public class CourtRunner {
	
	public static void main(String[] args) {
		
		
		Court court = new Court();
		court.justice();
		
		SupremeCourt court1 = new SupremeCourt();
		court1.importantCase();
		court1.justice();
		
		
		HighCourt court2 = new HighCourt() ;
			court2.criminalCase();
			court2.forgery();
			court2.importantCase();
			
		CivilCourt court4 = new CivilCourt();
		court4.propertyCase();
		court4.theftCase();
		court4.forgery();
		court4.criminalCase();
		
			
		FamilyCourt court3 = new FamilyCourt();
		 court3.divorce();
		 court3.propertyCase();
		 court3.theftCase();
		
			
			
		}
	}


