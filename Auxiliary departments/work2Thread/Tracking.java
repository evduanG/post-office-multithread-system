package work2Thread;

/**
 * 
 * @author eviatar
 *The department represents a record in the transfer history of a package.
 * Each package contains a collection of records
 * This style, each time the status (and location) of a package is changed,
 *  a new record is added to the collection.
 */
public class Tracking {
	
	//Package location - customer / branch / sorting center / transport vehicle. 
	private  Node node;
	
	private Status status;
	
	//Constructors:
	public Tracking(Node node, Status status) {
		
	}
	
	// Methods
	
	public void collectPackage(Package p) {
		//Handles the collection / receipt of a package by the implementing department.
		
	}
	
	public void deliverPackage(Package p) {
		//A method that handles the delivery of the package to the next party in the transfer chain
	}
		
		

}
