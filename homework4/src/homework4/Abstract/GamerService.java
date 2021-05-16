package homework4.Abstract;

import homework4.Entities.Gamer;

public interface GamerService {
	void signUp(Gamer gamer);
	void update (Gamer gamer);
	void delete (Gamer gamer);
}
