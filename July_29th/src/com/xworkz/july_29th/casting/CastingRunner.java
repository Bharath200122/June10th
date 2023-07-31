package com.xworkz.july_29th.casting;

public class CastingRunner {

	public static void main(String[] args) {
		
		Casting ref = new Casting(8,"hhh",333333);
//		ref.print();
		
		CastingSigma ref1 = new CastingSigma(7,77777,"hsjsjsj","hsyssmm","hshssjsk");
		ref1.print();
		
		Casting cast  = (Casting)ref;
		
		cast.print();
		
		
//		
//		Casting ref = new Casting(1,"hello",66666) ;
//			CastingMerging.castCheck(ref);
//			
//		Casting ref1 = new Casting(1,"hello",66666);
//		System.out.println(CastingMerging.castCheck(ref1));
		
		
		
		
		}

	}


//double a = 10;
//double d = a + 10
//
//
//int a = 10;
//int d = a + (int)10.0


