package homework5.dataAccess.abstracts;

import java.util.List;

import homework5.entities.concretes.User;



public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(User user);
	User getUser(String email,String password);
	boolean getEmail(String email);
	List<User> getAllUsers();
}
