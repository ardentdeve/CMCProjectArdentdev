/*
 *File: DBController.java 
 */
package project;
import dblibrary.project.csci230.*;
import java.util.*;

/** 
 * To run, issue: java DBLibraryDriver "aonneji" "aonneji" "YourDatabasePassword" 
 * in the Interactions Pane in Dr. Java
 * 
 * Output will be saved to a comman-separated file called output.csv which you may open using a text editor or
 * a spreadsheet
 * @author Imad Rahal, Ardent Developers
 * @version February 17, 2016
 */ 

public class DBController {
	/** A variable of type UniversityDBLibrary */
	private UniversityDBLibrary univDBlib;
	/** A reference to University object */
	private University Univeristy;
	/** an ArrayList of all the students */
	private ArrayList<Student>allStudents;
	/** an ArrayList of all admins */
	private ArrayList<Admin>allAdmins;

	/** 
	 * Constructor.
	 * @param db database 
	 * @param username username to access database
	 * @param password password to access database
	 */
	public  DBController(String db, String username, String password){
		univDBlib = new UniversityDBLibrary(db,username,password);
	}

	/**
	 * returns the information in the database
	 * @return the database
	 */

	public UniversityDBLibrary getUnivDBlib(){
		return univDBlib;
	}

	/**
	 * When called, this method returns a 2-D array of Strings containing all universities in the database.
	 * @return a 2-D array of Strings containing all universities in the database.
	 *         A null is returned if there are no universities in the database or if a database error is encountered
	 */
	public ArrayList<University> getUniversities()
	{

		String arrayUni [][]= univDBlib.university_getUniversities();
		ArrayList<University> listUniversities = new ArrayList<University>();
		for(int i=0;i< arrayUni.length;i++)
		{
			listUniversities.add(new University(arrayUni[i][0],arrayUni[i][1],arrayUni[i][2],arrayUni[i][3], Integer.parseInt(arrayUni[i][4]),Double.parseDouble(arrayUni[i][5]),Integer.parseInt(arrayUni[i][6]),Integer.parseInt(arrayUni[i][6]),Integer.parseInt(arrayUni[i][7]),Integer.parseInt(arrayUni[i][8]), Integer.parseInt(arrayUni[i][9]),Double.parseDouble(arrayUni[i][10]),Double.parseDouble(arrayUni[i][11]),Integer.parseInt(arrayUni[i][12]),Integer.parseInt(arrayUni[i][13]), Integer.parseInt(arrayUni[i][14]), arrayUni[i][15]));

		}
		return listUniversities;
	}

	/**
	 * When called, this method creates a new university record using the information provided in the parameters.
	 * @param u University that is going to be added
	 * @return true if the school is successfully added
	 */
	public int addUniversity(University u){
		return univDBlib.university_addUniversity(u.getName(),u.getState(),u.getLocation(),u.getControl(), u.getNumberStudents(), u.getPctFemale(), u.getSatVerbal(), u.getSatMath(), u.getExpenses(), u.getPctFinancialAid(), u.getNumberOfApplicants(),u.getPctAdmitted(), u.getPctEnrolled(),u.getAcademicScale() , u.getSocialScale(), u.getQualityOfLifeScale());
	
	}

	/**
	 * When called, this method updates the university record for the university whose name is specified as a parameter, 
	 * using the information provided in the parameters.
	 * @param u University to be edited
	 * @return true if the school is successfully edited
	 */

	public int editUniversity(University u)
	{
		return univDBlib.university_editUniversity(u.getName(),u.getState(),u.getLocation(),u.getControl(), u.getNumberStudents(), u.getPctFemale(), u.getSatVerbal(), u.getSatMath(), u.getExpenses(), u.getPctFinancialAid(), u.getNumberOfApplicants(),u.getPctAdmitted(), u.getPctEnrolled(),u.getAcademicScale() , u.getSocialScale(), u.getQualityOfLifeScale());
		

  }
	
public int deleteUniversity(University u)
{
	return univDBlib.university_deleteUniversity(u.getName());
}
  
  
  public  ArrayList<Student> getStudents()
  { 
	  String arrayStudent[][]= univDBlib.user_getUsers();
	  ArrayList<Student> listStudent= new ArrayList<Student>();
      for(int i=0;i< arrayStudent.length;i++)
      {
    	  if(arrayStudent[i][4].charAt(0)== 'u')
    	  {
    	     listStudent.add(new Student(arrayStudent[i][0],arrayStudent[i][1],arrayStudent[i][2],arrayStudent[i][3],arrayStudent[i][4].charAt(0),arrayStudent[i][5].charAt(0)));
      }
      }
     return listStudent;
		  
  }
  

  
  public ArrayList<University> getSavedSchool(String username)
  {
  String[][] arrayUni= univDBlib.user_getUsernamesWithSavedSchools();
  ArrayList<University> savedUni= new ArrayList<University>();
  for (int i = 0; i < arrayUni.length; ++i) {
	  if(arrayUni[i][0].equals(username))
	  {
          String univName = arrayUni[i][1];
          for(University u:this.getUniversities())
          {
        	  if(u.getName().equals(univName))
        	  {
        		savedUni.add(u) ;
        		
        	  }
          }
	  }
  }
          return savedUni;
  }
  


	

	/**
	 * When called, this method returns a 2-D array of Strings containing all admins records in the database.
	 * @return a 2-D array of Strings containing all Admins in the database. A null is returned if there are no admins in the database or if a 
	 *         database error is encountered
	 */
	public  ArrayList<Admin> getAdmins()
	{ 
		String arrayUser[][]= univDBlib.user_getUsers();
		ArrayList<Admin> listAdmin= new ArrayList<Admin>();
		for(int i=0;i< arrayUser.length;i++)
		{
			if(arrayUser[i][4].charAt(0)== 'a')
			{
				listAdmin.add(new Admin(arrayUser[i][0],arrayUser[i][1],arrayUser[i][2],arrayUser[i][3],arrayUser[i][4].charAt(0),arrayUser[i][5].charAt(0)));
			}
		}
		return listAdmin;

	}

	/**
	 * When called, this method returns a 2-D array of Strings containing all usernames along with their saved schools in the database.
	 * @return a 2-D array of Strings containing all (username, school) pairs in the database.
	 *         A null is returned if no users have saved schools in the database or if a database error is encountered
	 */
	public ArrayList<ArrayList<String>> getSavedSchool()
	{
		String[][] arrayUni= univDBlib.user_getUsernamesWithSavedSchools();
		ArrayList<ArrayList<String>> schoolLists = new ArrayList<ArrayList<String>>();
		for (int i = 0; i < arrayUni.length; ++i) {
			ArrayList<String> list = new ArrayList<String>();
			schoolLists.add(list);
			for (int j = 0; j < arrayUni[0].length; ++j) {

				{
					list.add(arrayUni[i][j]);
				}

			}
		}

		return schoolLists;
	}

	/**
	 * When called, this method removes the specified school from the user's list of saved schools.
	 * @param username a String representing the username of the user from whom this school is being removed
	 * @param school a String containing the school to be removed from the user's list of saved schools
	 * @return true if the school is successfully removed
	 */
	public int  removeSchool(String username,String school)
	{
		return univDBlib.user_removeSchool(username,school);
		

	}


	/**
	 * When called, this method saves the specified school to the user's list of saved schools and returns true.
	 * @param user  a String representing the username of the user for whom this school is being added
	 * @param uni a String containing the school to be saved to the user's list of schools
	 * @return true if school is successfully saved
	 */

	public int saveSchool(Student user, String uni)
	{
		return  univDBlib.user_saveSchool(user.getUsername(),uni);
		
	}
	
	public int deleteStudent(String s)
	{
		return univDBlib.user_deleteUser(s);
	}

	/**
	 * When called, this method creates a new student record using the information provided in the parameters.
	 * @param student student to be added 
	 * @return true of the student is successfully added
	 */
	public int addStudent(Student student)
	{
		return univDBlib.user_addUser(student.getFirstName(), student.getLastName(),student.getUsername(), student.getPassword(), student.getType());
	
	}

	public int addUniversityEmphasis(University u, String emphasis){
		return univDBlib.university_addUniversityEmphasis(u.getName(), emphasis);
	}

	/**
	 * When called, this method creates a new admin record using the information provided in the parameters.
	 * @param admin admin to be added
	 * @return true if the admin is successfully added
	 */
	public int addAdmin(Admin admin)
	{
		return  univDBlib.user_addUser(admin.getFirstName(), admin.getLastName(),admin.getUsername(), admin.getPassword(), admin.getType());
	
	}

	/**
	 * When called, this method updates the record of the user, whose username is specified as a parameter, using the information provided in the parameters.
	 * @param student student to be edited
	 * @return true if the student is successfully edited
	 */

	public int editStudent(Student student)
	{
		return univDBlib.user_editUser(student.getUsername(),student.getFirstName(),student.getLastName(), student.getPassword(), student.getType(), student.getStatus());
		


	}

	/**
	 * When called, this method updates the record of the user, whose username is specified as a parameter, using the information provided in the parameters.
	 * @param admin admin to be edited
	 * @return true if the admin is successfully edited
	 */


	public int editAdmin(Admin ad)
	{
		return univDBlib.user_editUser(ad.getUsername(),ad.getFirstName(), ad.getLastName(), ad.getPassword(), ad.getType(), ad.getStatus());
		

	}

	/**
	 * Finds out if the logged in User is and Admin
	 * @param username username of the logged in user
	 * @return true if the specified user is an admin
	 */
	public boolean isUserAdmin(String username){
		boolean value =false;
		allAdmins = this.getAdmins();
		for(Admin admin: allAdmins)
		{
			if(admin.getUsername().equals(username))
			{
				value = true;
			}
		}
		return value;
	}

	/**
	 * Finds out if the logged in User is and Stuendt
	 * @param username username of the logged in user
	 * @return true if the specified user is an student
	 */

	public boolean isUserStudent(String username){
		boolean value =false;
		allStudents = this.getStudents();
		for(Student student: allStudents)
		{
			if(student.getUsername().equals(username))
			{
				value = true;
			}
		}
		return value;
	}

	public int removeUniversityEmphasis(String uni, String emphasis)
	{
		return univDBlib.university_removeUniversityEmphasis(uni, emphasis);
	}


}

