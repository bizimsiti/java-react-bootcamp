package homework4.Concrete;

import homework4.Abstract.GamerCheckService;
import homework4.Abstract.GamerService;
import homework4.Entities.Gamer;

public class GamerManager implements GamerService{
	
	private GamerCheckService _gamerCheckService;
	
	public GamerManager(GamerCheckService gamerCheckService) {
		super();
		this._gamerCheckService = gamerCheckService;
	}

	@Override
	public void signUp(Gamer gamer) {
		if(_gamerCheckService.checkIfRealUser(gamer)) {
			System.out.println("Name : "+gamer.getFirstName() + " registered.");
		}
		else {
			System.out.println("invalid user !");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Name : "+gamer.getFirstName() + " information is updated!");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Name : "+gamer.getFirstName() + " deleted.");
		
	}

}
