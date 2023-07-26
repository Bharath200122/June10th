package com.xworkz.rider;

public class NewsPaper {
	
	private int price;
	private String name;
	private String language;
	private Boolean colored;
	private int noOfPages;
	
	
	public Boolean getColored() {
		return colored;
	}
	
	
	public String getLanguage() {
		return language;
	}
	
	public String getName() {
		return name;
	}
	
	public int getNoOfPages() {
		return noOfPages;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	public void setColored(Boolean colored) {
		this.colored = colored;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
	
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		
		return "price"+price+"noOfPages"+noOfPages+""+"name"+name+"language"+language+"colored"+colored;
	}

}
