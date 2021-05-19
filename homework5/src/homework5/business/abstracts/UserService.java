package homework5.business.abstracts;

import java.util.List;

import homework5.core.abstracts.SignUpService;
import homework5.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signUpWithDifferentService(String email,String password,SignUpService signUpService);
	void login(String email,String password);
	List<User> getAll();
}
