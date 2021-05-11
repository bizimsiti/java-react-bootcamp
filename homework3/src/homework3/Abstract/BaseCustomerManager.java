package homework3.Abstract;

import homework3.Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public abstract void save(Customer customer);
}
