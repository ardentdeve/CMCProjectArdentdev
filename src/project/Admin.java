package project;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Class representing an Admin that is logged into to the system.
 * 
 * @author Ardentdeve
 * @version March, 2016
 */

public class Admin extends User {
	
	/**
	 * Constructor that creates the Admin
	 * 
	 * @param pw
	 * @param un
	 * @param firstName
	 * @param lastName
	 * @param type
	 * @param status
	 */

	public Admin(String pw, String un, String firstName, String lastName, char type, char status) {
		super(pw, un, firstName, lastName, type, status);
	}
	
	/**
	 * Constructor that calls the User class with no parameters
	 */
	
	public Admin()
	{
		super();
		
	}
	/**
	 * Constructor that calls the User class with Parameters filled out.
	 * @param firstName
	 * @param lastName
	 * @param username
	 * @param password
	 * @param type
	 */
	public Admin(String firstName, String lastName, String username, String password, char type) {
		super(firstName,lastName,username,password,type);
		
	}
	
	/**
	 * Returns a String of the Admin information
	 * 
	 * @return firstname, lastname, username, password, type, and status of the Admin.
	 */
	
	@Override
	public String toString() {
		return "Admin [getFistName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getType()=" + getType() + ", getStatus()="
				+ getStatus() + "]";
		}
}