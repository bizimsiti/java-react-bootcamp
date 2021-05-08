package homework2;

public class StudentManager extends UserManager{
	
	public void listStudent(Student[] students) {
		for(Student student: students) {
			System.out.println("Name : "+student.firstName);
			
			
		};
			
	}
	
}
