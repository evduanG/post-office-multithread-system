

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
	
	public Truck (int truckID, boolean available ,int  timeLeft) {
		this.truckID= truckID;
		this.available=available;
		this.timeLeft = timeLeft;
		ArrayList<Package> packages= new ArrayList();
	}

}
