package com.xworkz.methodinvoking;

public class ChickenRunner {
	
		
		
		public static void main(String[] args) {
			
			Chicken chicken = new Chicken(370, "India");
			chicken.printInfo();
			
			System.out.println();
			
			FarmChicken farmChicken = new FarmChicken(280, "India", 7, "Raju");
			farmChicken.printInfo();
			
			System.out.println();
			
			BroilerChicken broilerChicken = new BroilerChicken(960, "India", true, 3);
			broilerChicken.printInfo();

		}
		
}


//OpenJDK 64-Bit Server VM warning: INFO: os::commit_memory(0x000000008a600000, 123731968, 0) failed; error='The paging file is too small for this operation to complete' (DOS error/errno=1455)
//#
//# There is insufficient memory for the Java Runtime Environment to continue.
//# Native memory allocation (mmap) failed to map 123731968 bytes for G1 virtual space
//# An error report file with more information is saved as:
//# C:\Users\bhara\Desktop\eclipseworkspace\MethodInvoking\hs_err_pid7204.log
