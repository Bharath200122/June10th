package com.xworkz.util;

public class LabourUtil {

	public static boolean validateString(String string) {
		if(string!=null && !string.isEmpty() && string.length() > 3 && string.length() < 40) {
			return true;
		}
		else {
			System.err.println(string);
		}
		return true;	
	}
	
	public static boolean validatenumbers(double dou) {
		if(dou < 100 && dou >28) {
			return true;
		}
		else {
			System.out.println(dou);
		}
		return true;
	}
	
}
