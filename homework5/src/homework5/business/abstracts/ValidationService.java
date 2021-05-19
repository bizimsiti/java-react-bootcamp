package homework5.business.abstracts;

public interface ValidationService {
	boolean checkFirstLastName(String name,String lastName);
	boolean checkMail(String email);
	boolean checkMailExist(String email);
	boolean checkPassword(String password);
	boolean userIsValid(String name,String lastName,String email,String password);
	void sendConfirmMail();
}
