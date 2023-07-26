package com.xworkz.rider;

public class Satellite {
	
	
	private int price;
	private String madeupOf;
	private String speedPerMinute;
	private String engine;
	private String name;
	
	
	public int getPrice() {
		return price;
		
	}
	
	public String getMadeupOf() {
		return madeupOf;
		
	}
	
	public String getSpeedPerMinute() {
		return speedPerMinute;
	}
	
	public String getEngine() {
		return engine;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setMadeupOf(String madeupOf) {
		this.madeupOf = madeupOf;
	}
	
	public void setSpeedPerMinute(String SpeedPerMinute) {
		this.speedPerMinute = speedPerMinute;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	
	@Override
	public String toString() {
		
		return "price is "+ price +""+ "engine is "+ engine + ""+ "speedPerMinute "+speedPerMinute+""+"madeupOf "+madeupOf+""+"name "+ name;
	}
	
	
	
	

}
