package com.xworkz.save.dto;

import java.io.Serializable;

public class ThiefDTO implements Serializable{

	

	String specialization;
	String gangName;
	String gender;
	int experience;
	int totalCases;
	
	public ThiefDTO(String specialization, String gangName, String gender, int experience, int totalCases) {
		super();
		this.specialization = specialization;
		this.gangName = gangName;
		this.gender = gender;
		this.experience = experience;
		this.totalCases = totalCases;
	}
	
	
	
	public int getExperience() {
		return experience;
	}
	
	public String getGangName() {
		return gangName;
	}
	
	public String getGender() {
		return gender;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	public int getTotalCases() {
		return totalCases;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
