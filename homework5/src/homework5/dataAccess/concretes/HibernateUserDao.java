package homework5.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import homework5.dataAccess.abstracts.UserDao;
import homework5.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	List<User> users = new ArrayList<User>();
	@Override
	public void add(User user) {
		System.out.println("Hibernate ile eklendi. "+ user.getFirstName());
		
		users.add(user);
		
	}

	@Override
	public void update(User user) {
		System.out.println("Hibernate ile güncellendi. "+ user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Hibernate ile silindi. "+ user.getFirstName());
		
	}

	@Override
	public User getUser(String email,String password) {
		User loginUser = null;
		for(User user:users) {
			if(user.getEmail()==email && user.getPassword()==password) {
				loginUser = user;
			}
			
		}
		return loginUser;
		
		/*
		 * if(email == user1.getEmail() && password== user1.getPassword()) { return
		 * user1; } else return null;
		 */
	}

	@Override
	public List<User> getAllUsers() {
		return users;
	}

	@Override
	public boolean getEmail(String email) {
		
		
		return true;
	}

	

}
