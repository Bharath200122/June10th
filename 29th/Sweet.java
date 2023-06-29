class Sweet{
	int price = 100;
	String sweetName = "Champakalli";
	String madeUpOF;
	String famousIn;
	
	Sweet(){
		System.out.println("Sweet Names");
	}
}

class Sweets{
	public static void main(String[] args){
		Sweet sweet1 = new Sweet();
		System.out.println("sweet details : "+sweet1.price+" rupee for 1 kg");
		Sweet sweet2 = new Sweet();
		System.out.println("sweet details : "+sweet2.sweetName+" is gud sweet");
		Sweet sweet3 = new Sweet();
		System.out.println("sweet details : "+sweet3.madeUpOF);
		Sweet sweet4 = new Sweet();
		System.out.println("sweet details : "+sweet4.famousIn);
	}
}