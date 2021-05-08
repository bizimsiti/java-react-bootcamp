package homework2;

public class Instructor extends User{
	String firstName;
	String lastName;
	String branch;
	
	public Instructor(int id,String status,String firstName, String lastName, String branch) {
		super(id,status);
		this.firstName = firstName;
		this.lastName = lastName;
		this.branch = branch;
		
	}
}
