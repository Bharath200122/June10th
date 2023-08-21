package com.xworkz.save.runner;

import com.xworkz.save.dto.CookDTO;
import com.xworkz.save.impl.CookImpl;
import com.xworkz.save.repo.CookRepo;

public class CookRunner {
	
	public static void main (String[] args) {
		
		CookDTO cook = new CookDTO("Cook", "male", 6, 400000);
		
		CookRepo cook1 = new CookImpl();
		cook1.save(cook);
		
	}

}
