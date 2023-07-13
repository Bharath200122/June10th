package com.xworkz.July_13th;

public class CarRunner 
	 {
		public static void main(String[] args) {
			Car car1 = new Car("petrol");
			car1.carProduceIn = "India";
			car1.setcarCost(CarCost.One_Crore);
			car1.display();
			
			Car car2 = new Car("Diesel");
			car2.carProduceIn = "China";
			car2.setcarCost(CarCost.Two_Crore);
			car2.display();
		}

	}


