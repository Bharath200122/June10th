package com.xworkz.save.runner;

import com.xworkz.save.dto.MechanicDTO;
import com.xworkz.save.impl.MechanicImpl;
import com.xworkz.save.repo.MechanicalRepo;

public class MechanicRunner {

	public static void main(String[] args) {
		
		MechanicDTO mechanic = new MechanicDTO("ragu", "10th", 100, 1000);
		
		
		MechanicalRepo mech = new MechanicImpl(); 
		mech.save(mechanic);
	}

}
