package work2Thread;

import java.util.ArrayList;

public class Branch  extends Thread  {
	private int  branchId;
	private  ArrayList <Truck> listTrucks; // list of 
	private  ArrayList <Package>  listPackages;
	
	
	public Branch(){
		this.branchId=Counter.branchIdCoun.counter();
		
	}
	
	public void run () {
		
	}
	

}
