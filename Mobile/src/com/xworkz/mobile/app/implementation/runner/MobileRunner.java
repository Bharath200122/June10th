package com.xworkz.mobile.app.implementation.runner;

import com.xworkz.mobile.app.MobileDetails;
import com.xworkz.mobile.app.MobileInfo;
import com.xworkz.mobile.app.implementation.MobileData;
import com.xworkz.mobile.app.implementation.MobileTech;

public class MobileRunner {
	
	public static void main(String[] args) {
		
		MobileDetails mobile = new MobileTech();
		mobile.battery();
		mobile.price();
		
		
		
		MobileInfo mob = new MobileData();
		mob.type();
		mob.size();
		
	}

}
