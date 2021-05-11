package homework3;

import java.time.LocalDate;

import homework3.Abstract.BaseCustomerManager;
import homework3.Concrete.NeroCustomerManager;
import homework3.Entities.Customer;

public class Main {

	
	public static void main(String[] args) {
		BaseCustomerManager bcm = new NeroCustomerManager();
		Customer c1 = new Customer();
		c1.setFirstName("ali");
		c1.setDateOfDay(LocalDate.of(1994,4,16));
		
		bcm.save(c1);
		
	}

}
