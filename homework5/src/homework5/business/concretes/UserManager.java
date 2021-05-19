package homework5.business.concretes;

import java.util.List;

import homework5.business.abstracts.UserService;
import homework5.core.abstracts.SignUpService;
import homework5.dataAccess.abstracts.UserDao;

import homework5.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	ValidationManager vm = new ValidationManager();
	@Override
	public void signUp(User user) {
		
		
		if(vm.userIsValid(user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword())) {
			userDao.add(user);
			vm.sendConfirmMail();
		}
			
	}
	@Override
	public void login(String email, String password) {
		if(userDao.getUser(email, password) !=null) {
			System.out.println("giriþ yapýldý! ");
		}else {
			System.out.println("parola veya þifre yanlýþ");
		}
		
	}

	@Override
	public List<User> getAll() {
		return userDao.getAllUsers();
	}

	@Override
	public void signUpWithDifferentService(String email, String password, SignUpService signUpService) {
		
		signUpService.SignUpWithDifferentAccount(email, password);
		vm.sendConfirmMail();
		
	}

	

}
