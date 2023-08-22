package com.xworkz.dto;

import java.io.Serializable;

public class MovieDTO implements Serializable{
	
	private String movieName;
	private String movieBudget;
	private double totalHrOfMovie;
	
	
	
	
	public MovieDTO(String movieName, String movieBudget, double totalHrOfMovie) {
		super();
		this.movieName = movieName;
		this.movieBudget = movieBudget;
		this.totalHrOfMovie = totalHrOfMovie;
	}
	
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieBudget() {
		return movieBudget;
	}
	public void setMovieBudget(String movieBudget) {
		this.movieBudget = movieBudget;
	}
	public double getTotalHrOfMovie() {
		return totalHrOfMovie;
	}
	public void setTotalHrOfMovie(double totalHrOfMovie) {
		this.totalHrOfMovie = totalHrOfMovie;
	}
	
	 
	
}
