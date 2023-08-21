package com.xworkz.save.impl;

import com.xworkz.save.dto.CookDTO;
import com.xworkz.save.repo.CookRepo;

public class CookImpl implements CookRepo{

	@Override
	public void save(CookDTO cook) {
		String specialization = cook.getSpecialization();
		String gender = cook.getGender();
		int experience = cook.getExperience();
		double salary = cook.getSalary();
		
		if(specialization!=null && !specialization.isEmpty() && specialization.length() < 10 && specialization.length()>0) {
			System.out.println("specialization"+specialization);
		}
		else {
			System.out.println(specialization);
		}
		
		if(gender!=null && !cook.getGender().isEmpty() && gender.length() > 0 && gender.length() < 10){
			System.out.println("gender is "+ gender);
		}
		else {
			System.out.println(gender);
		}
		
		if(experience > 0 && experience < 10) {
			System.out.println("experience is "+experience);
		}
		else {
			System.out.println(experience);
		}
		
		if(salary > 10000 && salary < 150000) {
			System.out.println("cook salary is "+salary );
		}
		else {
			System.out.println(salary);
		}
		
	}

	
	
	
}
