package ExampleThree;

public class InstructorManager extends UserManager{
	
	public void addCourse(User user, Course course) {
		
		System.out.println("Eðitmen: " + user.fullName + " " + course.courseName + " eðitimi eklendi...");
		
	}
	public void addHomework(InstructorUser instructorUser, Course course) {
		
		System.out.println("Eðitmen : " + instructorUser.fullName + course.courseName + "kursuna ödev eklendi..");
		
	}

}
