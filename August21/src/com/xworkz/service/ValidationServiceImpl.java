package com.xworkz.service;

import com.xworkz.dto.LabourDTO;
import com.xworkz.repo.LabourImpl;
import com.xworkz.repo.LabourRepo;
import com.xworkz.util.LabourUtil;

public class ValidationServiceImpl implements ValidationServices {

	@Override
	public boolean validationService(LabourDTO labour) {
		String name = labour.getName();
		String email = labour.getEmail();
		String address = labour.getAddress();
		double age = labour.getAge();
		
//		if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<20) {
//			System.out.println("validationService labour is "+name);
//		}
//		else {
//			System.err.println(name);
//		}
		
		if(LabourUtil.validateString(name)) {
			System.out.println("validationService labour name is "+name);
		}
		else {
			System.err.println(name);
		}
		
		if(LabourUtil.validateString(email)) {
			System.out.println("labour age is"+age);
		}
		else {
			System.out.println(age);
		}
		
		if(LabourUtil.validateString(address)) {
			System.out.println("labour address"+address);
		}
		else {
			System.out.println(address);
		}
		
		if(LabourUtil.validatenumbers(age)) {
			System.out.println("labour age is"+age);
		}
		else {
			System.out.println(age);
		}
		
		LabourRepo labour1 = new LabourImpl();
		labour1.saveandvalid(labour);
		
		return true;
	}

}
