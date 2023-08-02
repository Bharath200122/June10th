package com.xworkz.rocket.app;

public abstract class RocketDetails {
	
	public abstract void price();
	
	public final void color() {
		System.out.println("invoking color in RockketDetails");
	}

}
