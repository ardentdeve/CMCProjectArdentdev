/**
 * 
 */

/**
 * @author Ashley Nneji
 * The student user interface class 
 */

package oldversions;

public interface StudentUI {
/*
 * Searches for a category
 * @param c Categories (confused what categories  
 */
	public void search(Categories c); // wouldn't this return a list 
/**
 * logs the student on 
 * @param n the student's username
 * @param p the student's password
 * @return true if the student was successfully logged on and false otherwise
 */
	public boolean logOn(String n, String p);
	/**
	 * sets the users name 
	 * @param m the new username
	 */
	public void setUser(User m);
	/**
	 * manages the profile of the student
	 *what does this method do?
	 */
	public void manageProfile();
	 /**
	  * edits the account of the user
	  * is this a real method?
	  */
	public void editUser() // I believe this should return a boolean to confirm the edit
	/**
	 * confirms the change made to students account
	 * @return true if change was successful otherwise false
	 */
	public boolean confirmChange();
	/**
	 * manages student saved university
	 * is this an actual method?
	 */
	public void manageUniversities();
	/**
	 * removes university from the students saved university list
	 * @param n the University that the student desires to remove from saved list
	 * @return true if the university was successfully removed otherwise return false
	 */
	public boolean removeUniversity(University n);
	/**
	 * view the details of a specific university
	 * @return the string representation of the details of the university
	 */
	public String viewUniversityDetails(u:University)
	/**
	 * save the university to the list of the student's saved universities
	 * @param u the University student desires to save 
	 */
	public void saveUniversity(University u); // this should return a boolean
	
	
	
	

}
