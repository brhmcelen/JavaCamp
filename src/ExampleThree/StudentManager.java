package ExampleThree;

public class StudentManager extends UserManager{
	
	public void addCourse(User user, Course course) {
		System.out.println(" Öðrenci : " + user.fullName + " " + course.courseName + "eðitimini kurslarýna ekledi.");
	}

	public void doneHomework(StudentUser studentUser, Course course) {
		System.out.println(studentUser.fullName + " öðrenci " + course.courseName + " kursunun ödevlerini tamamladý.");
		
	}

}
