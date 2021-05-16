package homework4.Abstract;

import homework4.Entities.Campaign;
import homework4.Entities.Game;
import homework4.Entities.Gamer;

public interface SalesService {
	void sale(Game game,Gamer gamer);
	void campaignSale(Game game,Gamer gamer,Campaign campaign);
	
}
