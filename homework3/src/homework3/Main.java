package homework3;

import java.time.LocalDate;

import homework3.Abstract.BaseCustomerManager;
import homework3.Adapters.MernisServiceAdapter;
import homework3.Concrete.NeroCustomerManager;
import homework3.Concrete.StarbucksCustomerManager;
import homework3.Entities.Customer;

public class Main {

	
	public static void main(String[] args) {
		BaseCustomerManager bcm = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer c1 = new Customer();
		c1.setLastName("lastname");
		c1.setFirstName("firstname");
		c1.setNationalityId("nationalityid");
		c1.setDateOfDay("birthdate");
		
		bcm.save(c1);
		
	}

}
