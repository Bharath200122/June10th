package com.xworkz.bag.app.implementation.runner;

import com.xworkz.bag.app.BagDetails;
import com.xworkz.bag.app.implementation.BagDuster;

public class BagRunner {

	public static void main(String[] args) {
		
		BagDetails bag = new BagDuster() ;
		bag.color();
		bag.madeupOf();
		bag.price();
		
	}

}
