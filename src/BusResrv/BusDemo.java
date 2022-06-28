package BusResrv;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo {
	public static void main(String[] args) {
		
		
		
		ArrayList<Bus> buses = new ArrayList <Bus> ();
		buses.add(new Bus(1, true, 2));
		buses.add(new Bus(2, false, 48));
		buses.add(new Bus(3, true, 50));
		
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		
		
	int userOpt =1;
	Scanner sc = new Scanner(System.in);
	
	
		System.out.println(buses);
		
		
	while (userOpt ==1) {
		System.out.println("Enter 1 to book and 2 to exit");
		userOpt = sc.nextInt();
		
		if (userOpt == 1) {
			Booking book = new Booking();
			
		//	if(BusDemo.booked !=0) {
				
			
				if (book.isAvailable(bookings, buses)) {
					bookings.add(book);
					System.out.println("Your booking is confirmed");
				}
				else
					System.out.println("Bus is full! pls try other bus or date");
			} 
			
		
			
		}
	
	}
		
}


