package com.xworkz.caasting;

public class ShoeRunner {
	
	public static void main(String[] args) {
		Shoe shoe = new Shoe(1200,ShoeSize.nine,ShoeColor.black);
		ShoeUtil.Checking(shoe);
		
		Shoe shoe2 = new PumaShoe("Casuals","India",3000,ShoeSize.nine,ShoeColor.pink);
		ShoeUtil.Checking(shoe2);
		
		Shoe shoe3 = new Nike("Jhon Donahoe","Rory Mcllory",3200,ShoeSize.nine,ShoeColor.blue);
		ShoeUtil.Checking(shoe3);
	}

}
