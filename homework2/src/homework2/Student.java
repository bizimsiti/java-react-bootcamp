package homework2;

public class Student extends User{
	String firstName;
	String lastName;
	String nationalIdentity;
	
	public Student(int id,String status,String firstName, String lastName, String nationalIdentity) {
		super(id,status);
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		
	}
}
