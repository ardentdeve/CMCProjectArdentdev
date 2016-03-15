package project;

import java.util.*;

public class User {
    /** password for the user */
	private String password;
	/** username for the user */
	private String username;
	/** firstName of the user*/
	private String firstName;
	/** lastName of the user*/
	private String lastName;
	/** type of the user*/
	private char type;
	/** status of the user*/
	private char status;
	
	/** constructor */
	public User(String pw, String un, String firstName, String lastName, char type, char status) {
		this.password = pw;
		this.username = un;
		this.firstName = firstName;
		this.lastName = lastName;
		this.type = type;
		this.status = status;
	}
	
	/** @return the users firstName*/
	public String getFirstName() {
		return firstName;
	}
	/** @param firstName to be set to user*/
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/** @return the users lastName */
	public String getLastName() {
		return lastName;
	}
	/** @param lastName to be set to user */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/** @return the users username */
	public String getUsername() {
		return username;
	}
	/** @param username to be set to the user */
	public void setUsername(String username) {
		this.username = username;
	}

	/** @return the user password */
	public String getPassword() {
		return password;
	}
	/** @param password to be set to the user*/
	public void setPassword(String password) {
		this.password = password;
	}

	/** @return the users type*/
	public char getType() {
		return type;
	}
	/** @param type to be set to the user */
	public void setType(char type) {
		this.type = type;
	}
}
