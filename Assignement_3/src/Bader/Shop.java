package Bader;

import java.util.ArrayList;

public class Shop {
	
	/*private ArrayList <MainBike> allBikes;*/
	/*private MainBike [] myBikes;*/
	private ArrayList<MainBike> allBikes  = new ArrayList<MainBike>();
	private String name;
	
	
	
	
	
	// TODO Auto-generated constructor stub

	
		
		public MainBike(String name){
			this.allBikes = new ArrayList<MainBike>();
			this.name = name;
		}
	public void allBikes(MainBike c){
		if (allBikes.size()<101){
			this.allBikes.add(c);
		}
		
	}
	
}
	
	
	
		
		
			
			
		
		
	

	
