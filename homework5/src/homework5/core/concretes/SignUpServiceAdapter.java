package homework5.core.concretes;

import homework5.GoogleService.GoogleSignUpManager;
import homework5.core.abstracts.SignUpService;

public class SignUpServiceAdapter implements SignUpService{

	@Override
	public void SignUpWithDifferentAccount(String email, String password) {
		GoogleSignUpManager googleSingUpManager = new GoogleSignUpManager();
		googleSingUpManager.signUp(email, password);
		
	}

}
