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
	private AdminHome adminH = new AdminHome();
	private StudentHome studentH = new StudentHome();
	/** Reference to admin object */
	private Admin admin;
	/** Reference to student object */
	private Student student;
	/** An arrayList of all admins */
	private ArrayList<Admin>allAdmins;
	/** Reference to UniversityHome object */
	private UniversityHome uniH;




	/**
	 * method to logOn as an admin
	 * @param n username of Admin
	 * @param p password of Admin
	 */
	public int logOn(String n, String p)
	{
		 return adminH.login(n, p);
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
	public int addStudent(Student s)
	{
		return adminH.addStudent(s);
		
	}

	/**
	 * method for an admin to add another admin to adminHome
	 * @param a the admin that is going to be added
	 */
	public int addAdmin(Admin a)
	{
		return adminH.addAdmin(a);
		
	}

	/**
	 * Deactivates the specified user by changing the Student's status
	 * 
	 * @param u the Student to deactivate
	 */
	public int deactivateUser(Student student){
		return  adminH.deactivateUser(student);
		
	}
	
	
	public int activateUser(Student student){
		return  adminH.activateUser(student);
		
	}

	/**
	 * Edits a specific student in the studentHome
	 * @param s student that is being edited
	 * @return 
	 * @return the edited student's information
	 */
	public int editStudent(Student student)
	{
		
			return adminH.editStudent(student);
		
	}
	/**
	 * Edits a specific admin in the adminHome
	 * @param a admin that is being edited
	 * @return 
	 * @return the edited admins information
	 */
	public int editAdmin(Admin admin)
	{
		
			return adminH.editAdmin(admin);
	
	}

	/**
	 * Calls studentHome to get all Students
	 */
	public ArrayList<Student> getStudents()
	{
		return adminH.getStudents();
	}

	/**
	 * Calls adminHome to get all Admins
	 */
	public ArrayList<Admin> getAdmins()
	{
		return adminH.getAdmins();
		
	}

	/**
	 * Adds a University to the universityHome
	 * @param u University to be added
	 */
	public int addUniversity(University u)
	{
		return uniH.addUniversityToList(u);
		
	}

	/**
	 * Calls universityHome to get all Universities
	 */
	public ArrayList<University> getUniversities(){
		return  uniH.getUniversities();
	
	}
/**
 * method to edit a specified university
 * @param u university to be edited
 * @return value of 1 if true
 */
	public int editUniversities(String name, String state, String location, String control, int numberStudents, double pctFemale, double satVerbal, double satMath, 
			double expenses, double pctFinancialAid, int numberOfApplicants, double pctAdmitted, double pctEnrolled, int AcademicScale, int socialScale, int QualityOfLifeScale)
	{
		
		return uniH.editUniversities(name, state, location, control, numberStudents, pctFemale, satVerbal, satMath, 
					 expenses, pctFinancialAid, numberOfApplicants, pctAdmitted, pctEnrolled, AcademicScale, socialScale, QualityOfLifeScale);
	}

}


