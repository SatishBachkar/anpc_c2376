
package question2.thread;

public class ThankYou extends Thread {
	public void run() {
		for(int i=0;i<5;i++) {
			
			System.out.println("Thank You");
	    	 try {
				sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}