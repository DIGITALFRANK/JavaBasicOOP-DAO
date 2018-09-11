package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class AttendingDAO {

	private List<Attending> attendingList = new ArrayList<Attending>();
	
	
	
	// method to get which students are attending which class
    
	public List<Attending> getAttending(){
		// make sure path to file is correct for YOUR machine
    	String attendingCSV = "/Users/Frankie/eclipse-workspace/JavaBasics_FinalProject/attending.csv";
    	File file = new File(attendingCSV);
    	BufferedReader reader;
    	String attending;
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((attending = reader.readLine()) != null) {
				String[] attendingValues = attending.split(",");
				Attending theAttending = new Attending(Integer.parseInt(attendingValues[0]), attendingValues[1]);  // Integer.parseInt() because we defined the Constructor to take the id property as an int	
				attendingList.add(theAttending);
	    	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return attendingList;
    }

	
	
    
    
    // method to register new student to a course 
    
    public void registerStudentToCourse(List<Attending> attendingList, String studentEmail, int courseID){
    	boolean notAttending = true;
    	for (Attending attending: attendingList) {
    		if ((attending.getStudentEmail()) == studentEmail && (attending.getCourseID()) == courseID) {
    			System.out.println("this student is already registered this course");
    			notAttending = false;
    		}
    	}
    	if (notAttending) {
    		Attending newAttending = new Attending(courseID, studentEmail);
    		attendingList.add(newAttending);
    	}
    }

    
    
    
    
    // method to get a particular student's courses
    List<Course> studentCourseList;
    
    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attendingList, String studentEmail){
		for (Attending attending: attendingList) {
    		if ((attending.getStudentEmail()) == studentEmail) {    			
    			for (Course course: CourseDAO.courseList) {
    				if (course.getID() == attending.getCourseID()) {
    					Course studentCourse = course;
    					studentCourseList.add(studentCourse);
    				}
    			}
    		}
    	}
    	return studentCourseList;
    }

    
    
    
    
    
    // method to overwrite the original Attending.csv file
    
    public void saveAttending(List<Attending> attendingList){
    	File attendingCSV = new File("/Users/Frankie/eclipse-workspace/JavaBasics_FinalProject/attending.csv");
    	attendingCSV.delete();
    	File newAttendingCSV = new File("/Users/Frankie/eclipse-workspace/JavaBasics_FinalProject/attending.csv");
    	
		try {
			FileWriter writer = new FileWriter(newAttendingCSV, false);
			for (Attending attending: attendingList) {
	            writer.write(attending.getCourseID() + "," + attending.getStudentEmail());
	    	}
	    	writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    }

}
