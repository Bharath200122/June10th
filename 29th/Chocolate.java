class Chocolate{
	int price = 2;
	String Name = "Chocolate";
	String madeUpOF;
	String famousIn;
	
	Chocolate(){
		System.out.println("Sweet Names");
	}
}

class Chocolates{
	public static void main(String[] args){
		Chocolate Chocolate1 = new Chocolate();
		System.out.println("Chocolate details : "+Chocolate1.price+" rupee for 1 piece");
		Chocolate Chocolate2 = new Chocolate();
		System.out.println("Chocolate details : "+Chocolate2.Name+" is harm to Teeth");
		Chocolate Chocolate3 = new Chocolate();
		System.out.println("Chocolate details : "+Chocolate3.madeUpOF);
		Chocolate Chocolate4 = new Chocolate();
		System.out.println("Chocolate details : "+Chocolate4.famousIn);
	}
}