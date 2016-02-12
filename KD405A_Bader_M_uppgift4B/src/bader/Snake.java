package bader;

public class Snake extends Animal {
	
	private boolean poisonous =false;

	public Snake(String latinName, boolean poisonous) {
		super(latinName);
		this.poisonous = poisonous;
	     
		// TODO Auto-generated constructor stub
	}
	
	public boolean isPoisunus(){
		return this.poisonous;
	}
     


	@Override
	public String getInfo() {
		// TODO Auto-generated method stub
		return this.latinName;
	}
	
	

}
