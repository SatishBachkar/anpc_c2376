package question1.service;

import question1.model.Customer;

public class CustomerService {

	 public void checkEligibility(Customer Customer) {
		 
		   int newage = Customer.getage();
		    
		   if (newage >= 18) {
			   System.out.println("true");
		   }
		   else {
			   System.out.println("false"); 
		   }
	 }
	 
	

}
