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
		dbl = new DBController(d,username,password);
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
				admin.setLoginStatus(true);

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
		try
		{
			if(!(admin==null))
			{
				admin.setLoginStatus(false);
				admin = null;
				System.out.println("log off successful");
			}
			else
			{
				System.out.println("log off failed - User not logged on");
			}
		}
		catch(NullPointerException ex)
		{

		}
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
		Admin ad = new Admin();
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

	public void DeactivateUser(String username)
	{
		allStudents= dbl.getStudents();
		boolean value = false;

	  if(this.isUserAdmin(username)== true)
	  {
		  Admin adminS = findAdmin(username);
		  adminS = new Admin(adminS.getFirstName(),adminS.getLastName(),adminS.getUsername(), adminS.getPassword(),adminS.getType(),'N');
		  value = this.editAdmin(adminS);
		  System.out.println("The Admin with this username : " + username + " - has been deactivated"); 
	  }
	  else if(this.isUserStudent(username)== true)
	  {
		 for(Student s :allStudents) 
		 {
			 if(s.getUsername().equals(username))
				{
			       student = s;
			      student = new Student(student.getFirstName(),student.getLastName(),student.getUsername(), student.getPassword(),student.getType(),'N');

		if(this.isUserAdmin(username)== true)
		{
			Admin adminS = findAdmin(username);
			adminS = new Admin(adminS.getFirstName(),adminS.getLastName(),adminS.getUsername(), adminS.getPassword(),adminS.getType(),'N');

			System.out.println("The Admin with this username : " + username + " - has been deactivated"); 

		}
		else if(this.isUserStudent(username)== true)
		{
			for(Student s2 :allStudents) 
			{
				if(s2.getUsername().equals(username))
				{
					student = s2;
					student = new Student(student.getFirstName(),student.getLastName(),student.getUsername(), student.getPassword(),student.getType(),'N');
					value = this.editStudent(student);
				}
			}
			System.out.println("The student with this username : " + username + " - has been deactivated"); 
		}
		else
		{
			System.out.println("User does not exist");
		}
				}	
		 }
	  }
	}
		 


	/**
	 * Adds a student to the studentHome
	 * 
	 * @param student student to be added
	 */
	public void addStudent(Student student) {
		dbl.addStudent(student);

	}

	/**
	 * Edits a student that is currently in the studentHome
	 * @param s the student to be edited
	 * @return the edited student information
	 */

	public boolean editStudent(Student s)
	{
		return dbl.editStudent(s);
	}

	/**
	 * Adds an admin to the AdminHome
	 * @param admin admin to be added
	 */
	public void addAdmin(Admin admin) {
		dbl.addAdmin(admin);

	}

	/**
	 * Edits an admin that is currently in the adminHome
	 * @param admin admin to be edited
	 * @return the edited Admin information
	 */
	public boolean editAdmin(Admin admin)
	{
		return dbl.editAdmin(admin);
	}


	/**
	 * prints out all of the admins in the AdminHome
	 * @return all admins
	 */
	public void getAdmins(){
		allAdmins = dbl.getAdmins();
		for(Admin ad : allAdmins)
		{
			System.out.println(ad);
		}
	}

	/**
	 * prints out all of the students in the StudentHome
	 * @return all students
	 */

	public void getStudents()
	{
		allStudents = dbl.getStudents();
		for(Student s : allStudents)
		{
			System.out.println(s);
		}
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