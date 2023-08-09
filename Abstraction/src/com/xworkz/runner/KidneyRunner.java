package com.xworkz.runner;

import com.xworkz.abstraction.Kidney;
import com.xworkz.abstraction.KidneyStone;
import com.xworkz.implement.Doctor;

public class KidneyRunner {

	public static void main(String[] args) {
		
		Kidney kidney = new KidneyStone();
		
		Doctor doctor = new Doctor(kidney);
		doctor.doctorName();
	}

}
