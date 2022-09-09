package work2Thread;
import java.util.Random;

public class StandardTruck  extends Truck {
	  
   static  Random random = new Random();
	
	private int maxWeight;
	private Branch destination; 
	
	public StandardTruck () {
		super(false  ,10);
		this.maxWeight= random.nextInt(100)+1;
		
	}
	public StandardTruck(int maxWeight) {
		super(false  ,10);
		this.maxWeight= maxWeight;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
