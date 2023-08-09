package com.xworkz.implement;

import com.xworkz.abstraction.WaterPurify;

public class KapilWater {
	
	private WaterPurify waterpurify;
	
	
	public KapilWater(WaterPurify waterpurify) {
		this.waterpurify = waterpurify;
	}
	
	public void water() {
		if(waterpurify!=null) {
			System.out.println("not null values");
			this.waterpurify.filter();
		}
		else {
			System.err.println();
		}
	}

}
