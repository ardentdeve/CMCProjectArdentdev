/*
 * File: StudentHome.java
 */
package project;

import java.util.ArrayList;
import java.util.Map.Entry;
import java.util.TreeMap;

/**
 * This class functions as a home for all Students. The Students are stored in a list 
 * and are able to use the methods defined here
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
		dbl = new DBController();
	}

	/**
	 * Takes a Student's username and password and confirms they are a Student. Then finds the Student
	 * in the allStudents list and confirms they exist. Finally sets the loginStatus of the confirmed student
	 * to true, logging in the user
	 * 
	 * @param username username of the student that logs in
	 * @param password password of the student that logs in
	 * @return the student that is logged in
	 */

	public Student login(String username, String password)
	{
		boolean result = this.isUserStudent(username);
		if(result) {
			Student student = this.findByUsername(username);

			if(student.getPassword().equals(password)) {
				stu = student;
				student.setLoginStatus(true);
			}    
		}
		return stu;	
		
}
	public int deleteStudent(Student s)
	{
		return dbl.deleteStudent(s.getUsername());
	}
	
	/**
	 * searches the allStudents list in this class for a student of the specified 
	 * username and returns it if found.
	 * 
	 * @param username the username of the student to search for
	 * @return the student corresponding to the username specified
	 */

	public Student findByUsername(String username) {
		allStudents = dbl.getStudents();
		Student student= null;
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
	 * Changes this.student's loginStatus to false and clears the current student from this home
	 * 
	 * catches NullPointerException if logOff fails.
	 */
	public void logoff() {
		stu.setLoginStatus(false);
		stu = null;
	}

	/**
	 * Adds a student to the allStudents list
	 * 
	 * @param student
	 */
	public void addStudent(Student student) {
		dbl.addStudent(student);
	}

	/**
	 * Removes the specified University name from the current Student's list of schools
	 * 
	 * @param school the name of the school to remove
	 * @return 1 if the remove succeeded and -1 otherwise
	 */
	
	public int removeUniversity(Student s, String school)
	{
		return dbl.removeSchool(s.getUsername(), school);

	}

	/**
	 * Saves the the University correpsonding to the specified school name to the specified 
	 * Student's saved schools
	 */
	public int saveUniversity(Student student,String school) {
		return dbl.saveSchool(student, school);
	}

	/**
	 * prints the saved schools of the current students saved schools list
	 */
	public ArrayList<University> getSavedUniversity() {
		if(stu==null){
			throw new IllegalArgumentException("Invalid login Info");}
		else
		{
		ArrayList<University> savedSchool= dbl.getSavedSchool(stu.getUsername());
		stu.setSavedUni(savedSchool);
		ArrayList<University> uniLists = stu.getSavedUniversity();
		return uniLists;
	}
	}
	/**
	 * Creates a Student with the specified information and calls editStudent from 
	 * the DBController class
	 * 
	 * @param firstname the firstname of the new Student
	 * @param lastname the lastname of the new Student
	 * @param password the password of the new Student
	 * 
	 * @return the result of the editStudent method from the DBController
	 */
	public int editProfile(String firstname, String lastname, String password) {
		if(stu == null){
			throw new IllegalArgumentException("Invalid login Info");}
		else{
		stu = new Student(firstname,lastname,stu.getUsername(), password,stu.getType(),stu.getStatus());
		}return dbl.editStudent(stu);

			}
	/**
	 * Check if the Student correpsonding to the specfied username is a student by 
	 * calling the similar method in the DBController class
	 */
	public boolean isUserStudent(String username){
		return dbl.isUserStudent(username);
	}
}