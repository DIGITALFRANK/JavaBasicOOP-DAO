package CoreJava.Models;

public class Attending {

	private int courseID;
	private String studentEmail;

	
	public Attending(int courseID, String studentEmail) {
		this.courseID = courseID;
		this.studentEmail = studentEmail;
	}

	public int getCourseID() {
		return courseID;
	}

	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
}
