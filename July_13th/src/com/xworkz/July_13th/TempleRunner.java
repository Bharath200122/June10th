package com.xworkz.July_13th;

public class TempleRunner {
	public static void main (String[] args) {
		Temple temple1 = new Temple("Ganapathi");
		temple1.templeAddress = "Murugeshpalya";
		temple1.setpoojariName(TemplePoojariName.Muruga);
		temple1.display();
		
		
		Temple temple2 = new Temple("Krishna");
		temple2.templeAddress = "rr nagar";
		temple2.setpoojariName(TemplePoojariName.Raju);
		temple2.display();
	}

}
