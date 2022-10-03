
package question2.main;

import question2.thread.ThankYou;
import question2.thread.Welcome;

public class Main {
    public static void main(String args[]){

        Thread welCome = new Welcome();
        Thread thankYou = new ThankYou();
        welCome.start();
       thankYou.start();
   
      
      
}
}