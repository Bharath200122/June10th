package com.xworkz.runner;

import com.xworkz.dto.LabourDTO;
import com.xworkz.service.ValidationServices;
import com.xworkz.service.ValidationServiceImpl;
public class LabourRunner {

	public static void main(String[] args) {
		
		LabourDTO dto = new LabourDTO("sathish", 23, "hassan", "sathish@2001");
		LabourDTO dto1 = new LabourDTO("john",24,"banglore","john@2002");
		
		ValidationServices valid = new ValidationServiceImpl();
		boolean result = valid.validationService(dto);
		
		if(result) {
			System.out.println("saved result is "+result);
		}
		else {
			System.out.println(result);
		}
		
		
		
		
		System.out.println("@!@!@!@!@!@!@!@!@!@!@!@!@!@!@!@!@!@!@!@!@!@!@!@!-------------------------------------");

		
		
		
		ValidationServices valid1 = new ValidationServiceImpl();
		boolean result1 = valid1.validationService(dto1);
		
		if(result) {
			System.out.println("saved result is "+result);
		}
		else {
			System.out.println(result1);
		}
	}

}
