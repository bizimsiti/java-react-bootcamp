package homework2;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(10,"active","ali","metin","123456623");
		Student s2 = new Student(10,"active","selin","yılmaz","1254543612");

		Instructor i2 = new Instructor(13, "active", "demir", "akkaya", "Python");
		
		
		StudentManager studentManager = new StudentManager();
		InstructorManager instructorManager = new InstructorManager();
		
		Student[] students = {s1,s2};
		studentManager.listStudent(students);
		instructorManager.addUser(i2);
		
		
		
		
	}

}
