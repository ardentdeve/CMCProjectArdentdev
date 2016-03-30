
package project;
import dblibrary.project.csci230.*;
import java.util.*;

/** 
 * To run, issue: java DBLibraryDriver "aonneji" "aonneji" "YourDatabasePassword" 
 * in the Interactions Pane in Dr. Java
 * 
 * Output will be saved to a comman-separated file called output.csv which you may open using a text editor or
 * a spreadsheet
 */ 

public class DBController {
  private UniversityDBLibrary univDBlib;
  private University Univeristy;
  private ArrayList<Student>allStudents;
  private ArrayList<Admin>allAdmins;
  
  public  DBController(String db, String username, String password){
    univDBlib = new UniversityDBLibrary(db,username,password);
  }
  
  public UniversityDBLibrary getUnivDBlib(){
    return univDBlib;
  }
  
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
  
  
  public boolean addUniversity(University u){
	  int value = univDBlib.university_addUniversity(u.getName(),u.getState(),u.getLocation(),u.getControl(), u.getNumberStudents(), u.getPctFemale(), u.getSatVerbal(), u.getSatMath(), u.getExpenses(), u.getPctFinancialAid(), u.getNumberOfApplicants(),u.getPctAdmitted(), u.getPctEnrolled(),u.getAcademicScale() , u.getSocialScale(), u.getQualityOfLifeScale());
	  if(value==1)
		{
		     return true;
		}
		return false;
}

  
  
  public boolean editUniversity(University u)
  {
	  int value = univDBlib.university_editUniversity(u.getName(),u.getState(),u.getLocation(),u.getControl(), u.getNumberStudents(), u.getPctFemale(), u.getSatVerbal(), u.getSatMath(), u.getExpenses(), u.getPctFinancialAid(), u.getNumberOfApplicants(),u.getPctAdmitted(), u.getPctEnrolled(),u.getAcademicScale() , u.getSocialScale(), u.getQualityOfLifeScale());
	  if(value==1)
		{
		     return true;
		}
		return false;


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
  
  public boolean removeSchool(String username,String school)
  {
	  int value = univDBlib.user_removeSchool(username,school);
	  if(value== 1)
	  {
		  return true;
	  }
	return false;

  }
  
  
 
	  
  
 
	
  public boolean saveSchool(Student user, String uni)
  {
		int value=  univDBlib.user_saveSchool(user.getUsername(),uni);
		if(value==1)
		{
		     return true;
		}
		return false;
  }


public boolean addStudent(Student student)
{
	int value = univDBlib.user_addUser(student.getFirstName(), student.getLastName(),student.getUsername(), student.getPassword(), student.getType());
	if(value==1)
	{
	     return true;
	}
	return false;
}

public boolean addAdmin(Admin admin)
{
	int value = univDBlib.user_addUser(admin.getFirstName(), admin.getLastName(),admin.getUsername(), admin.getPassword(), admin.getType());
	if(value==1)
	{
	     return true;
	}
	return false;
}




public boolean editStudent(Student student)
{
	int value = univDBlib.user_editUser(student.getUsername(),student.getFirstName(),student.getLastName(), student.getPassword(), student.getType(), student.getStatus());
	if(value==1)
	{
	     return true;
	}
	return false;


}

public boolean editAdmin(Admin ad)
{
	int value = univDBlib.user_editUser(ad.getUsername(),ad.getFirstName(), ad.getLastName(), ad.getPassword(), ad.getType(), ad.getStatus());
	if(value==1)
	{
	     return true;
	}
	return false;


}

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


}

