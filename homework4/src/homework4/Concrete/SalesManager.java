package homework4.Concrete;

import homework4.Abstract.SalesService;
import homework4.Entities.Campaign;
import homework4.Entities.Game;
import homework4.Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void sale(Game game, Gamer gamer) {
		System.out.println(game.getName() + " sold to " + gamer.getFirstName() + " .");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		System.out.println(game.getName() + " sold to " + gamer.getFirstName() + " Campaign Name : "+ campaign.getName());
		
	}

}
