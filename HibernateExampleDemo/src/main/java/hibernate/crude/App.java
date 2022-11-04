package hibernate.crude;

import java.util.Scanner;

import hibernate.crude.daoimpl.CustomerDaoImpl;

public class App {
	static Scanner sc = new Scanner(System.in);
	static CustomerDaoImpl cdao = new CustomerDaoImpl();
	public static void main(String[]args) {
		char a;
		do {
			System.out.println("----------Customer Management---------");
			System.out.println(" 1.Read \n 2.Add \n 3.Update \n 4.Delete \n 5.Exit");
			System.out.println("Enter Your Choice : ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch(choice) {
			case 1 : cdao.getCustomer();
				break;
				
			case 2 : cdao.addCustomer();
				break;
				
			case 3 : cdao.updateCustomer();
				break;
				
			case 4 : cdao.deleteCustomer();
				break;
				
			case 5 : System.exit(0);
				break;
				
			default : System.out.println("-----You Entered wrong Input----");
			}
			System.out.println("Do You Want To Continue?: Y/N");
			 a = sc.next().charAt(0);
		}while(a == 'Y' || a == 'y');
		System.out.println("--------Thank You!------");
	}

}
