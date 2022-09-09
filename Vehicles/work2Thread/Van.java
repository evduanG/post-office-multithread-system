package work2Thread;

/**
 * 
 * @author eviatar
 *Or from the sender to the local branch
 *Or from the local branch to the recipient of the package
 */
public class Van extends Truck {
	
	

	public Van( boolean available, int timeLeft) {
		super( available, timeLeft);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		while (getTimeLeft()>0) {
			engine();
		}
		
		
	}
	
	public synchronized void engine () {
		while (isAvailable()) {
			try {
			 this.wait();	
			}catch (Exception e) {
				
			}finally {
				TimeLeft--;
			}
		}
	}
	
	
	

}
