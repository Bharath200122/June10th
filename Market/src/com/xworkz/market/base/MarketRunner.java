package com.xworkz.market.base;

import com.xworkz.market.SuperMarket;
import com.xworkz.market.online.OnlineMarket;

public class MarketRunner {
	
	public static void main(String[] args) {
		
		SuperMarket ref = new SuperMarket();
		ref.buy();
//		ref.sell();
		
		OnlineMarket ref1 = new OnlineMarket();
		ref1.buy();
		ref1.sell();
		
		
		
		
		
		
	}
	
	

}
