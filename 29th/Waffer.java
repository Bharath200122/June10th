class Waffer{
	int price = 20;
	String Name = "Waffer";
	String madeUpOF;
	String famousIn;
	
	Waffer(){
		System.out.println("Sweet Names");
	}
}

class Waffers{
	public static void main(String[] args){
		Waffer Waffer1 = new Waffer();
		System.out.println("Waffer details : "+Waffer1.price+" rupee for 1 piece");
		Waffer Waffer2 = new Waffer();
		System.out.println("Waffer details : "+Waffer2.Name+" harm for health");
		Waffer Waffer3 = new Waffer();
		System.out.println("Waffer details : "+Waffer3.madeUpOF);
		Waffer Waffer4 = new Waffer();
		System.out.println("Waffer details : "+Waffer4.famousIn);
	}
}