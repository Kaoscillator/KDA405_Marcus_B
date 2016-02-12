package bader;

public class Dog extends Mammal {
	
	private boolean stupid =false;
	
	
 public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid=stupid;
		
		
		// TODO Auto-generated constructor stub
	}
 
 public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		this(latinName, gestationTime, stupid);
		this.setFriendlyName(friendlyName);//Animalmetod
		
 }
 
 public boolean stupid(){
	 return this.stupid;
	 
 }

	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
