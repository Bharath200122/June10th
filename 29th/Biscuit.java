class Biscuit{
	int price = 40;
	String biscuitName = "50-50";
	String madeUpOF;
	String famousIn;
	
	Biscuit(){
		System.out.println("Sweet Names");
	}
}

class Biscuits{
	public static void main(String[] args){
		Biscuit Biscuit1 = new Biscuit();
		System.out.println("Biscuit details : "+Biscuit1.price+" rupee for 1 packet");
		Biscuit Biscuit2 = new Biscuit();
		System.out.println("Biscuit details : "+Biscuit2.biscuitName+" is gud Biscuit");
		Biscuit Biscuit3 = new Biscuit();
		System.out.println("Biscuit details : "+Biscuit3.madeUpOF);
		Biscuit Biscuit4 = new Biscuit();
		System.out.println("Biscuit details : "+Biscuit4.famousIn);
	}
}