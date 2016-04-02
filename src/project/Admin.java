/*
 * File: Admin.java
 */
package project;

import java.util.ArrayList;
import java.util.TreeMap;

/**
 * Class representing an Admin that is logged into to the system.
 * 
 * @author Ardent Developers
 * @version March, 2016
 */

public class Admin extends User {

	/**
	 * Constructor.
	 * 
	 * @param pw password to set
	 * @param un username to set
	 * @param firstName first name to set
	 * @param lastName last name to set
	 * @param type type to set
	 * @param status status to set
	 */
	public Admin(String firstName, String lastName, String username, String password, char type, char status) {
		super(firstName, lastName, username, password, type, status);
	}

	/**
	 * Constructor.
	 */

	public Admin()
	{
		super();

	}
	/**
	 * Constructor.
	 * 
	 * @param firstName first name to set
	 * @param lastName last name to set
	 * @param username username to set
	 * @param password password to set
	 * @param type type to set
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