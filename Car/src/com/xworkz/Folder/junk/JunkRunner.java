package com.xworkz.junk;

public class JunkRunner {

	public static void main(String[] args) {
		
		Gobi gb = new JunkFood();
		gb.price();
		gb.taste();
		
		
		Panipuri pnr = new JunkFood();
		pnr.price();
		pnr.roundpuri();
		pnr.taste();
		pnr.withsoup();
		
		
		
		Pasta past = new JunkFood();
		past.looklikepipe();
		past.price();
		past.taste();
		past.withCheese();
		
		JunkFood junk = new JunkFood();
		junk.looklikepipe();
		junk.price();
		junk.roundpuri();
		junk.taste();
		junk.withsoup();
		junk.withCheese();
		
	}



}
