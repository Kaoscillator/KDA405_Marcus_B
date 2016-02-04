package Bader;

public class TestBike {
	
public static void main(String[] args) {
		
		System.out.println (" This is a test for Bike program");
		System.out.println (" **Start test");
	
	 myBikes a = new myBikes ("Blue", "Yellow", "Orange", "White", "Red", "Speckled");
     myBikes b = new myBikes ();
     myBikes c = new myBikes ();
	System.out.println("The bike is :"+ a.getColor()+  "and is" + b.getSize()+ " and costs" + c.getPrice());

}

public void setPrice1(int price){
	if (price>0 && price <= constants.MAX_PRICE){
		this.MAX_PRICE = price;
	}
}

public void setPrice(int price){
	if (price>0 && price <= constants.MIN_PRICE){
		this.MIN_PRICE = price;
	}
}

public void setSize1(int size){
	if (size>0 && size <= constants.MAX_SIZE){
		this.MIN_SIZE = size;
	}
}

public void setSize(int size){
	if (size>0 && size <= constants.MIN_SIZE){
		this.MIN_SIZE = size;
	}
}
}