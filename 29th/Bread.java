class Bread{
	int price = 40;
	String Name = "Bread";
	String madeUpOF;
	String famousIn;
	
	Bread(){
		System.out.println("Sweet Names");
	}
}

class Breads{
	public static void main(String[] args){
		Bread Bread1 = new Bread();
		System.out.println("Bread details : "+Bread1.price+" rupee for 1 pound");
		Bread Bread2 = new Bread();
		System.out.println("Bread details : "+Bread2.Name+" is gud for health");
		Bread Bread3 = new Bread();
		System.out.println("Bread details : "+Bread3.madeUpOF);
		Bread Bread4 = new Bread();
		System.out.println("Bread details : "+Bread4.famousIn);
	}
}