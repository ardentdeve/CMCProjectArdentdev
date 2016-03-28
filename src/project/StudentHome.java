/**
 * @author ArdentDevelopers
 */

package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class StudentHome {
	private ArrayList<Student>allStudents;
	private DBController dbl;
	private Student stu;
	private StudentUI studentUI;

	public StudentHome(String d, String username, String password) {
		stu = null;
		 dbl = new DBController(d,username,password);
	}
	
	public Student login(String username, String password)
	{
		boolean result = this.isUserStudent(username);
		if(result == true)
		{
		 Student student = this.findByUsername(username);
			if(student.getPassword().equals(password))
			{
				stu= student;
				student.setLoginStatus(true);
				
			}
							
		}
		
	
		return stu;
		
		
}

	public Student findByUsername(String username)
	{
		allStudents = dbl.getStudents();
		Student student = new Student();
		for(Student s: allStudents)
		{
			if(s.getUsername().equals(username))
			{
		       student = s;
	}
		}
		return student;
	}
	
	public void logoff()
	{
		try
		{
		if(!(stu==null))
		{
	       stu.setLoginStatus(false);
	       stu = null;
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

	
	public void addStudent(Student student) {
		dbl.addStudent(student);
	}
	
	public boolean removeUniversity(String school)
	{
		return dbl.removeSchool(stu.getUsername(), school);
	}
	
	public boolean saveUniversity(Student student,String school)
	{
		return dbl.saveSchool(student, school);
	}
	
	public void getSavedUniversity(String username) 
	
	{
		
		ArrayList<ArrayList<String>> savedSchool= dbl.getSavedSchool();
	    for(ArrayList<String> i: savedSchool)
			   {
	               if(i.contains(username))
	               {
				   System.out.println(i);
			   }
				 
			   }
	}
		
	
	
	
	public void editStudent(Student student) {
		dbl.editStudent(student);
	}
	           
	public boolean isUserStudent(String username){
		return dbl.isUserStudent(username);

}
}