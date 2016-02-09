package bader;

import java.util.ArrayList;

public class testHuman {

	
public static void main(String[] args) {
		
		
			
			ArrayList <Human> dogOwner = new ArrayList <Human>();
			 
			 dogOwner.add(new Human("Anders",0));
			 dogOwner.add(new Human("Per",0));
			 dogOwner.add(new Human("Lars", 0));
			 dogOwner.add(new Human("Marcus",0));
			 dogOwner.add(new Human("Pia",0));
			 dogOwner.add(new Human("Jeanette",0));
			 dogOwner.add(new Human("Bruno",0));
			 dogOwner.add(new Human("Lasse",0));
			 dogOwner.add(new Human("Hiwa",0));
			 dogOwner.add(new Human("Samira",0));
		    
				
				System.out.println (" This is a test for Bike program"); //Skriver ut i konsol
				System.out.println (" **Start test");
			
				for (int i=0; i<dogOwner).name(); i++){ //itererar genom arrayen
					
					
					System.out.println(dogOwner.get(i).getName() +  " äger en hund som heter " + dogOwner.get(i).getDog());
				}
		// TODO Auto-generated method stub

	}

}
