package work2Thread;

public class Counter {
	
	private int counter; 

	public final   int LimPackageID=1000; 
	public final   int LimTruckID=2000;
	public final   int limBranchId=0;
	
	public  static Counter packageIDCoun ;
	public static Counter truckIDCoun ;
	public static Counter branchIdCoun;
	
	public Counter (int lim ) {
		this.packageIDCoun= new Counter (LimPackageID) ;
		this.truckIDCoun = new Counter  (LimTruckID);
		this.branchIdCoun = new Counter (limBranchId);
		
	}
	
	public synchronized  int counter () {
		counter++;
		return counter;	
	}

}
