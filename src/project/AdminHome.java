/*
 * File: AdminHome.java
 */ 
package project;

import java.util.ArrayList;

/**
 * Class that creates the methods that an Admin can use
 * 
 * @author Ardent Developers
 * @version March, 2016
 */

public class AdminHome {


	/** An array containing the usernames of all existing Students*/
	private String[] usernames;
	/** Reference to Admin object*/
	private Admin admin;
	/** Reference to Student object */
	private Student student;
	/** An arrayList containing all of the admins*/
	private ArrayList<Admin>allAdmins;
	/** An arrayList containing all of the students*/
	private ArrayList<Student>allStudents;
	/** Reference to the DBController*/
	private DBController dbl;

	/**
	 * Contructor.
	 * 
	 * @param d database
	 * @param username username to set
	 * @param password password to set
	 */
	public AdminHome(String d, String username, String password) {
		dbl = new DBController();
		admin = null;
	}

	/**
	 * method to login the Admin
	 * 
	 * @param username Username of the Admin that logs in
	 * @param password Password of the Admin that logs in
	 * @return the admin that is logged in
	 */
	public Admin login(String username, String password)
	{
		boolean result = this.isUserAdmin(username);
		if(result == true)
		{
			Admin admin = this.findAdmin(username);
			if(admin.getPassword().equals(password))
			{
				this.admin=  admin;
				this.admin.setLoginStatus(true);

			}

		}


		return this.admin;


	}



	/**
	 * method to log off the admin that is currently logged in
	 * catches NullPointerException if logOff fails.
	 */

	public void logoff()
	{
		admin.setLoginStatus(false);
		admin = null;			

	}



	/**
	 * searches the hashmap in this class for an admin of the specified 
	 * username and returns it if found. If not found it returns null
	 * 
	 * @param username the username of the admin to search for
	 * @return the admin corresponding to the username specified
	 */
	public Admin findAdmin(String username){
		allAdmins = dbl.getAdmins();
		Admin ad = null;
		for(Admin a : allAdmins)
		{
			if(a.getUsername().equals(username))
			{
				ad = a;
			}
		}
		return ad;
	}



	/**
	 * Deactivates a user from the studentHome
	 * 
	 * @param username username to be deactivated
	 */

	public int deactivateUser(Student student){
	   return dbl.editStudent(student.getUsername() , student.getFirstName(), student.getLastName(), student.getPassword(), student.getType(), 'N');
	}

	
	/**
	 * Activates a user from the studentHome
	 * 
	 * @param username username to be deactivated
	 */
	
	public int activateUser(Student student){
		return dbl.editStudent(student.getUsername() , student.getFirstName(), student.getLastName(), student.getPassword(), student.getType(), 'Y');

	}



	/**
	 * Adds a student to the studentHome
	 * 
	 * @param student student to be added
	 */
	public int addStudent(Student student) {
		return dbl.addStudent(student);
	}

	/**
	 * Edits a student that is currently in the studentHome
	 * @param s the student to be edited
	 * @return the edited student information
	 */

	public int editStudent(String username, String firstName, String lastName, String password, char type, char status){
		return dbl.editStudent(username, firstName, lastName, password, type, status);
	}

	/**
	 * Adds an admin to the AdminHome
	 * @param admin admin to be added
	 */
	public int addAdmin(Admin admin) {
		return dbl.addAdmin(admin);

	}

	/**
	 * Edits an admin that is currently in the adminHome
	 * @param admin admin to be edited
	 * @return the edited Admin information
	 */
	public int editAdmin(String username, String firstName, String lastName, String password, char type, char status)
	{
		return dbl.editAdmin(username, firstName, lastName, password, type, status);
	}

/**
 * Deletes an admin the is currently in the adminHome
 * @param a admin to be deleted
 * @return the deleted admin
 */
	public int deleteAdmin(Admin a)
	{
		return dbl.deleteAdmin(a.getUsername());
	}
	/**
	 * prints out all of the admins in the AdminHome
	 * @return all admins
	 */
	public ArrayList<Admin> getAdmins(){
		return dbl.getAdmins();
		
	}

	/**
	 * prints out all of the students in the StudentHome
	 * @return all students
	 */

	public ArrayList<Student> getStudents()
	{
		return dbl.getStudents();
		
	}

	/**
	 * checks if the current user is an Admin
	 * @param username the username of the current user
	 * @return username of the Admin
	 */
	public boolean isUserAdmin(String username){
		return dbl.isUserAdmin(username);
	}

	/**
	 * checks if current user is a student
	 * @param username the username of the current user
	 * @return username of the Student
	 */
	public boolean isUserStudent(String username){
		return dbl.isUserStudent(username);
	}
}