package ExampleThree;

public class InstructorUser extends User{
	
	String resume;
	Course [] myCourses;
	
	public InstructorUser() {
		
		
	}

	public InstructorUser(String resume) {
		super();
		this.resume = resume;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}
	
	public void getMyCourses() {
		
		
	 int i = 0;
	 for (Course course : myCourses) {
			System.out.println(i + ".Eðitimim: " + course.courseName);
			i++;
	}
	
	

}
}
