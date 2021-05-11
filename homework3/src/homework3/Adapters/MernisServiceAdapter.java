package homework3.Adapters;

import java.rmi.RemoteException;

import homework3.Abstract.CustomerCheckService;
import homework3.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfDay().getYear());
		} catch (NumberFormatException | RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
	}

}
