package bader;

import java.util.ArrayList;

public class Human{
	
	private String name; /**Classinstanser*/
	private Dog dog;
	//private String info;
	
	
	
	
	public Human(String name) {
		this.name = name;
	
		// TODO Auto-generated constructor stub
	}
	
	public String getName(){
		return  this.name;
		
		
	}

	public void buyDog(Dog dog){
		this.dog = dog;
	}
	
	public String getInfo(){
		
		
	
		
	if (dog == null){
		String info = getName() + "äger inte en hund";
				return info;
		
	}else{
		
		String info = getName() + "äge en hund som heter" + dog.getDogName();
				return info;
	}
}
}
		
		
		

		
		
		
		
		


