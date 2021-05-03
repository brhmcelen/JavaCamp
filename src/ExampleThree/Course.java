package ExampleThree;

public class Course {
	int id;
	String courseName;
	String courseInstructor;
	
	public Course(int id, String courseName, String courseInstructor) {
		super();
		this.id = id;
		this.courseName = courseName;
		this.courseInstructor = courseInstructor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getCourseInstructor() {
		return courseInstructor;
	}

	public void setCourseInstructor(InstructorUser instructorUser) {
		this.courseInstructor = instructorUser.fullName;
	}
	
	
	

}
