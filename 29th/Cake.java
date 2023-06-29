class Cake{
	int price = 600;
	String cakeName = "pastries";
	String madeUpOF;
	String famousIn;
	
	Cake(){
		System.out.println("Sweet Names");
	}
}

class Cakes{
	public static void main(String[] args){
		Cake cake1 = new Cake();
		System.out.println("cake details : "+cake1.price+" rupee for 1 kg");
		Cake cake2 = new Cake();
		System.out.println("cake details : "+cake2.cakeName+" is gud cake");
		Cake cake3 = new Cake();
		System.out.println("cake details : "+cake3.madeUpOF);
		Cake cake4 = new Cake();
		System.out.println("cake details : "+cake4.famousIn);
	}
}