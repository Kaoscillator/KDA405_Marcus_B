package Bader;

//import java.util.ArrayList;



public class MainBike {
	
	
	private String color; /**Classinstanser*/
	private int price;
	private int size;
	//private String name= "No name";
	
	
	
	
	public MainBike(){
		
	
		
	}
	
	
	public MainBike(String color, int size) {
		// TODO Auto-generated constructor stub
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
	
