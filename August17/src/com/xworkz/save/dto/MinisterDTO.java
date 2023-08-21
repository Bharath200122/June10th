package com.xworkz.save.dto;

import java.io.Serializable;

public class MinisterDTO implements Serializable{
	String name;
	String designation;
	String partyName;
	int experience;
	
	public MinisterDTO(String name,String designation,String partyName,int experience){
		this.designation = designation;
		this.experience = experience;
		this.name = name;
		this.partyName = partyName;
	}
	
	public String getDesignation() {
		return designation;
	}
	
	public int getExperience() {
		return experience;
	}
	
	public String getName() {
		return name;
	}
	public String getPartyName() {
		return partyName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
}
