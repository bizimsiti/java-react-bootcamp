package homework4;

import java.time.LocalDate;

import homework4.Concrete.GameManager;
import homework4.Concrete.GamerCheckManager;
import homework4.Concrete.GamerManager;
import homework4.Concrete.SalesManager;
import homework4.Entities.Campaign;
import homework4.Entities.Game;
import homework4.Entities.Gamer;

public class Main {

	public static void main(String[] args) {
		Game game1 = new Game(1,"civilization 6",LocalDate.of(2016, 10, 26),2000);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		Gamer gamer1 =new Gamer(1, "ali", "metin", "987865446", "asda@gmail.com");
		GamerManager gamerManager = new GamerManager(new GamerCheckManager());
		gamerManager.signUp(gamer1);
		
		Campaign summerCampaign = new Campaign(
				1, "Summer Campaign",10, LocalDate.of(2021, 6, 10), LocalDate.of(2021, 7, 10)
				);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sale(game1, gamer1);
		
		salesManager.campaignSale(game1, gamer1, summerCampaign);
	}

}
