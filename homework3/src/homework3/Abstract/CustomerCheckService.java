package homework3.Abstract;

import homework3.Entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}
