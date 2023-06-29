class Vegpuff{
	int price = 40;
	String Name = "Vegpuff";
	String madeUpOF;
	String famousIn;
	
	Vegpuff(){
		System.out.println("Sweet Names");
	}
}

class Vegpuffs{
	public static void main(String[] args){
		Vegpuff vegpuff1 = new Vegpuff();
		System.out.println("Vegpuff details : "+vegpuff1.price+" rupee for 1 piece");
		Vegpuff vegpuff2 = new Vegpuff();
		System.out.println("Vegpuff details : "+vegpuff2.Name+" is gud for health");
		Vegpuff vegpuff3 = new Vegpuff();
		System.out.println("Vegpuff details : "+vegpuff3.madeUpOF);
		Vegpuff vegpuff4 = new Vegpuff();
		System.out.println("Vegpuff details : "+vegpuff4.famousIn);
	}
}