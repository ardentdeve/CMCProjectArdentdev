/*
 * File: UniversityHome.java
 */

package project;

import java.util.*;
import dblibrary.project.csci230.UniversityDBLibrary;

/**
 * A class that functions as a home for all Universities. The implemented methods 
 * are used to edit the list of Universities
 * 
 * @author Ardent Developers
 * @version March, 2016
 */
public class UniversityHome {

	/** an ArrayList of University objects*/
	private ArrayList<University> universities;
	/** an instance of DBController used to retrieve information about Universities*/
	private DBController dbl;

	/**
	 * Constructor.
	 * 
	 * @param data the database used in the DBController constructor call
	 * @param username the username used in the DBController constructor call
	 * @param password the password used in the DBController constructor call
	 */
	public UniversityHome(String data, String username, String password){
		dbl= new DBController();
	}

	/**
	 * Adds the specified University to the list universities using the database controller
	 * 
	 * @param u the University to add
	 */
	public int addUniversityToList(University u){
		return dbl.addUniversity(u);
	}

	/** 
	 * Returns a list of all Universitites in the database
	 */
	public ArrayList<University> getUniversities(){ 
		return dbl.getUniversities();
	}

	/**
	 * Edits the specified Universities information using the DBController class
	 */
	public int editUniversities(String name, String state, String location, String control, int numberStudents, double pctFemale, double satVerbal, double satMath, 
			double expenses, double pctFinancialAid, int numberOfApplicants, double pctAdmitted, double pctEnrolled, int AcademicScale, int socialScale, int QualityOfLifeScale) {
		return dbl.editUniversity(name, state, location, control, numberStudents, pctFemale, satVerbal, satMath, 
				 expenses, pctFinancialAid, numberOfApplicants, pctAdmitted, pctEnrolled, AcademicScale, socialScale, QualityOfLifeScale);
	}

	/**
	 * Deletes the specified University from the home
	 * 
	 * @param u the University to delete
	 */
	public int deleteUniversities(University u) {
		return dbl.deleteUniversity(u);
	}
	/**
	 * Adds the specified emphasis to the specified University 
	 * using the DBController class method
	 */
	public int addUniversityEmphasis(University u, String emphasis) {
		return dbl.addUniversityEmphasis(u, emphasis);
	}
	
	public int deleteUniversityEmphasis(University u,String emphasis)
	{
		return dbl.removeUniversityEmphasis(u.getName(),emphasis);
	}
}
