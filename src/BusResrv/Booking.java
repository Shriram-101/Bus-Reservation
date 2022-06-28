package BusResrv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
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

	public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		for (Bus b: buses) {
			
			if(b.getBusNo() == busNo) 
				capacity  = b.getCapacity();
		}
		
		int booked =0;
		for (Booking bk : bookings) {
			if (bk.busNo == busNo && bk.date.equals(date) ) {
				booked++;
				System.out.println( booked + " hai " + passengerName + ": booked");
			}
				
				
		}
		
		return booked<capacity ?true : false;
	}
	 
}
