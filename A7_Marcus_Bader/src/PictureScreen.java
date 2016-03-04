import java.awt.Color;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class PictureScreen {

	public static void main(String[] args) {
		PixelController px = PixelController.getInstance(Screen.FLOOR_5);
		// TODO Auto-generated method stub
				
				//V�ntar p� kontakt med sk�rm
				
				int i= 0;
		while (!px.isConnected() && i <15){
			try {
				Thread.sleep(500);
				System.out.println("F�rs�ker konnekta mannen");
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			i++;
		}
		
		//Rita p� sk�rmen n�r du �r konnekted
		if (px.isConnected()){
			
			System.out.println("Konnektad");
			
			System.out.println("size on screen" + px.getNumberPixelsWidestSide() + " : " + px.getNumberPixelsShortestSide());
			
			px.setPixel(10, 10, Color.BLUE);// int x int y, Color
			px.setPixel(10, 11, Color.WHITE);
			px.setPixel(10, 12, Color.BLACK);
			px.setPixel(10, 13, Color.WHITE);
			px.setPixel(10, 14, Color.BLACK);
			px.setPixel(10, 15, Color.WHITE);
			px.setPixel(10, 16, Color.BLACK);
			px.setPixel(10, 17, Color.WHITE);
			px.setPixel(10, 18, Color.BLACK);
			px.setPixel(10, 17, Color.WHITE);
			
		}
	}

}
