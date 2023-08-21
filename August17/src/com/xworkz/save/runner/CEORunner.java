package com.xworkz.save.runner;

import com.xworkz.save.dto.CEODTO;
import com.xworkz.save.impl.CEOImpl;
import com.xworkz.save.repo.CEORepo;

public class CEORunner {

	public static void main(String[] args) {
		
		CEODTO ceo = new CEODTO("StartUpComapany", "sathish", 99000, 9);
		
		CEORepo ceo1 = new CEOImpl();
		ceo1.save(ceo);
	}

}
