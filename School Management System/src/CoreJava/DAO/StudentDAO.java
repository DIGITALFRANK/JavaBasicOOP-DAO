package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.File;
import java.io.FileReader;
import java.util.List;

// list all students
// show students / emails
// students validated to enter site (school management system)

public class StudentDAO {
	
	private List<Student> studentList;
	
    public List<Student>  getStudents(){
    	// make sure path to file is correct for YOUR machine
    	String fileName = "/Users/nycda/Desktop/students.csv";
    	File file = new File(fileName);

    	CsvFileReader.readCsvFile(studentList);
    	// CsvFileReader.readCsvFile(fileName);

    	FileReader fileReader = null;
    
	    try {
	    	
	    }
	    catch (Exception e) {
	        System.out.println("Error in CsvFileReader!");
	        e.printStackTrace();
	    } 
	    finally {
	
	        try {
	            //fileWriter.flush();
	            fileReader.close();
	            
	        } 
	        catch (Exception e) {
	            System.out.println("Error while closing fileReader!");
	            e.printStackTrace();
	        }
		return studentList;
	    }
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






