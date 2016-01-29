
public class House {/*instansvariabler*/
	private int yearBuilt;
	private int size;
	private final int minSize = 10;
	private final int maxSize = 1000;
	private final int minYearBuilt = 1800;
	private final int maxYearBuilt = 2015;

	public House(int yearBuilt,int size) {
		this.yearBuilt = yearBuilt;// TODO Auto-generated constructor stub KONSTRUKTOR/variabler
	this.size =size;

	}
	
	public int getYearBuilt(){
		return this.yearBuilt;
		
	}
	public int getSize(){
		return this.size;
	}
	
		
		public int getMinSize(){
			return this.minSize;
			
		}
			
			public int getMaxSize(){
				return this.maxYearBuilt;
			}
				
				public int getMinYearBilt(){
					return this.minYearBuilt;
					
				}
	
	
	
}

