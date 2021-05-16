package homework4.Concrete;

import homework4.Abstract.GameService;
import homework4.Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println("Game name: "+game.getName() +" Game Release date : "+game.getReleaseDate());
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName()+ " updated.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName()+ " deleted.");
	}
	
}
