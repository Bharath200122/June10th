package com.xworkz.implement;

import com.xworkz.abstraction.Kidney;

public class Doctor{
		
		private Kidney kidney;
		
		public Doctor(Kidney kidney){
			this.kidney = kidney;
		}
		
		public void doctorName() {
			if(kidney!=null) {
				System.out.println("kidney invoking in Doctor");
				this.kidney.clean();
			}
			else {
				System.err.println("kidney invoking a null value");
			}
		}

		


}
