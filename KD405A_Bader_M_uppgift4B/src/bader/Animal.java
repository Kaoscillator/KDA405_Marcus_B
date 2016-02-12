package bader;

public abstract class Animal {
	
		
		protected String latinName; /**Classinstanser*/
		private String friendlyName;
		
		

	public Animal(String latinName) {
		this.latinName = latinName;
	}
		// TODO Auto-generated constructor stub
	
	public abstract String getInfo();/*ska vara Abstract*/
	
	
	public void setFriendlyName(String name){
		this.friendlyName = friendlyName;
		
	}
	

	public String getFriendlyName(){
		return friendlyName;
}
	
	



}
