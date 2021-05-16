package homework4.Concrete;

import homework4.Abstract.GamerCheckService;
import homework4.Entities.Gamer;

public class GamerCheckManager implements GamerCheckService {

	@Override
	public boolean checkIfRealUser(Gamer gamer) {
		
		return true;
	}

}
