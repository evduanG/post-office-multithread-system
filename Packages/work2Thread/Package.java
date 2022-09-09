package work2Thread;

import java.util.ArrayList;

public class Package {
	
	private int packageID; //1000+
	private   Status status;
	private Address	senderAddress;
	private Address destinationAddress;
	private ArrayList <Tracking> tracking;

	public Package (Address senderAddress, Address destinationAdress) {
		this.packageID= Counter.packageIDCoun.counter();
		
	}
	
	public void addTracking (Node node, Status status) {
		
	}
	
	public void printTracking () {
		
	}
}
