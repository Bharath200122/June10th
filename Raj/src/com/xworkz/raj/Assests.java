package com.xworkz.raj;

public class Assests {
	
	private int amount;
	private Boolean land;
	private Boolean gold;
	
	public Assests(int amount, Boolean land, Boolean gold) {
		super();
		this.amount = amount;
		this.land = land;
		this.gold = gold;
	}
	
	@Override
	public String toString() {
		
		return "amount "+ amount + " land " + land + ""+ " gold " + gold;
	}
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking amount land and gold in Assests");
		
		if(obj!=null) {
			System.out.println("not null");
			
			if(obj instanceof Assests) {
				System.out.println(this);
				System.out.println(obj);
				
				Assests ref = (Assests)obj;
				
				if(this.amount==ref.amount && this.gold == ref.gold && this.land == ref.land) {
					System.out.println("");
					return true;
				}
				
			}
			else {
				System.out.println("");
			}
			
			
		}
		else {
			System.out.println("is null");
		}
	return false;
	}
	
	

}
