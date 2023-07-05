class Kabab{
  String name;
  double price;
  String hotelName;
  int noOfPieces;
  boolean takeAway;
  
  Kabab(String name){
    
    System.out.println(name);
    
    System.out.println("Name of the Kabab is "+name);
    this.name=name;
    
  }
  Kabab(String name, double price){
    System.out.println("Name of the kabab is "+name);
    System.out.println("Price of the kabab is "+price);
    this.name=name;
    this.price=price;
  
  }
  
  Kabab(String name, int price, String hotelName){
    System.out.println("Name of the kabab is "+name);
    System.out.println("Price of the kabab is "+price);
    System.out.println("Hotel name is "+hotelName);
    this.name=name;
    this.hotelName=hotelName;
    this.price=price;
    
  }
  
  Kabab(String name, int price, String hotelName, int noOfPieces){
    System.out.println("Name of the kabab is "+name);
    System.out.println("Price of the kabab is "+price);
    System.out.println("Hotel name is "+hotelName);
    System.out.println("No Of Pieces "+noOfPieces);
    this.name=name;
    this.hotelName=hotelName;
    this.price=price;
    this.noOfPieces=noOfPieces;
    
  }
  
  
  Kabab(String name, int price, String hotelName, int noOfPieces, boolean takeAway){
    System.out.println("Name of the kabab is "+name);
    System.out.println("Price of the kabab is "+price);
    System.out.println("Hotel name is "+hotelName);
    System.out.println("No Of Pieces "+noOfPieces);
    System.out.println("Take away "+takeAway);
    this.name=name;
    this.hotelName=hotelName;
    this.price=price;
    this.noOfPieces=noOfPieces;
    this.takeAway=takeAway;
    
  }
  
  
  
}



class KababRunner{
  public static void main(String[] args){
    
    Kabab ref1 = new Kabab("Chicken Kabab");
    Kabab ref2 = new Kabab("Chicken Kabab",1500);
    Kabab ref3 = new Kabab("Chicken Kabab",1500,"Radisson Blue");
    Kabab ref4 = new Kabab("Chicken Kabab",1500,"Radisson Blue",25);
    Kabab ref5 = new Kabab("Chicken Kabab",1500,"Radisson Blue",20,true);
  }
}