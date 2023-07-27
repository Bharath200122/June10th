package com.xworkz.raj;

public class Slipper {
	
	private int price;
	private String brand;
	private String color;
	private Boolean withBelt;
	private Boolean withOutBelt;
	private String location;
	private String material;
	
	
	public Slipper(int price, String brand, String color, Boolean withBelt, Boolean withOutBelt, String location,
			String material) {
		super();
		this.price = price;
		this.brand = brand;
		this.color = color;
		this.withBelt = withBelt;
		this.withOutBelt = withOutBelt;
		this.location = location;
		this.material = material;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		System.out.println("invoking");
		
		if(obj!=null) {
			System.out.println("not null");
			
			if(obj instanceof Slipper) {
				System.out.println(this);
				System.out.println(obj);
				
				Slipper ref = (Slipper)obj;
				System.out.println(ref);
				
				if(this.withBelt == ref.withBelt && this.withOutBelt == ref.withOutBelt && this.brand == ref.brand && this.color == ref.color && this.location == ref.location && this.material == ref.material) {
					return true;
				}
			}
			else {
				System.out.println("hey");
			}
		}
		
		else {
			System.out.println("is null");
		}
		
		return false;
	}
	
	
	@Override
	public String toString() {
		return "price "+price +"brand "+brand +"color"+color + "withBelt "+withBelt +"withOutBelt "+withOutBelt +"location "+location +"material" + material;
	}
	

}
