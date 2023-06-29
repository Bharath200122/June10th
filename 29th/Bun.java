class Bun{
	int price = 10;
	String Name = "Bun";
	String madeUpOF;
	String famousIn;
	
	Bun(){
		System.out.println("Sweet Names");
	}
}

class Buns{
	public static void main(String[] args){
		Bun Bun1 = new Bun();
		System.out.println("Bun details : "+Bun1.price+" rupee for 1 piece");
		Bun Bun2 = new Bun();
		System.out.println("Bun details : "+Bun2.Name+" is gud for health");
		Bun Bun3 = new Bun();
		System.out.println("Bun details : "+Bun3.madeUpOF);
		Bun Bun4 = new Bun();
		System.out.println("Bun details : "+Bun4.famousIn);
	}
}