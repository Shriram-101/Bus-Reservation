package BusResrv;

import java.util.*;

public class Bus {
	private int busNo;
	private boolean ac;
	private int capacity;

	Bus(int no, boolean ac, int cap) {
		this.busNo = no;
		this.ac = ac;
		this.capacity = cap;
	}

	public boolean isAc() { // accessor method
		return ac;
	}

	public void setAc(boolean ac) { // mutator
		this.ac = ac;
	}

	public int getCapacity() { // accessor
		return capacity;
	}

	public void setCapacity(int capacity) { // mutator
		this.capacity = capacity;
	}
	
	public int getBusNo() {
		return busNo;
	}

	public void displayBusInfo() {
		System.out.println("BusNo : " + busNo + ", Ac : " + ac + ", Capacity : " + capacity);
	}

	public String toString() {

		  String info = "BusNo : " + this.busNo + ", Ac : " + this.ac + ", Capacity : "
		  + this.capacity;
		 
		 

			/*
			 * System.out.println("BusNo : " + this.busNo + ", Ac : " + this.ac +
			 * ", Capacity : " + this.capacity);
			 */ 

		return info;
	}

}
