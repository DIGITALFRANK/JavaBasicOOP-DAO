package CoreJava.Models;

public class Course {

	private int ID;
	private String name;
	private String instructor;
	

	public Course(int ID, String name, String instructor) {

		this.ID = ID;
		this.name = name;
		this.instructor = instructor;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	
	@Override
	public String toString() {
		return "Course ID: " + ID + "\t Course Name: " + name + "\t Instructor: " + instructor;
		
	}
}
