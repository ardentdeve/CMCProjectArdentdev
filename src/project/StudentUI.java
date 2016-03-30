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

	/**
	 * method to logOn as a student
	 * @param n name of Student
	 * @param p password of Student
	 */
	public void logOn(String n, String p)
	{
		student= studentH.login(n, p);
		if(student==null)
		{
			System.out.println("log on failed");
		}
		else
		{
			System.out.println("log on successful");
		}
	}

/**
 * gets all the saved universities for student
 */
	public void getSavedUniversity()
	{
		try
		{
			studentH.getSavedUniversity(student.getUsername());
		}
		catch(NullPointerException ex)
		{
		}
	}




	/**
	 * method to logOff as a student
	 */
	public void logOff()
	{
		studentH.logoff();
	}
	/**
	 * Sets the user to Student s
	 */
	public void setUser(Student s)
	{
		this.student = s;

	}


	public void editStudent(String firstname, String lastname, String password)
	{
		if(!(student==null))
		{
			student.setFirstName(firstname);
			student.setLastName(lastname);
			student.setPassword(password);
			System.out.println("edit successful");
		}
		else
		{
			System.out.println("edit unsuccessful");
		}
	}

	public void getStudentInfo()
	{
		boolean value=  studentH.isUserStudent(student.getUsername());
		if(value== true)
		{
			System.out.println(student.toString());
		}
	}


	public void removeUniversity(String uni)
	{
		try{
			studentH.removeUniversity(uni);
			System.out.println("remove successful");
		}
		catch(NullPointerException ex)
		{

		}
	}


	public void  saveUni(String u)
	{

		try{
			studentH.saveUniversity(student, u);
			System.out.println("Save successful");
		}
		catch(NullPointerException ex)
		{

		}




	}
}

