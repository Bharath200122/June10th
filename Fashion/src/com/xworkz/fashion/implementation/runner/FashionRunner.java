package com.xworkz.fashion.implementation.runner;

import com.xworkz.fashion.FashionDetails;
import com.xworkz.fashion.FashionInfo;
import com.xworkz.fashion.implementation.FashionSchool;

public class FashionRunner {

	public static void main(String[] args) {
		
		FashionDetails fashion = new FashionSchool();
		
		fashion.price();
		fashion.type();
		
		
		FashionInfo fash = new FashionSchool();
		fash.color();
		fash.size();

	}

}
