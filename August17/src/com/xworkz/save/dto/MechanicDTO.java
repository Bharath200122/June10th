package com.xworkz.save.dto;

import java.io.Serializable;

public class MechanicDTO implements Serializable{
	
	String garageName ;
	String specialization;
	int gstNo;
	double bikeServiceCost;
	
	
	
	public MechanicDTO(String garageName, String specialization, int gstNo, double bikeServiceCost) {
		super();
		this.garageName = garageName;
		this.specialization = specialization;
		this.gstNo = gstNo;
		this.bikeServiceCost = bikeServiceCost;
	}

	public double getBikeServiceCost() {
		return bikeServiceCost;
	}
	
	public String getGarageName() {
		return garageName;
	}
	
	public int getGstNo() {
		return gstNo;
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
