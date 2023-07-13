package com.xworkz.July_13th;

public class TheaterRunner {

	public static void main(String[] args) {
		Theater theater1 = new Theater("Raju");
		theater1.settheaterType(TheaterType.Three_D);
		theater1.movieName = "RRR";
		theater1.display();
		
		Theater theater2 = new Theater("Manju");
		theater2.settheaterType(TheaterType.Four_DX);
		theater2.movieName = "psyco";
		theater2.display();
		
		

	}

}
