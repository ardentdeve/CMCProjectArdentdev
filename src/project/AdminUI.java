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

	public boolean isLoggedOn()
	{
		boolean result = false;

		if(admin != null)
		{

			result = true;
		}
		return result;
	}

	/**
	 * method to logOn as an admin
	 * @param n name of Admin
	 * @param p password of Admin
	 */
	public boolean logOn(String n, String p)
	{
		admin = adminH.login(n, p);
		if(admin==null)
		{
			return false;
		}
		else
		{
			return true;
		}
	}


	/**
	 * method to logOff as an Admin
	 */
	public void logOff()
	{
		if(isLoggedOn())
		{
			adminH.logoff();
		}
	}

	/**
	 * method for an admin to add a student to StudentHome
	 * @param s the student that is being added
	 */
	public int addStudent(Student s)
	{
		int value = -1;
		if(isLoggedOn())
		{
			value = adminH.addStudent(s);
		}
		return value;
	}

	/**
	 * method for an admin to add another admin to adminHome
	 * @param a the admin that is going to be added
	 */
	public int addAdmin(Admin a)
	{
		int value = -1;
		if(isLoggedOn())
		{
			value = adminH.addAdmin(a);
		}
		return value;
	}

	/**
	 * Deactivates the specified user by changing the Student's status
	 * 
	 * @param u the Student to deactivate
	 */
	public int deactivateUser(String username){
		int value = -1;
		if(isLoggedOn())
		{
			value = adminH.DeactivateUser(username);
		}
		return value;
	}

	/**
	 * Edits a specific student in the studentHome
	 * @param s student that is being edited
	 * @return 
	 * @return the edited student's information
	 */
	public int editStudent(Student s)
	{
		int value =-1;
		if(isLoggedOn())
		{
			value = adminH.editStudent(s);
		}
		return value;
	}
	/**
	 * Edits a specific admin in the adminHome
	 * @param a admin that is being edited
	 * @return 
	 * @return the edited admins information
	 */
	public int editAdmin(Admin a)
	{
		int value =-1;
		if(isLoggedOn())
		{
			value = adminH.editAdmin(a);
		}
		return value;
	}

	/**
	 * Calls studentHome to get all Students
	 */
	public ArrayList<Student> getStudents()
	{
		ArrayList<Student> stu = null;
		if(isLoggedOn())
		{
			stu = adminH.getStudents();
		}
		return stu;
	}

	/**
	 * Calls adminHome to get all Admins
	 */
	public ArrayList<Admin> getAdmins()
	{
		ArrayList<Admin> admin = null;
		if(isLoggedOn())
		{
			admin = adminH.getAdmins();
		}
		return admin;
	}

	/**
	 * Adds an University to the universityHome
	 * @param u University to be added
	 */
	public int addUniversity(University u)
	{
		int value = -1;
		if(isLoggedOn())
		{
			value = uniH.addUniversityToList(u);
		}
		return value;
	}

	/**
	 * Calls universityHome to get all Universities
	 */
	public ArrayList<University> getUniversities(){
		ArrayList<University> univ = null;
		if(isLoggedOn())
		{
			univ = uniH.getUniversities();
		}
		return univ;
	}

	public int editUniversities(University u)
	{
		int value = -1;
		if(isLoggedOn())
		{
			value = uniH.editUniversities(u);
		}
		return value;

	}
}


