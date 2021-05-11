package homework3.Abstract;

import homework3.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public  void save(Customer customer) {
		System.out.println("saved to DB. " +customer.getFirstName());
	};
}
