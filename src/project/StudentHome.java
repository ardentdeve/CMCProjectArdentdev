/*
 * File: StudentHome.java
 */
package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * Class that creates the methods that a Student can use
 * 
 * @author Ardent Developers
 * @version March, 2016
 */

public class StudentHome {
	/** An arrayList containing all of the students*/
	private ArrayList<Student>allStudents;
	/** Reference to the DBController*/
	private DBController dbl;
	/** Reference to Student object */
	private Student stu;
	/** Reference to the StudentUI */
	private StudentUI studentUI;

	/**
	 * Constructor.
	 * 
	 * @param d database
	 * @param username username to set
	 * @param password password to set
	 */
	
	public StudentHome(String d, String username, String password) {
		stu = null;
		 dbl = new DBController(d,username,password);
	}
	
	/**
	 * method to log the student in
	 * @param username username of the student that logs in
	 * @param password password of the student that logs in
	 * @return the student that is logged in
	 */
	
	public Student login(String username, String password)
	{
		boolean result = this.isUserStudent(username);
		if(result == true)
		{
		 Student student = this.findByUsername(username);
			if(student.getPassword().equals(password))
			{
				stu= student;
				student.setLoginStatus(true);
				
			}
							
		}
		
	
		return stu;
		
		
}
	
	
	
	/**
	 * searches the hashmap in this class for a student of the specified 
	 * username and returns it if found. If not found it returns null
	 * 
	 * @param username the username of the student to search for
	 * @return the student corresponding to the username specified
	 */

	public Student findByUsername(String username)
	{

		allStudents = dbl.getStudents();
		Student student = new Student();
		for(Student s: allStudents)
		{
			if(s.getUsername().equals(username))
			{
		       student = s;
	}
		}
		return student;
	}
	
	/**
	 * method to log off the student that is currently logged in
	 * catches NullPointerException if logOff fails.
	 */
	
	public void logoff()
	{
	
	       stu.setLoginStatus(false);
	       stu = null;
	}
	

	/**
	 * Adds a student to the studentHome
	 * 
	 * @param student
	 */
	
	public void addStudent(Student student) {
		dbl.addStudent(student);
	}
	
	/**
	 * 
	 * 
	 * @param school
	 * @return
	 */
	
	public int removeUniversity(String school)
	{
		return dbl.removeSchool(stu.getUsername(), school);
	}
	
	public int saveUniversity(Student student,String school)
	{
		return dbl.saveSchool(student, school);
	}
	
	public void getSavedUniversity()
	
	{
		
		ArrayList<University> savedSchool= dbl.getSavedSchool(stu.getUsername());
	    stu.setSavedUni(savedSchool);
	    ArrayList<University> uniLists = stu.getSavedUniversity();
	    for(University u: savedSchool)
	    {
	    	System.out.println(u.getName());
	    }
	}
		
	
	
	
	public int editProfile(String firstname, String lastname, String password) {
	   stu = new Student(firstname,lastname,stu.getUsername(), password,stu.getType(),stu.getStatus());
	   return dbl.editStudent(stu);

	}
	   
	   
		
	           
	public boolean isUserStudent(String username){
		return dbl.isUserStudent(username);

}
}