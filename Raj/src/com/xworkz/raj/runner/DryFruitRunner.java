package com.xworkz.raj.runner;

import com.xworkz.raj.DryFruit;

public class DryFruitRunner {

	public static void main(String[] args) {
		
		DryFruit ref = new DryFruit(200,"Hassan","Drakshi","1 kg",1,"red");
		
		DryFruit ref2 = new DryFruit(200,"Hassan","Drakshi","1 kg",1,"red");
		
		System.out.println(ref.equals(ref2));

	}

}
