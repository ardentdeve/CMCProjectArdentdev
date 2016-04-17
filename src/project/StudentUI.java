/*
 * File: StudentUI.java
 */

package project;

import java.util.ArrayList;
import java.util.TreeMap;


/**
 * User Interface for the Student 
 * 
 * @author Ardent Developers
 *
 */

public class StudentUI {
	/** Reference to studentHome object */
	private StudentHome studentH = new StudentHome();;
	/** Reference to student object */
	private Student student;
	/** An arrayList of all students */
	private ArrayList<Student>allStudents;



	

	/**
	 * method to logOn as a student
	 * @param n name of Student
	 * @param p password of Student
	 */
	public int logOn(String n, String p)
	{
        return studentH.login(n, p);

	}

	/**
	 * gets all the saved universities for student
	 * 
	 */
	public ArrayList<University> getSavedUniversity() 
	{   
		
			return studentH.getSavedUniversity();
	
	}
	







	/**
	 * method to logOff as a student
	 */
	public void logOff()
	{
		studentH.logoff();
	}

/**
 * Method to editProfile of a specified student.
 * @param firstname first name to edit
 * @param lastname last name to edit
 * @param password password to edit
 */
	public void editProfile(String firstname, String lastname, String password)
	{
		studentH.editProfile(firstname,lastname,password);
		
	}
/**
 * Method that returns a specified students information.
 */
	public Student getStudentInfo()
	{
	  return studentH.getUser();
	}

/**
 * Method to remove a university.
 */
	public void removeUniversity(String uni)
	{
		
	    studentH.removeUniversity(uni);

	}



/**
 * Method to save a University.
 * @param u university to save
 * @return value of 1 if saved
 */
	public int saveUni(String u)
	{
	
		return studentH.saveUniversity(u);

}
}

