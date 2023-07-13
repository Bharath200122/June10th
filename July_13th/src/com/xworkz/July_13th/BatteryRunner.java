package com.xworkz.July_13th;

public class BatteryRunner {
	public static void main(String[] args) {
		Battery battery1 = new Battery("1 year");
		battery1.batteryProducedIn = "India";
		battery1.setbatteryCost(BatteryCost.Twenty);
		battery1.display();
		
		Battery battery2 = new Battery("1.5 year");
		battery2.batteryProducedIn = "China";
		battery2.setbatteryCost(BatteryCost.Twenty_Two);
		battery2.display();
	}

}
