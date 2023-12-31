package com.xworkz.dto;

import java.io.Serializable;

public class LabourDTO implements Serializable{
	
	private String name;
	private int age;
	private String email;
	private String address;
	
	
	public LabourDTO(String name, int age, String email, String address) {
		super();
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		
		return "address = "+address+ "age = "+age+ "name = "+name + "email = "+email;
	}
	
	
	
	
}
