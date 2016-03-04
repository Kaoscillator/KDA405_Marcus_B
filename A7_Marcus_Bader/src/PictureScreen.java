import java.awt.Color;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class PictureScreen {

	public static void main(String[] args) {
		PixelController px = PixelController.getInstance(Screen.FLOOR_5);
		// TODO Auto-generated method stub
				
				//Väntar på kontakt med skärm
				
				int i= 0;
		while (!px.isConnected() && i <15){
			try {
				Thread.sleep(500);
				System.out.println("Försöker konnekta mannen");
			}catch (InterruptedException e){
				e.printStackTrace();
			}
			i++;
		}
		
		//Rita på skärmen när du är konnekted
		if (px.isConnected()){
			
			System.out.println("Konnektad");
			
			System.out.println("size on screen" + px.getNumberPixelsWidestSide() + " : " + px.getNumberPixelsShortestSide());
			
			px.setPixel(10, 10, Color.BLACK);// int x int y, Color
			px.setPixel(10, 11, Color.BLACK);
			px.setPixel(10, 12, Color.BLACK);
			px.setPixel(10, 13, Color.BLACK);
			px.setPixel(10, 14, Color.BLACK);
			px.setPixel(10, 15, Color.BLACK);
			px.setPixel(10, 16, Color.BLACK);
			px.setPixel(10, 17, Color.BLACK);
			px.setPixel(10, 18, Color.BLACK);
			px.setPixel(10, 17, Color.BLACK);
			px.setPixel(10, 11, Color.BLACK);
			px.setPixel(10, 12, Color.BLACK);
			px.setPixel(10, 13, Color.BLACK);
			px.setPixel(10, 14, Color.BLACK);
			px.setPixel(10, 15, Color.BLACK);
			px.setPixel(10, 16, Color.BLACK);
			px.setPixel(10, 17, Color.BLACK);
			px.setPixel(11, 18, Color.BLACK);
			px.setPixel(12, 17, Color.BLACK);
			px.setPixel(13, 18, Color.BLACK);
			px.setPixel(14, 17, Color.BLACK);
			px.setPixel(15, 11, Color.BLACK);
			px.setPixel(16, 12, Color.BLACK);
			px.setPixel(17, 13, Color.BLACK);
			px.setPixel(18, 14, Color.BLACK);
			px.setPixel(19, 15, Color.BLACK);
			px.setPixel(20, 10, Color.BLACK);
			px.setPixel(21, 11, Color.BLACK);
			px.setPixel(22, 12, Color.BLACK);
			px.setPixel(23, 13, Color.BLACK);
			px.setPixel(15, 14, Color.BLACK);
			px.setPixel(16, 13, Color.BLACK);
			px.setPixel(17, 15, Color.BLACK);
			px.setPixel(18, 16, Color.BLACK);
			px.setPixel(19, 17, Color.BLACK);
			px.setPixel(20, 18, Color.BLACK);
			px.setPixel(21, 19, Color.BLACK);
			px.setPixel(22, 20, Color.BLACK);
			px.setPixel(23, 21, Color.BLACK);
			
		}
	}

}
