package homework3.Concrete;

import homework3.Abstract.BaseCustomerManager;
import homework3.Abstract.CustomerCheckService;
import homework3.Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	public CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}


	@Override
	public void save(Customer customer) {
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}
		else {
			System.out.println("Not a valid person");
		}
	}
	
	
}
