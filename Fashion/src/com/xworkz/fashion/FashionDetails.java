package com.xworkz.fashion;

public abstract class FashionDetails {
	
	public abstract void price();
	

	public final void type() {
		System.out.println("invoking type in Fashion details");
	}
}
