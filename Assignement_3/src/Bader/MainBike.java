package Bader;

//import java.util.ArrayList;



public class MainBike {
	
	
	private String color = "BLUE"; //Classinstanser
	private int price = 0;
	private int size = 0;
	private String name = "No name";
	
	
	
	
	public MainBike(){
		
		this.name = "Cykel";
		
	}
	
	
	public MainBike(String color) {
		// TODO Auto-generated constructor stub
	}

	public String getColor(){
		return this.color;
	}
	
	public int getSize(){
		return this.size;
	}
	
	public int getPrice(){
		return this.price;
	

	}
	
	public void setPrice1(int price){
		if (price>0 && price <= constants.MAX_PRICE()){
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
