package com.xworkz.save.impl;

import com.xworkz.save.dto.ThiefDTO;
import com.xworkz.save.repo.ThiefRepo;

public class ThiefImpl implements ThiefRepo {
	
	

	@Override
	public void save(ThiefDTO thief) {
		String name = thief.getGangName();
		int experience = thief.getExperience();
		int totalcases = thief.getTotalCases();
		String gender = thief.getGender();
		String specialization = thief.getSpecialization();
		
		System.out.println("thief data"+thief);
		if(thief!=null) {
			
		
			if(name!=null && !thief.getGangName().isEmpty() && name.length() < 10 && name.length() > 0) {
				System.out.println("Gang name is " +name);
			}
			else {
				System.err.println(name);
			}
			
			if(experience>0 && experience < 20) {
				System.out.println("thief experience is " + experience);
			}
		    else {
		    	System.err.println(experience);
		    }
			
			if(totalcases < 5 && totalcases >0) {
				System.out.println(totalcases);
			}
			
			else {
				System.err.println(totalcases);
			}
			
			if(gender!=null &&  !thief.getGender().isEmpty()) {
				System.out.println(gender);
			}
			else {
				System.out.println(gender);
			}
			
			if(specialization!=null && !thief.getSpecialization().isEmpty()) {
				System.out.println(specialization);
			}
			else {
				System.err.println(specialization);
			}
			
			
			
			
			
		
		
	}

	
	
	
	}}
