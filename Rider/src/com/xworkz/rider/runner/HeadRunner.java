package com.xworkz.rider.runner;

import com.xworkz.rider.HeadSet;

public class HeadRunner {

	public static void main(String[] args) {
		
		HeadSet ref = new HeadSet();
		
		System.out.println(ref);
		
		
		ref.setColor("black");
		ref.setName("Boat");
		ref.setPrice(1300);
		ref.setWired("yes");
		ref.setWireless("yes");
		
		
		System.out.println(ref.toString());

	}

}
