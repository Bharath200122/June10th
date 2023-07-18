package com.xworkz.caasting;

public class ShoeUtil {
	
	
	static void Checking(Shoe shoe) {
	
			if(shoe!=null) {
				System.out.println("price is : "+shoe.price );
				System.out.println("size is : "+shoe.size );
				System.out.println("color is : "+shoe.color );
				
						
			}
			
			if(shoe instanceof PumaShoe) {
				PumaShoe puma = (PumaShoe)shoe;
				puma.print_info();
				
			
		}
			if(shoe instanceof Nike) {
				Nike nike =(Nike)shoe;
				nike.print_info();
				
			}
	}

}
