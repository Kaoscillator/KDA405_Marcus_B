package Bader;

import java.util.ArrayList;


public class Shop{
	
	private ArrayList <MainBike> allBikes;
	private String myBikes;
	//private String name;
	
	
	public Shop(String myBikes){
		this.allBikes = new ArrayList<MainBike>();
		this.myBikes =  myBikes;
		
	}
	   // TODO Auto-generated constructor stub
	public void allBikes(MainBike c){
		if (allBikes.size()<11){
			this.allBikes.add(c);
		}
		
	}
	
	public String getPrice() {
		return myBikes;
	}
	public void setName(String myBikes) {
		this.myBikes = myBikes;
	}

	public void button(){
		allBikes.remove(0);
	}

public String getMainBikes(){
		String s = this.myBikes +"\n";
		for (MainBike allBikes : allBikes){
			s = s + "Name" + allBikes.getPrice() + "Age:"+ allBikes.getSize() + allBikes.getColor() + "\n";
			
			
		}
		return s;
	
	}

}

	
	
	
		
		
			
			
		
		
	

	
