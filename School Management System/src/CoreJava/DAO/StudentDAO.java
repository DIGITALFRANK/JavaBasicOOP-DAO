package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

// list all students
// show students / emails
// students validated to enter site (school management system)

public class StudentDAO {
	
	private List<Student> studentList;
	
    public List<Student>  getStudents() {
    	// make sure path to file is correct for YOUR machine
    	String studentsCSV = "/Users/frankie/eclipse-workspace/Java_Basics_FinalProject/students.csv";
    	File file = new File(studentsCSV);
    	BufferedReader reader;
    	String student;
		try {
			reader = new BufferedReader(new FileReader(file));
			while ((student = reader.readLine()) != null) {
				String[] studentValues = student.split(",");
				Student theStudent = new Student(studentValues[0], studentValues[1], studentValues[2]);
				studentList.add(theStudent);
	    	}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return studentList;
    }
    
    
    
    

    public Student getStudentByEmail(List<Student> studentList, String studentEmail){
    	for (Student student: studentList) {
    		
    	}
    	
    	
		return null;
    }
    
    
    

    public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass) {
    	for (Student student: studentList) {
    		if((studentEmail).equals(student.getEmail()) && (studentPass).equals(student.getPass())) {
        		// if((studentEmail == setEmail) && (studentPass == setPass)) {
                System.out.println("Login Successful!");
                return true;
            }
            else{
                System.out.println("Incorrect username or password");
                return false;
            }
    	}	
    } 
    
}






