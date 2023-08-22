package com.xworkz.util;

public interface MovieUtil {

	
	public static boolean saveString(String string) {
		if(string!=null && !string.isEmpty() && string.length()>3 && string.length()<20) {
			System.out.println("saveString data is"+string);
		}
		else {
			System.err.println(string);
		}
		
		System.out.println("String data is stored");
		
		return true;
		
		
		
	}
	
	
}
