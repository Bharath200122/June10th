package com.xworkz.save.impl;

import com.xworkz.save.dto.MinisterDTO;
import com.xworkz.save.repo.MinisterReo;

public class MinisterImpl implements MinisterReo{

	@Override
	public void save(MinisterDTO minister) {
		String designation = minister.getDesignation();
		int experience = minister.getExperience();
		String name = minister.getName();
		String partyname = minister.getPartyName();
		System.out.println(minister);
		if(designation!=null && !minister.getDesignation().isEmpty()) {
			System.out.println(designation);
		}
		else {
			System.out.println(designation);
		}
		if(experience>0 && experience < 10) {
			System.out.println(experience);
		}
		else {
			System.out.println(experience);
		}
		if(name!=null && !minister.getName().isEmpty()) {
			System.out.println(name);
		}
		else {
			System.out.println(name);
		}
		
		if(partyname!=null && !minister.getPartyName().isEmpty() && partyname.length()>0) {
			System.out.println(partyname);
		}
		else {
			
		
		System.out.println(partyname);
	}
	}
	

}
