package work2Thread;

import java.util.ArrayList;

public abstract class Truck  implements Runnable  {
	private int truckID;    // 2000 +
	
	/*
	 *   true === Ready for new shipment
	 *   false=== He is now busy in shipping 
	 */
	private boolean available; 
	
	private  int timeLeft; //The big lie. It never happens in time
	
	//List of transport packages that are in the vehicle
	private  ArrayList<Package> packages;
	
	 
	public Truck ( boolean available ,int  timeLeft) {
		this.truckID=Counter.truckIDCoun.counter();
		this.setAvailable(available);
		this.setTimeLeft(timeLeft);
		ArrayList<Package> packages= new ArrayList();
	}


	public boolean isAvailable() {
		return available;
	}


	public void setAvailable(boolean available) {
		this.available = available;
	}


	public int getTimeLeft() {
		return timeLeft;
	}


	public void setTimeLeft(int timeLeft) {
		this.timeLeft = timeLeft;
	}
	
	

}
