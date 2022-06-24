package BusResrv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Booking {
	String passengerName;
	int busNo;
	Date date; 
	
	Booking()  {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of passenger : ");
		passengerName = sc.next();
		
		System.out.println("Enter bus no: ");
		busNo = sc.nextInt();
		
		System.out.println("Enter the date (dd-mm-yyyy)");
		String dateInp = sc.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			date = dateFormat.parse(dateInp);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	 
}
