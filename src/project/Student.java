/*
 * File: Student.java
 */

package project;

import java.util.ArrayList;

/**
 * Class representing a Student that is logged into to the system.
 * 
 * @author Ardent Developers
 * @version March, 2016
 */

import java.util.TreeMap;

public class Student extends User {
	
	private ArrayList<University> savedSchools;
	
	
	/**
	 * Constructor
	 * 
	 * @param firstName firstName to set
	 * @param lastName lastName to set
	 * @param username username to set
	 * @param password password to set
	 * @param type type to set
	 * @param status status to set
	 */
	public Student(String firstName, String lastName, String username, String password, char type, char status) {
		super(firstName,lastName,username,password,type,status);
		savedSchools = new ArrayList<University>();
	}
	/**
	 * Constructor
	 * 
	 * @param firstName firstName to set
	 * @param lastName lastName to set
	 * @param username username to set
	 * @param password password to set
	 * @param type type to set
	 */
	public Student(String firstName, String lastName, String username, String password, char type) {
		super(firstName,lastName,username,password,type);
		savedSchools = new ArrayList<University>();
	}

	
	/**
	 * Constructor
	 */
	public Student()
	{
		super();
		
	}
	
	public ArrayList<University> getSavedUniversity()
	{
	 return savedSchools;
	}
	
	 public void setSavedUni(ArrayList<University>uni)
	{
	 savedSchools =uni;
	}
	

	

	/**
	 * Returns a String of the Student information
	 * 
	 * @return firstname, lastname, username, password, type, and status of the Student.
	 */
	
	@Override
	public String toString() {
		return "Student [getFistName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getType()=" + getType() + ", getStatus()="
				+ getStatus() + "]\n";
	}
}


		


