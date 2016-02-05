package Bader;

import java.util.ArrayList;

public class TestShop {

	public static void main(String[] args) {
		
		ArrayList <MainBike> bikesTest = new ArrayList <MainBike>();
		 
		 bikesTest.add(new MainBike("black",5, 1050));
		 bikesTest.add(new MainBike("blue",4, 800));
		 bikesTest.add(new MainBike("yellow",3, 789));
		 bikesTest.add(new MainBike("green",3, 700));
		 bikesTest.add(new MainBike("white",2, 200));
		 bikesTest.add(new MainBike("brown",7, 300));
		 bikesTest.add(new MainBike("purple",5, 1050));
		 bikesTest.add(new MainBike("red",5, 3400));
		 bikesTest.add(new MainBike("grey",6, 1090));
		 bikesTest.add(new MainBike("orange",7, 1000));
	    
			
			System.out.println (" This is a test for Bike program");
			System.out.println (" **Start test");
		
		for (int i=0; i<bikesTest.size(); i++){
			
			
		System.out.println("The bike is "+ bikesTest.get(i).getColor() +  " and is " + bikesTest.get(i).getSize() + " and costs " + bikesTest.get(i).getPrice());
	


	}
		// TODO Auto-generated method stub

	}

}
