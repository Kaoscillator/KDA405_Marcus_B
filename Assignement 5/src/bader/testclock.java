package bader;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class testclock {
	
  public static void main(String[] args) {
	  
	  /*ArrayList <Calendar>dateFormat = new ArrayList <Calendar>();//Skapa en metod också?
		 
		 dateFormat.add(new Calendar(""));
	  
	  for (int i=0; i<Calendar(); i++){*/

       DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
       //get current date time with Date()
       Date date = new Date();
       System.out.println(dateFormat.format(date));
      
       //get current date time with Calendar()
       Calendar cal = Calendar.getInstance();
       System.out.println(dateFormat.format(cal.getTime()));

  }
}

