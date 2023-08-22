package com.xworkz.runner;
import com.xworkz.dto.*;
import com.xworkz.service.*;

public class MovieRunner {

	public static void main(String[] args) {
		
		
		MovieDTO movie1= new MovieDTO("ten crore", "gajapade", 2.25);
		
		MovieService movieservice = new MovieServiceImpl();
	
		boolean rt = movieservice.MovieSaveValidation(movie1);
		
		
		if(rt) {
			System.out.println("MovieService is "+rt);
			
		}
		else {
			System.err.println(rt);
		}
		

				
				
	}

}
