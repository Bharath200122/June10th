package com.xworkz.save.impl;

import com.xworkz.save.dto.MechanicDTO;
import com.xworkz.save.repo.MechanicalRepo;

public class MechanicImpl implements MechanicalRepo{

	@Override
	public void save(MechanicDTO mechanic) {
		String specialization= mechanic.getSpecialization();
		String garageName = mechanic.getGarageName();
		int gstno = mechanic.getGstNo();
		double servicecost = mechanic.getBikeServiceCost();		
		
		System.out.println("mechanic details"+mechanic);
		if(specialization!= null && !mechanic.getSpecialization().isEmpty() && specialization.length()>0 && specialization.length()<10) {
			System.out.println("specialization is "+specialization);
		}
		
		else {
			System.err.println(specialization);
		}
		
		if(garageName!=null && !mechanic.getGarageName().isEmpty()) {
			System.out.println(garageName);
		}
		else {
			System.err.println(garageName);
		}
		
		if(gstno<10000 && gstno > 100) {
			System.out.println(gstno);
		}
		else {
			System.err.println(gstno);
		}
		
		if(servicecost>100 && servicecost<10000) {
			System.out.println(servicecost);
		}
		else {
			System.out.println(servicecost);
		}
		
	}

}
