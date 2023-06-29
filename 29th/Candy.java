class Candy{
	int price = 50;
	String Name = "Candy";
	String madeUpOF;
	String famousIn;
	
	Candy(){
		System.out.println("Candy Names");
	}
}

class Candies{
	public static void main(String[] args){
		Candy Candy1 = new Candy();
		System.out.println("Candy details : "+Candy1.price+" rupee for 1 piece");
		Candy Candy2 = new Candy();
		System.out.println("Candy details : "+Candy2.Name+" is nice to eat");
		Candy Candy3 = new Candy();
		System.out.println("Candy details : "+Candy3.madeUpOF);
		Candy Candy4 = new Candy();
		System.out.println("Candy details : "+Candy4.famousIn);
	}
}