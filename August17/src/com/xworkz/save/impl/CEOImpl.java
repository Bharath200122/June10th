package com.xworkz.save.impl;

import com.xworkz.save.dto.CEODTO;
import com.xworkz.save.repo.CEORepo;

public class CEOImpl implements CEORepo{

	@Override
	public void save(CEODTO ceo) {
		String companyname = ceo.getCompanyName();
		String name = ceo.getName();
		double salary = ceo.getSalary();
		int experience = ceo.getExperience();
		
		if(companyname!=null && !ceo.getCompanyName().isEmpty() && companyname.length()>0) {
			System.out.println(companyname);
			
		}
		else {
			System.out.println(companyname);
			
		}
		if(name!=null && !ceo.getName().isEmpty()) {
			System.out.println(name);
		}
		else {
			System.out.println(name);
		}
		if(salary>10000 && salary < 100000) {
			System.out.println(salary);
		}
		else {
			System.out.println(salary);
		}
		if(experience<10 && experience >0) {
			System.out.println(experience);
		}
		else {
			System.out.println(experience);
		}
		
	}
	
	

}
