package com.xworkz.repo;

import com.xworkz.dto.MovieDTO;

public interface MovieRepo {

	
	int NUMBER = 4;
	public boolean saveMovieData(MovieDTO movie);
	
}
