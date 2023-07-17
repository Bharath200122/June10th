package com.xworkz.July14th_AssociationTask;

public class Franchise {
	
	String franchiseName;
	double totalAmountRemaining;
	double amountInvestedForPlayer;
	String highestPaidPlayer;
	
	Franchise(){
		System.out.println("Franchise Info................");
	}
	
	Franchise(String franchiseName,double totalAmountRemaining,double amountInvestedForPlayer,String highestPaidPlayer){
		this.amountInvestedForPlayer=amountInvestedForPlayer;
		this.franchiseName = franchiseName;
		this.highestPaidPlayer = highestPaidPlayer;
		this.totalAmountRemaining=totalAmountRemaining;
		
	}
	
	void print_info() {
		System.out.println("franchise name:"+franchiseName);
		System.out.println("franchise total amount remaining:"+totalAmountRemaining);
		System.out.println("franchise amount invested for player:"+amountInvestedForPlayer);
		System.out.println("franchise highestpaid player:"+highestPaidPlayer);
		
	}
	

}
