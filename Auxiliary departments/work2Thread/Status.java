package work2Thread;

public enum Status {
	/**package Maker Initial status of each total package.*/
	CREATION , 
	
	/**This status is a package received when a transport vehicle 
	is sent not the same from the sender's address.*/
	COLLECTION , 
	
	/**
	 * Storage at branch (STORAGE_BRANCH -) The package collected from a customer 
	who arrived at the sender's local branch.
	*/
	STORAGE_BRANCH,	
	
	/**Transfer to the sorting center (TRANSPORT_HUB 
	 * - (the package on the way from the local branch to the sorting center.
	 */
	
	TRANSPORT_HUB,
	
	/**
	 * The package is waiting
	 * The package has arrived at the sorting center 
	 * and is awaiting transfer to the destination branch
	 */
	STORAGE_HUB,
	
	/**
	 * The package is ontheway
	 * On the way to the last branch
	 *The package is on its way from the sorting center to the destination branch
	 */
	TRANSPORT_BRANCH,
	
	/**
	 * Last post office
	 *A package has arrived at the destination branch and is
	 * ready for delivery to the end customer.
	 */
	DELIVERY,
	
	/**
	 * Last delivery vehicle
	 * Step before completion
	 * The package on the way from the destination branch to the end customer.
	 */
	DISTRIBUTION,
	
	/**
	 * Finishing stage
	 * The package was delivered to the end customer.
	 */
	DELIVERED,
	

}
