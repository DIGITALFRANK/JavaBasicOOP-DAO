package CoreJava.DAO;

import CoreJava.Models.Course;
import CoreJava.Models.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

// show all courses


public class CourseDAO {
	
	static List<Course> courseList;  // static because we will need access to this in the AttendingDAO

	
	
	
    public List<Course> getAllCourses(){
    	
    	// use BufferedReader & FileReader class to access data in the csv file for courses
    	// while next() => create a course object for each row
    	// add the course object to the courseList
    	// return courseList outside of while loop
    	
    	// make sure path to file is correct for YOUR machine
    	String coursesCSV = "/Users/frankie/eclipse-workspace/Java_Basics_FinalProject/courses.csv";
    	File file = new File(coursesCSV);
    	BufferedReader reader;
    	String course;
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((course = reader.readLine()) != null) {
				String[] courseValues = course.split(",");
				Course theCourse = new Course(Integer.parseInt(courseValues[0]), courseValues[1], courseValues[2]);   // Integer.parseInt() because we defined the Constructor to take the id property as an int	
				courseList.add(theCourse);
	    	}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return courseList;
    }
			
}






