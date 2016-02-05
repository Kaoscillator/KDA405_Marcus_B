package Bader;

import com.sun.org.apache.bcel.internal.Constants;

//import java.util.ArrayList;



public class MainBike {
	
	
	private String color; /**Classinstanser*/
	private int price;
	private int size;
	//private String name= "No name";
	
	
	//public MainBike(String color, int size) {
		// TODO Auto-generated constructor stub
		
		/**Creates a new bike with two instance variables, color (String) and size (int). */
		public MainBike(String color, int size){  //**konstruktor*/
			this.size = size;

			
			 /**Loops through colors to check if a color is set in the Constants.java*/
			boolean trueColor = false;
			for (int i = 0; i < constants.COLORS.length; i++){
				if (constants.COLORS[i].equals(color)) {
					trueColor = true;
				}
			}
			/**If a color is the same as one of the colors in Constants.java, */
			if (trueColor == true) {
				this.color = color;
			} else {
				this.color = "404 - Color not found!";
			}
			
			if (size>= constants.MIN_SIZE && size<= constants.MAX_SIZE){
				this.size = size;
			}else{
				this.size = 0;
			}
		}
	
	
	public MainBike (String color, int size, int price){
		this.color = color;
		this.size = size;
		this.price = price;
		
		
	}
	

	public String getColor(){
		return color;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public int getPrice(){
		return this.price;
	

	}
	
	public void setPrice1(int price){//Hämtar constants
		if (price>= constants.MIN_PRICE && price <= constants.MAX_PRICE){
			this.price= price;

			
		}
		}
	
	public void setSize1(int size){
		if (size>= constants.MIN_SIZE && size <= constants.MAX_SIZE){
			this.size = size;
		}
	}
	
	}
	
