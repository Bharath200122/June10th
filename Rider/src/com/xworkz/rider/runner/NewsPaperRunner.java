package com.xworkz.rider.runner;

import com.xworkz.rider.NewsPaper;

public class NewsPaperRunner {

	public static void main(String[] args) {
		
		NewsPaper ref = new NewsPaper();
		
		System.out.println(ref);
		
		ref.setColored(true);
		ref.setLanguage("Kannada");
		ref.setName("Prajavani");
		ref.setNoOfPages(6);
		ref.setPrice(2);
		
		System.out.println(ref.toString());

	}

}
