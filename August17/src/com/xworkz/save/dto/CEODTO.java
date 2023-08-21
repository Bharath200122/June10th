package com.xworkz.save.dto;

import java.io.Serializable;

public class CEODTO implements Serializable{
	String name;
	String companyName;
	double salary;
	int experience;
	
	public CEODTO(String name,String companyName,double salary,int experience){
		this.companyName = companyName;
		this.name = name;
		this.salary = salary;
		this.experience = experience;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public String getName() {
		return name;
	}
	
	public double getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
