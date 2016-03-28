package project;

import java.util.ArrayList;
import java.util.TreeMap;

public class Admin extends User {

	public Admin(String pw, String un, String firstName, String lastName, char type, char status) {
		super(pw, un, firstName, lastName, type, status);
	}
	
	public Admin()
	{
		super();
		
	}
	public Admin(String firstName, String lastName, String username, String password, char type) {
		super(firstName,lastName,username,password,type);
		
	}
	
	@Override
	public String toString() {
		return "Admin [getFistName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getType()=" + getType() + ", getStatus()="
				+ getStatus() + "]";
		}
}