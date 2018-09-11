package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

// list all students
// show students / emails
// students validated to enter site (school management system)

public class StudentDAO {
	
	private List<Student> studentList = new ArrayList<Student>();
	
	
	
	
	// method to retrieve all students in the form of a list of Student objects
	
    public List<Student>  getStudents() {
    	// make sure path to file is correct for YOUR machine
    	String studentsCSV = "/Users/Frankie/eclipse-workspace/JavaBasics_FinalProject/students.csv";
    	File file = new File(studentsCSV);
    	BufferedReader reader;
    	String student;
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((student = reader.readLine()) != null) {
				System.out.println(student);
				String[] studentValues = student.split(",");
				Student theStudent = new Student(studentValues[0], studentValues[1], studentValues[2]);
				studentList.add(theStudent);
	    	}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentList;
    }
    
    
    
    
    
    // method to retrieve specific student from the list by their email
    
    public Student getStudentByEmail(List<Student> studentList, String studentEmail){
    	for (Student student: studentList) {
    		if (studentEmail.equals(student.getEmail())) {
                System.out.println("Login Successful!");
                return student;
            }
    	}
		return null;
    }
    
    
    
    
    
    // validate student is in the list by their email and password

    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass) {
    	for (Student student: studentList) {
    		if (studentEmail.equals(student.getEmail()) && studentPass.equals(student.getPass())) {
                System.out.println("Login Successful!");
                return true;
            }
            else {
                System.out.println("Incorrect username or password");
                return false;
            }
    	}
    	return false;
    } 
    
}






