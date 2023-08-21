package com.xworkz.save.dto;

import java.io.Serializable;

public class CookDTO implements Serializable {
	
	String specialization;
	String gender;
	int experience;
	double salary;
	
	
	
	public CookDTO(String specialization, String gender, int experience, double salary) {
		super();
		this.specialization = specialization;
		this.gender = gender;
		this.experience = experience;
		this.salary = salary;
	}

	public int getExperience() {
		return experience;
	}
	
	public String getGender() {
		return gender;
	}
	
	
	public double getSalary() {
		return salary;
	}
	
	public String getSpecialization() {
		return specialization;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
