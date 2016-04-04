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
	private StudentHome studentH;
	/** Reference to student object */
	private Student student;
	/** An arrayList of all students */
	private ArrayList<Student>allStudents;

	/**
	 * Constructor.
	 * 
	 * @param n name to set
	 * @param us username to set
	 * @param p password to set
	 */
	public StudentUI(String n ,String us, String p){
		student = new Student();
		studentH = new StudentHome(n,us,p);
		allStudents = new ArrayList<Student>();
	}

	public boolean isLoggedOn()
	{
		boolean result = false;

		if(student != null)
		{

			result = true;
		}
		return result;
	}

	/**
	 * method to logOn as a student
	 * @param n name of Student
	 * @param p password of Student
	 */
	public boolean logOn(String n, String p)
	{

		student = studentH.login(n, p);
		if(student==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	/**
	 * gets all the saved universities for student
	 * 
	 */
	public ArrayList<University> getSavedUniversity() 
	{   
		ArrayList<University>uniLists = null;

		if( isLoggedOn())
		{
			uniLists = studentH.getSavedUniversity();
		}
		return uniLists;
	}






	/**
	 * method to logOff as a student
	 */
	public void logOff()
	{
		if(isLoggedOn())
		{
			this.student = null;
		}
	}


	public void editProfile(String firstname, String lastname, String password)
	{
		if(isLoggedOn())
		{

			studentH.editProfile(firstname,lastname,password);
		}
	}

	public void getStudentInfo()
	{
		if(isLoggedOn())
		{
			if(!(student==null))
			{
				boolean value=  studentH.isUserStudent(student.getUsername());
				if(value== true)
				{
					System.out.println(student.toString());
				}
			}


			boolean value=  studentH.isUserStudent(student.getUsername());
			if(value== true)
			{
				System.out.println(student.toString());
			}

		}
	}


	public void removeUniversity(String uni)
	{
		if(isLoggedOn())
		{
			studentH.removeUniversity(student,uni);

		}
	}




	public void  saveUni(String u)
	{
		if(isLoggedOn())
		{
			studentH.saveUniversity(student, u);

		}
	}
}

