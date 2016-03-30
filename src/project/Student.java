/**
 * 
 */

/**
 * @author aonneji
 *
 */

package project;

import java.util.ArrayList;
import java.util.TreeMap;

public class Student extends User {
	
	private ArrayList<University> savedSchools;
	
	
	/**
	 * @param password
	 * @param username
	 * @param type
	 * @param name
	 * @param status
	 */
	public Student(String firstName, String lastName, String username, String password, char type, char status) {
		super(firstName,lastName,username,password,type,status);
		savedSchools = new ArrayList<University>();
	}
	
	public Student(String firstName, String lastName, String username, String password, char type) {
		super(firstName,lastName,username,password,type);
		savedSchools = new ArrayList<University>();
	}

	
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
	

	

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Student [getFistName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getUsername()="
				+ getUsername() + ", getPassword()=" + getPassword() + ", getType()=" + getType() + ", getStatus()="
				+ getStatus() + "]";
	}
}


		


