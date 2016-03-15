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
    	  listUniversities.add(new University(arrayUni[i][0],arrayUni[i][1],arrayUni[i][2],arrayUni[i][3], Integer.parseInt(arrayUni[i][4]),Double.parseDouble(arrayUni[i][5]),Integer.parseInt(arrayUni[i][6]),Integer.parseInt(arrayUni[i][6]),Integer.parseInt(arrayUni[i][7]),Integer.parseInt(arrayUni[i][8]), Integer.parseInt(arrayUni[i][9]),Double.parseDouble(arrayUni[i][10]),Double.parseDouble(arrayUni[i][11]),Integer.parseInt(arrayUni[i][12]),Integer.parseInt(arrayUni[i][13]), Integer.parseInt(arrayUni[i][14]), arrayUni[i][15], null));
    		
      }
     return listUniversities;
  }
  
  
  public int addUniversity(University u){
	  int value = univDBlib.university_addUniversity(u.getName(),u.getState(),u.getLocation(),u.getControl(), u.getNumberStudents(), u.getPctFemale(), u.getSatVerbal(), u.getSatMath(), u.getExpenses(), u.getPctFinancialAid(), u.getNumberOfApplicants(),u.getPctAdmitted(), u.getPctEnrolled(),u.getAcademicScale() , u.getSocialScale(), u.getQualityOfLifeScale());
	return value;
  }
  
  public int editUniversity(University u)
  {
	  int value = univDBlib.university_editUniversity(u.getName(),u.getState(),u.getLocation(),u.getControl(), u.getNumberStudents(), u.getPctFemale(), u.getSatVerbal(), u.getSatMath(), u.getExpenses(), u.getPctFinancialAid(), u.getNumberOfApplicants(),u.getPctAdmitted(), u.getPctEnrolled(),u.getAcademicScale() , u.getSocialScale(), u.getQualityOfLifeScale());
		return value;  
  }
  
  public  void getUsers(User user)
  { 
	  String arrayUsers[][]= univDBlib.user_getUsers();
	  ArrayList<User> listUser= new ArrayList<User>();
      for(int i=0;i< arrayUsers.length;i++)
      {
    	  listUser.add(new User(arrayUsers[i][0],arrayUsers[i][1],arrayUsers[i][2],arrayUsers[i][3],arrayUsers[i][4].charAt(0),arrayUsers[i][5].charAt(0));
    	  java.lang.String firstName, java.lang.String lastName, java.lang.String username, java.lang.String password, char type
      }
     return listUniversities;
  }
	
      
	      
	  
  }
}
      
