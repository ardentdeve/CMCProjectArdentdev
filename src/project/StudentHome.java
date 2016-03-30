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
	private ArrayList<Student>allStudents
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
		try
		{
		if(!(stu==null))
		{
	       stu.setLoginStatus(false);
	       stu = null;
	       System.out.println("log off successful");
	}
		else
		{
			System.out.println("log off failed - User not logged on");
		}
		}
		catch(NullPointerException ex)
		{
			
		}
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
	
	public boolean removeUniversity(String school)
	{
		return dbl.removeSchool(stu.getUsername(), school);
	}
	
	public boolean saveUniversity(Student student,String school)
	{
		return dbl.saveSchool(student, school);
	}
	
	public void getSavedUniversity(String username) 
	
	{
		
		ArrayList<ArrayList<String>> savedSchool= dbl.getSavedSchool();
	    for(ArrayList<String> i: savedSchool)
			   {
	               if(i.contains(username))
	               {
				   System.out.println(i);
			   }
				 
			   }
	}
		
	
	
	
	public void editStudent(Student student) {
		dbl.editStudent(student);
	}
	           
	public boolean isUserStudent(String username){
		return dbl.isUserStudent(username);

}
}