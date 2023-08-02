package com.xworkz.rocket.app.implementation;

import com.xworkz.rocket.app.RocketInfo;

public class RocketLevel extends RocketInfo{
	
	public void price() {
		System.out.println("price in Rocket Level");
	}
	
	public void speed() {
		System.out.println("speed in RocketLevel");
	}

	@Override
	public void madeupOf() {
		System.out.println("madeupOf Aluminium");
		
	}

}
