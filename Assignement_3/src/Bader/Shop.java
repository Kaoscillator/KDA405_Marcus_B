package Bader;

import java.util.ArrayList;


public class Shop{
	
	public Shop(){
		
	}
	
	private ArrayList <MainBike> allBikes = new ArrayList<MainBike>();//**superviktigt att skriva s�h�r!!!*/
	//private String myBikes;
	//private String name;
	
	
	public Shop(String myBikes){
		this.allBikes = new ArrayList<MainBike>();
		//this.myBikes =  myBikes;
		
	}
	   // TODO Auto-generated constructor stub
	public void allBikes(MainBike c){
		if (allBikes.size()<11){
			this.allBikes.add(c);
		}
		
	}
	
	/*public String getPrice() {
		return myBikes;
	}
	public void setName(String myBikes) {
		this.myBikes = myBikes;
	}*/

	public void button(){
		allBikes.remove(0);
	}


	public String getMainBikes(){
		String s = "";
		int counter = 1;
		for (int i = 0; i<allBikes.size();i++){
			s = s + "Bike no: " + (i +1) + " price: " + allBikes.get(i).getPrice() + " size: "+ allBikes.get(i).getSize() + " inches " + " Color " + allBikes.get(i).getColor() + "\n";
			
		}
		return s;/*Vad betyder det h�r s:et egentligen?*/
	
	
	}

public void addBike (String color, int size, int price){
	MainBike b = new MainBike (color,size,price);
	this.allBikes.add(b);
}

}

	
	
	
		
		
			
			
		
		
	

	
