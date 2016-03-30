/*
 * File: User.java
 */

package project;

/**
 * Abstract class representing a User of the web site. The user could
 * be a Student or an Admin, each of which extend this class.
 * 
 * @author Ardent Developers
 * @version March 2016
 */
public abstract class User {

	/** the password that the User uses to log in to Choose My College (CMC)*/
	private String password;
	/** the username that the User uses to log in to CMC*/
	private String username;
	/** the first name of the User*/
	private String firstName;
	/** the last name of the User*/
	private String lastName;
	/** the login status of the user, showing if they're logged in, true, or not*/
	private boolean loginStatus;
	/** the type of the User, s for Student or a for Admin*/
	private char type;
	/** the status of User, Y for active or N for disabled*/
	private char status;
	
	/**
	 * Constructor.
	 */
	public User() {
	}
	
	/**
	 * Constructor.
	 * 
	 * @param firstName first name to set
	 * @param lastName last name to set
	 * @param username username to set
	 * @param password password to set
	 * @param type type to set
	 * @param status status to set
	 */
	public User(String firstName, String lastName, String username, String password, char type, char status) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.type = type;
		this.status = status;
		this.loginStatus = false;
	}
	
	/**
	 * Constructor.
	 * 
	 * @param firstName first name to set
	 * @param lastName last name to set
	 * @param username the username to set
	 * @param password the password to set
	 * @param type the type to set
	 */
	public User(String firstName, String lastName, String username, String password, char type) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.type = type;
		this.loginStatus = false;
	}
	
	/**
	 * returns the loginStatuc of this User
	 * 
	 * @return loginStatus
	 */
	public boolean getlogInStatus() {
		return loginStatus;
	}
	
	/**
	 * sets the loginStatus specified to this User
	 * 
	 * @param status the loginStatus to set
	 */
	public void setLoginStatus(boolean status) {
		 this.loginStatus = status;
	}
	
	/**
	 * returns the password of this User
	 * 
	 * @return password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * sets the password specified to this User
	 * 
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * returns the username of this User
	 * 
	 * @return username
	 */
	public String getUsername() {
		return username;
	}


	/**
	 * sets the username specified to this User
	 * 
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * returns the first name of this User
	 * 
	 * @return firstName
	 */
	public String getFirstName() {
		return firstName;
	}


	/**
	 * sets the firstName specified to this User
	 * 
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	/**
	 * returns the last name of this User
	 * 
	 * @return lastName
	 */
	public String getLastName() {
		return lastName;
	}


	/**
	 * sets the lastName specified to this User
	 * 
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	/**
	 * returns the type of this User
	 * 
	 * @return type
	 */
	public char getType() {
		return type;
	}


	/**
	 * sets the type specified to this User
	 * 
	 * @param type the type to set
	 */
	public void setType(char type) {
		this.type = type;
	}


	/**
	 * returns the status of this User
	 * 
	 * @return status
	 */
	public char getStatus() {
		return status;
	}


	/**
	 * sets the status specified to this User
	 * 
	 * @param status the status to set
	 */
	public void setStatus(char status) {
		this.status = status;
	}
	
	/**
	 * abstract toString stub
	 */
	public abstract String toString();
	
	
}