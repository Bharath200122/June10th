package com.xworkz.service;

import com.xworkz.dto.MovieDTO;
import com.xworkz.repo.MovieImpl;
import com.xworkz.repo.MovieRepo;
import com.xworkz.util.MovieUtil;

public class MovieServiceImpl implements MovieService{

	
	
	@Override
	public boolean MovieSaveValidation(MovieDTO movie) {
		System.out.println("movie service implemts"+movie);
		
		String name = movie.getMovieBudget();
		String budget = movie.getMovieName();
		double totalhour = movie.getTotalHrOfMovie();

	
		
		
		
		if(MovieUtil.saveString(name)) {
			System.out.println("movie name is"+name);;
		}
		else {
			System.out.println(name);;
		}
		
		if(MovieUtil.saveString(budget)) {
			System.out.println("movie budget is"+budget);;
		}
		
		else {
			System.out.println(budget);
		}
		
		if(totalhour>2 && totalhour<2.30) {
			System.out.println("movie total hour in MovieSaveValidation"+totalhour);
		}
		MovieRepo movie1 = new MovieImpl();
		movie1.saveMovieData(movie);
		
		return true;
	}
	
	
	
//	if(MovieUtil.saveString(movie.getMovieName())) {
//		System.out.println("movie name is"+movie.getMovieName());;
//	}
//	else {
//		System.out.println(movie.getMovieName());;
//	}
//	
//	if(MovieUtil.saveString(movie.getMovieBudget())) {
//		System.out.println("movie budget is"+movie.getMovieBudget());;
//	}
//	
//	else {
//		System.out.println(movie.getMovieBudget());
//	}
//	
//	if(movie.getTotalHrOfMovie()>2 && movie.getTotalHrOfMovie()<2.30) {
//		System.out.println("movie total hour in MovieSaveValidation"+movie.);
//	}
//	return true;

	
	
	
}
