class IceCream{
	int price = 40;
	String Name = "IceCream";
	String madeUpOF;
	String famousIn;
	
	IceCream(){
		System.out.println("IceCreams Names");
	}
}

class IceCreams{
	public static void main(String[] args){
		IceCream IceCream1 = new IceCream();
		System.out.println("IceCream details : "+IceCream1.price+" rupee for 1 piece");
		IceCream IceCream2 = new IceCream();
		System.out.println("IceCream details : "+IceCream2.Name+" is cold");
		IceCream IceCream3 = new IceCream();
		System.out.println("IceCream details : "+IceCream3.madeUpOF);
		IceCream IceCream4 = new IceCream();
		System.out.println("IceCream details : "+IceCream4.famousIn);
	}
}