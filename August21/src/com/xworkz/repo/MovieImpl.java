package com.xworkz.repo;

import com.xworkz.dto.MovieDTO;

public class MovieImpl implements MovieRepo {

	private MovieDTO[] movie1 = new MovieDTO[NUMBER];
	int index = 0;
	
	
	@Override
	public boolean saveMovieData(MovieDTO movie) {
		
		if(index<NUMBER) {
			this.movie1[index] = movie;
			System.out.println(movie1+"is movie data");
			this.index++;
		}
		else {
			System.err.println(movie1);
		}
		
		return true;
		
	}

}
