/*
 * File: UniversityHome.java
 */

package project;

import java.util.*;
import dblibrary.project.csci230.UniversityDBLibrary;

/**
 * A class containing an ArrayList of University objects that make up the CMC web site
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
		dbl= new DBController(data,username,password);
	}
	
	/**
	 * Adds the specified University to universities using the database controller
	 * 
	 * @param u the University to add
	 */
	public int addUniversityToList(University u){
		return dbl.addUniversity(u);
	}

	/** 
	 * Prints all the universities in the database
	 */
	public void getUniversities(){ 
		universities = dbl.getUniversities();
	
	}
	
	public int editUniversities(University u)
	{
		return dbl.editUniversity(u);
		
	}
	
	public int deleteUniversities(University u)
	{
		return dbl.deleteUniversity(u);
	}
	
	
	public int addUniversityEmphasis(University u, String emphasis)
	{
		return dbl.addUniversityEmphasis(u, emphasis);
	}
	
	public int deleteUniversityEmphasis(University u,String emphasis)
	{
		return dbl.removeUniversityEmphasis(u.getName(),emphasis);
	}
}

