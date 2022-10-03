package question1.main;

import java.util.Scanner;
import javax.naming.InvalidNameException;

public class Main {

    public static void main(String[] args) throws InvalidNameException {

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Enter Your Name");
            String fullName = sc.nextLine();
            String nameArray = (String) fullName;
           
            
            
            System.out.println("Do you want to enter another name: " );
            int decesion = sc.nextInt();
            sc.nextLine();
            switch (decesion){
           
            case 2 : System.exit(0);
            
            }
            
        }
    }
}
		



