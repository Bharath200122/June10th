package com.xworkz.July_13th;

public class Resort {
	String name;
	String ownerName = "Bharath";
	ResortRoomType roomType;
	String breakFast;
	
	Resort(String name)
	{
		this.name = name;	
	}
	

	
	void setroomType(ResortRoomType roomtype)
	{
		this.roomType = roomtype;
	}
	
	void display() {
	System.out.println("Resort name:"+this.name);
	System.out.println("Resort ownerName:"+ownerName);
	System.out.println("Resort roomType:"+roomType);
	System.out.println("Resort breakfast:"+this.breakFast);
	}
}
