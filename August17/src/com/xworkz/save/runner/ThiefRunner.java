package com.xworkz.save.runner;

import com.xworkz.save.dto.ThiefDTO;
import com.xworkz.save.impl.ThiefImpl;
import com.xworkz.save.repo.ThiefRepo;

public class ThiefRunner {
	
	public static void main(String[] args) {
		
		ThiefDTO thief = new ThiefDTO("10th","suresh","garuda", 3, 8);
		
		ThiefRepo thief1 = new ThiefImpl();
		thief1.save(thief);
		
		
	}

	
	
	
}
