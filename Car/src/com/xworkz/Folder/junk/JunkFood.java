package com.xworkz.junk;

public class JunkFood implements Panipuri,Pasta{

	@Override
	public void looklikepipe() {
		System.out.println("Looklikepipe in JunkFood");
		
	}

	@Override
	public void withsoup() {
		System.out.println("withsoup in JunkFood");
		
	}

	@Override
	public void price() {
		System.out.println("price in JunkFood");
		
	}
	
	@Override
	public void roundpuri() {
		System.out.println("roundpuri in JunkFood");
		Panipuri.super.roundpuri();
	}
	
	@Override
	public void taste() {
		System.out.println("taste in JunkFood");
		Panipuri.super.taste();
	}
	
	@Override
	public void withCheese() {
		System.out.println("withCheese in JunkFood");
		Pasta.super.withCheese();
	}
	
	

}
