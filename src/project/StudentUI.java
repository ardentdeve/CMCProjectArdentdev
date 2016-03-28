

/**
 * @author Ashley Nneji
 * The student user interface class 
 */

package project;

import java.util.ArrayList;
import java.util.TreeMap;

public class StudentUI {
	
	private StudentHome studentH;
	private Student student;
	private ArrayList<Student>allStudents;
	
	
	public StudentUI(String n ,String us, String p){
		student = new Student();
		studentH = new StudentHome(n,us,p);
		allStudents = new ArrayList<Student>();
	}
	
/*
 * Searches for a category
 * @param c Categories (confused what categories  
 */
	/**public void search(Categories c)
/**
 * logs the student on 
 * @param n the student's username
 * @param p the student's password
 * @return true if the student was successfully logged on and false otherwise
 */
	public void logOn(String n, String p)
	{
		student= studentH.login(n, p);
		if(student==null)
		{
			System.out.println("log on failed");
		}
		else
		{
			System.out.println("log on successful");
		}
	}
	
	
	public void getSavedUniversity()
	{
		try
		{
	   studentH.getSavedUniversity(student.getUsername());
	}
		catch(NullPointerException ex)
		{
		}
		}
		
	

	
	
	public void logOff()
	{
		studentH.logoff();
	}
	/**
	 * sets the users name 
	 * @param m the new username
	 */
	public void setUser(Student s)
	{
		this.student = s;
		
	}


	public void editStudent(String firstname, String lastname, String password)
	{
		if(!(student==null))
		{
		student.setFirstName(firstname);
		student.setLastName(lastname);
		student.setPassword(password);
		System.out.println("edit successful");
		}
		else
		{
			System.out.println("edit unsuccessful");
		}
	}
	
	public void getStudentInfo()
	{
      boolean value=  studentH.isUserStudent(student.getUsername());
      if(value== true)
      {
    	  System.out.println(student.toString());
      }
	}
		
	/**
	
	/**
	 * removes university from the students saved university list
	 * @param n the University that the student desires to remove from saved list
	 * @return true if the university was successfully removed otherwise return false
	 */
	public void removeUniversity(String uni)
	{
		try{
			studentH.removeUniversity(uni);
			 System.out.println("remove successful");
		}
			catch(NullPointerException ex)
			{
				
			}
	}
	
	/**
	 * view the details of a specific university
	 * @return the string representation of the details of the university
	 */
	/*public String viewUniversityDetails(u:University)
	/**
	 * save the university to the list of the student's saved universities
	 * @param u the University student desires to save 
	 */
	public void  saveUni(String u)
	{
		
		try{
		 studentH.saveUniversity(student, u);
		 System.out.println("Save successful");
	}
		catch(NullPointerException ex)
		{
			
		}
	
	
	

}
}

