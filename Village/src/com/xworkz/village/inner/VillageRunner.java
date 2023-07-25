package com.xworkz.village.inner;

import com.xworkz.village.OldVillage;

import com.xworkz.village.outer.NewVillage;

public class VillageRunner {
	
	public static void main(String[] args) {
		
		OldVillage ref = new OldVillage();
		ref.enter();
//		ref.exit();
		
		
		NewVillage ref1 = new NewVillage();
		ref1.enter();
		ref1.exit();
		
	}

}
