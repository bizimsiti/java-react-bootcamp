package homework3.Concrete;



import homework3.Abstract.CustomerCheckService;

import homework3.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {	
		return true;
	}

	

}
