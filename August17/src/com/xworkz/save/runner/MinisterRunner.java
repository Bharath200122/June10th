package com.xworkz.save.runner;

import com.xworkz.save.dto.MinisterDTO;
import com.xworkz.save.impl.MinisterImpl;
import com.xworkz.save.repo.MinisterReo;

public class MinisterRunner {
	public static void main(String[] args) {
		
		MinisterDTO minister = new MinisterDTO("MBA", "manja", "others", 10);
		
		MinisterReo minister1 = new MinisterImpl();
		minister1.save(minister);
		
	}
}
