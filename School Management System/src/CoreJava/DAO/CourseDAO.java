package CoreJava.DAO;

import CoreJava.Models.Course;
import CoreJava.Models.Student;

import java.util.List;

// show all courses


public class CourseDAO {
	
	private List<Course> courseList;

    public List<Course> getAllCourses(){
    	
    	// use FileReader class to access data in the csv file for courses
    	// while next() => create a course object for each row
    	// add the course object to the courseList
    	// return courseList outside of while loop
    	
    	
    	
    	courseList.add(courseID);
    	return coursesList.getAllCourses();

    	try {
    		List<Student> studentSameName = Course.get(student.name);
    		for(Student studentEntry : studentSameName){
    			if(studentEntry.getStudentId() == student.getStudentId()){
    				studentEntry.addCourse(courses);
    			}
    		}
    	}
    	catch(NullPointerException e){
    		e. printStackTrace();
    	}
    }
			
}






