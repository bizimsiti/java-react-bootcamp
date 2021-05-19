package homework5;


import java.util.List;

import homework5.business.concretes.UserManager;
import homework5.core.concretes.SignUpServiceAdapter;
import homework5.dataAccess.concretes.HibernateUserDao;
import homework5.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1, "ali", "metin", "deneme@gmail.com", "123456");
		User user2 = new User(2, "mehmet", "metin", "deneme2@gmail.com", "98765432");
		User user3 = new User(3,"ahmet","yýldýz","deneme3@gmail.com","776212521");
		
		UserManager userManager = new UserManager(new HibernateUserDao());
		
		userManager.signUp(user1);
		userManager.signUp(user2);
		
	    userManager.login("deneme13@gmail.com","98765432");
		
	   
	   userManager.signUpWithDifferentService("hoccalo@gmail.com","1233456",new SignUpServiceAdapter());
		
	}

}
