
package question2.thread;

public class Welcome extends Thread{
    public void run()
    {        for(int i = 0 ; i < 5; i++){
           System.out.println("Welcome");
         	 try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

        }
    }
}