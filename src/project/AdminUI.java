/*
 * File: AdminUI.java
 */
package project;

import java.util.ArrayList;

/**
 * User Interface for the Admin 
 * 
 * @author Ardent Developers
 *
 */
public class AdminUI {
	/** Reference to adminHome object */
	private AdminHome adminH;
	/** Reference to admin object */
	private Admin admin;
	/** Reference to student object */
	private Student student;
	/** An arrayList of all admins */
	private ArrayList<Admin>allAdmins;
	/** Reference to UniversityHome object */
	private UniversityHome uniH;
	
	/**
	 * Constructor.
	 * @param n name to set
	 * @param us username to set
	 * @param p password to set
	 */
	public AdminUI(String n ,String us, String p){
		admin = new Admin();
		adminH= new AdminHome(n,us,p);
		uniH= new UniversityHome(n,us,p);
		allAdmins = new ArrayList<Admin>();
	}
	
	
	/**
	 * method to logOn as an admin
	 * @param n name of Admin
	 * @param p password of Admin
	 */
	public void logOn(String n, String p)
	{
		admin= adminH.login(n, p);
		if(admin==null)
		{
			System.out.println("log on failed");
		}
		else
		{
			System.out.println("log on successful");
		}
	}
	
	/**
	 * method to logOff as an Admin
	 */
	public void logOff()
	{
		adminH.logoff();
	}
	
	/**
	 * method for an admin to add a student to StudentHome
	 * @param s the student that is being added
	 */
	public void addStudent(Student s)
	{
		adminH.addStudent(s);
	}
	
	/**
	 * method for an admin to add another admin to adminHome
	 * @param a the admin that is going to be added
	 */
	public void addAdmin(Admin a)
	{
		adminH.addAdmin(a);
	}

	/**
	 * Deactivates the specified user by changing the Student's status
	 * 
	 * @param u the Student to deactivate
	 */
	public void deactivateUser(String username){
	   adminH.DeactivateUser(username);
	}

	/**
	 * Edits a specific student in the studentHome
	 * @param s student that is being edited
	 * @return the edited student's information
	 */
	public boolean editStudent(Student s)
	{
	   return adminH.editStudent(s);
	}
	/**
	 * Edits a specific admin in the adminHome
	 * @param a admin that is being edited
	 * @return the edited admins information
	 */
	public boolean editAdmin(Admin a)
	{
	   return adminH.editAdmin(a);
	}
	
	/**
	 * Calls studentHome to get all Students
	 */
	public void getStudents()
	{
		adminH.getStudents();
	}
	
	/**
	 * Calls adminHome to get all Admins
	 */
	public void getAdmins()
	{
		adminH.getAdmins();
	}
	
	/**
	 * Adds an University to the universityHome
	 * @param u University to be added
	 */
	public void addUniversity(University u)
	{
		uniH.addUniversityToList(u);
	}
	
	/**
	 * Calls universityHome to get all Universities
	 */
	public void getUniversities(){
	      uniH.getUniversities();
	}
}

	
