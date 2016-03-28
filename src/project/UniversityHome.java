package project;

import java.util.*;

import dblibrary.project.csci230.UniversityDBLibrary;

public class UniversityHome {

	private ArrayList<University> universities;
	private DBController dbl;
	
	public UniversityHome(String data, String username, String password){
		dbl= new DBController(data,username,password);
	
	}
	public void addUniversityToList(University u){
		dbl.addUniversity(u);
	}
	
	
	/** 
	 * Get all the universities in the database
	 */
	public void  getUniversities(){ 
		universities = dbl.getUniversities();
		 for(University u : universities)
		 {
	         System.out.println(u);
	}
	}
	

}

