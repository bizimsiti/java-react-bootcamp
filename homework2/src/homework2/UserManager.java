package homework2;

public class UserManager {
	public void addUser(User user) {
		System.out.println("id : "+user.getId()+ " added.");
	}
	public void deleteUser(User user) {
		System.out.println("id : " + user.getId()+ " deleted.");
	}
	
}
