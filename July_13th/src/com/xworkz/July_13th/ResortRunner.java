package com.xworkz.July_13th;

public class ResortRunner {

	public static void main(String[] args) {
		Resort resort1 = new Resort("Bharath");
		resort1.breakFast="puri";
		resort1.setroomType(ResortRoomType.suit);
		resort1.display();
		
		
		Resort resort2 = new Resort("Dushu");
		resort2.breakFast = "Chappati";
		resort2.setroomType(ResortRoomType.precidential_suit);
		resort2.display();
		

	}

}
