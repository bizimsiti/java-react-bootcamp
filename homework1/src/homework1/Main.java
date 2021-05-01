package homework1;

public class Main {

	public static void main(String[] args) {
		Course java = new Course(1,"Java","Engin Demiroð");
		Course csharp = new Course(2,"C#","Ahmet Aktaþ");
		Course python = new Course(3,"Python","Samet Yýlmaz");
		
		User ali = new User(1,"ali","metin","mail@gmail.com");
		User veli = new User(2,"veli","yýldýz","mail2@gmail.com");
		User metin = new User(3,"metin","seçkin","mail3@gmail.com");
		
		UserManager userManager = new UserManager();
		userManager.addCourse(java);
		
		Course[] courses = {java,csharp,python};
		User[] users = {ali,veli,metin};
		
		for(Course course : courses) {
			System.out.println(course.name);
		}
		for(User user : users) {
			System.out.println(user.lastName);
		}
		
	}

}
