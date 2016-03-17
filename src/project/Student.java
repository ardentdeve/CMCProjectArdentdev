/**
 * 
 */

/**
 * @author aonneji
 *
 */

package project;

import java.util.ArrayList;

public class Student extends User {
	
	

	
	private ArrayList<University>savedSchools;
	
	
	/**
	 * @param password
	 * @param username
	 * @param type
	 * @param name
	 * @param status
	 */
	public Student(String pw, String un, String firstName, String lastName, char type, char status) {
		super(pw, un,firstName, lastName,type, status);
		savedSchools = new ArrayList<University>();	
	}
	
	
	/**
	 * @return the savedSchools
	 */
	public ArrayList<University> getSavedSchools() {
		return savedSchools;
	}


		

}
