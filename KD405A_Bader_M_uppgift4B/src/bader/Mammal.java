package bader;

public abstract class Mammal extends Animal {/*är också animal ärver från Animalklassen*/
	
	private int  gestationTime;

	public Mammal(String latinName, int gestationTime) {
		
		super (latinName);
		// TODO Auto-generated constructor stub
	}
	
	public int getGestationTime(){
		return this.gestationTime;

}
	
}
