package question1.view;

import question1.service.CustomerService;
import question1.model.Customer;

public class CustomerView {

	public static void main(String[] args) {
	
		CustomerService scObj = new CustomerService();
		scObj.checkEligibility(null);
		
		
	}

}
