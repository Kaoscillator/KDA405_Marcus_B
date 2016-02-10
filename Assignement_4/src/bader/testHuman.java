package bader;

import java.util.ArrayList;

public class testHuman {

	
public static void main(String[] args) {
		
		
			
			ArrayList <Human> dogOwner = new ArrayList <Human>();
			 
			 dogOwner.add(new Human("Hans"));
			 dogOwner.add(new Human("Lena"));
			 dogOwner.add(new Human("Uffe"));
			 dogOwner.add(new Human("Bror"));
			 dogOwner.add(new Human("Anna"));
			 dogOwner.add(new Human("Ulla"));
			 dogOwner.add(new Human("Brolle"));
			 dogOwner.add(new Human("Jan"));
			 dogOwner.add(new Human("Catti"));
			 dogOwner.add(new Human("Unni"));
			 
			 
		    
				
				System.out.println (" This is a test for Human program"); //Skriver ut i konsol
				System.out.println (" **Start test");
			
				for (int i=0; i<dogOwner.name(); i++){ //itererar genom arrayen
					
					
					System.out.println(dogOwner.get(i).getName() +  " äger en hund som heter " + dogOwner.get(i).getDog());
				}
		// TODO Auto-generated method stub

	}

}
