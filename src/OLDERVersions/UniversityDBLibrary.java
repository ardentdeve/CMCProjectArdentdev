package Project;

import java.util.*;
//library needed to connect to, retrieve data from, and modify data in the database
import java.sql.*;

/**
* Class UniversityDBLibrary allows data operations on the MySQL database used in 
* your CSCI230 class project.
* 
* @author irahal
* @version 1.6
*/
public class UniversityDBLibrary {

	  /**
	   * When called, this method creates a new university record using the 
	   * information provided in the parameters.
	   * 
	   * @param school a String containing the name for the new university which 
	   * must be unique among all universities
	   * @param state a String containing the state in which the new university is 
	   * located. Specify "-1" if the value of this field is unknown. Specify 
	   * "FOREIGN" if the university is located outside the US
	   * @param location a String specifying the type of area in which the new 
	   * university is located. Possible values are "SUBURBAN", "URBAN" and 
	   * "SMALL-CITY".  Specify "-1" if the value of this field is unknown
	   * @param control a String specifying who controls the new university. 
	   * Possible values are "PRIVATE", "STATE" and "CITY". Specify "-1" if the 
	   * value of this field is unknown
	   * @param numberOfStudents an integer representing the number of students 
	   * currently enrolled in the new university
	   * @param percentFemales a double out of 100 representing the percentage of 
	   * females in the student population
	   * @param SATVerbal a double out of 800 representing the average SAT Verbal 
	   * exam score for all students currently enrolled in the new university
	   * @param SATMath a double out of 800 representing the average SAT Math 
	   * exam score for all students currently enrolled in the new university
	   * @param expenses a double representing the annual tuition for the new 
	   * university
	   * @param percentFinancialAid a double out of 100 representing the 
	   * percentage of students receiving any form sort of financial assistance 
	   * from the new university
	   * @param percentAdmitted a double out of 100 representing the percentage 
	   * of applicants who are admitted annually to the new university
	   * @param percentEnrolled a double out of 100 representing the percentage 
	   * of admitted students who enroll in the new university
	   * @param academicsScale an int between 1 and 5 (with 5 being best) 
	   * indicating the quality of the academics at the new university 
	   * @param socialScale an int between 1 and 5 (with 5 being best) 
	   * indicating the quality of the social life at the new university 
	   * @param qualityOfLifeScale an int between 1 and 5 (with 5 being best) 
	   * indicating the overall quality of life at the new university 
	   * @throws SQLException is always thrown when this method is called 
	   * requiring callers to include the call inside a try/catch block
	   * @see #getAllUniversities() 
	   */
	 
	  public static void addUniversity(String school, String state, String location, String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) throws SQLException {
	      String query = "Insert Into University Values('" + school + "','"
	              + state + "','"
	              + location + "','"
	              + control + "',"
	              + numberOfStudents + ","
	              + percentFemales + ","
	              + SATVerbal + ","
	              + SATMath + ","
	              + expenses + ","
	              + percentFinancialAid + ","
	              + numberOfApplicants + ","
	              + percentAdmitted + ","
	              + percentEnrolled + ","
	              + academicsScale + ","
	              + socialScale + ","
	              + qualityOfLifeScale + ")";
	      UniversityDBLibrary(query);
	  }
	  
	  /**
	   * When called, this method adds a new emphasis area for the 
	   * specified school.
	   * 
	   * @param school a String containing the name of the school for which the 
	   * new emphasis area is being added
	   * @param emphasis a String containing the new emphasis to be added to the 
	   * specified school
	   * @throws SQLException is always thrown when this method is called 
	   * requiring callers to include the call inside a try/catch block
	   * @see #getAllPossibleEmphases() 
	   * @see #getAllUniversityNamesWithEmphases() 
	   * @see #getAllUniversityRecordsWithEmphases() 
	   */
	  public static void addUniversityEmphasis(String school, String emphasis) throws SQLException {
	      String query = "Insert Into Emphasis Values('" + school + "','" + emphasis + "')";
	      UniversityDBLibrary(query);
	  }
	  
	  /**
	   * When called, this method updates the university record for the 
	   * university whose name is specified as a parameter, using the 
	   * information provided in the parameters.
	   * 
	   * @param school a String containing the name for the university being 
	   * updated
	   * @param state a String containing the updated state in which the 
	   * university being updated is located. Specify "-1" if the value of this 
	   * field is unknown.
	   * @param location a String specifying the updated type of area in which the 
	   * university being updated is located. Possible values are "SUBURBAN", 
	   * "URBAN" and "SMALL-CITY".  Specify "-1" if the value of this field is 
	   * unknown
	   * @param control a String specifying who controls the university  being 
	   * updated. Possible values are "PRIVATE", "STATE" and "CITY". Specify "-1" 
	   * if the value of this field is unknown
	   * @param numberOfStudents an integer representing the updated number of 
	   * students currently enrolled in the university being updated
	   * @param percentFemales a double out of 100 representing the updated 
	   * percentage of females in the student population
	   * @param SATVerbal a double out of 800 representing the updated average SAT
	   * Verbal exam score for all students currently enrolled in the university 
	   * being updated
	   * @param SATMath a double out of 800 representing the updated average SAT
	   * Math exam score for all students currently enrolled in the university 
	   * being updated
	   * @param expenses a double representing the updated annual tuition for the 
	   * university being updated
	   * @param percentFinancialAid a double out of 100 representing the updated
	   * percentage of students receiving any form sort of financial assistance 
	   * from the university being updated
	   * @param percentAdmitted a double out of 100 representing the updated 
	   * percentage of applicants who are admitted annually to the university 
	   * being updated
	   * @param percentEnrolled a double out of 100 representing the updated 
	   * percentage of admitted students who enroll in the university being 
	   * updated
	   * @param academicsScale an int between 1 and 5 (with 5 being best) 
	   * indicating the updated quality of the academics at the university being 
	   * updated
	   * @param socialScale an int between 1 and 5 (with 5 being best) 
	   * indicating the updated quality of the social life at the university being 
	   * updated
	   * @param qualityOfLifeScale an int between 1 and 5 (with 5 being best) 
	   * indicating the updated overall quality of life at the university being 
	   * updated
	   * @throws SQLException is always thrown when this method is called 
	   * requiring callers to include the call inside a try/catch block
	   * @see #getAllUniversities() 
	   */
	  public static void editUniversity(String school, String state, String location, String control, int numberOfStudents, double percentFemales, double SATVerbal, double SATMath, double expenses, double percentFinancialAid, int numberOfApplicants, double percentAdmitted, double percentEnrolled, int academicsScale, int socialScale, int qualityOfLifeScale) throws SQLException {
	      String query = "Update University set   "
	              + "State               ='" + state + "'"
	              + ",Location            ='" + location + "'"
	              + ",Control             ='" + control + "'"
	              + ",NumberOfStudents    = " + numberOfStudents
	              + ",PercentFemales      = " + percentFemales
	              + ",SATVerbal           = " + SATVerbal
	              + ",SATMath             = " + SATMath
	              + ",Expenses            = " + expenses
	              + ",PercentFinancialAid = " + percentFinancialAid
	              + ",NumberOfApplicants  = " + numberOfApplicants
	              + ",PercentAdmitted     = " + percentAdmitted
	              + ",PercentEnrolled     = " + percentEnrolled
	              + ",AcademicsScale      = " + academicsScale
	              + ",SocialScale         = " + socialScale
	              + ",QualityOfLifeScale  = " + qualityOfLifeScale
	              + " Where School = '" + school + "'";
	      UniversityDBLibrary(query);
	  }
    
  /**
   * When called, this method returns a 2-D array of Strings containing all 
   * possible university emphases that occur in the database. Every array row 
   * contains a single field storing an occ= true;urring emphasis. Duplicate emphases 
   * are eliminated. Records in the array are sorted by emphasis in ascending 
   * order.
   * 
   * @return a 2-D array of Strings containing all possible university 
   * emphases that occur in the database. A null is returned if no 
   * universities have emphases in the database.
   * @throws SQLException is always thrown when this method is called 
   * requiring callers to include the call inside a try/catch block
   */
  public static String[][] getAllEmphases() throws SQLException {
      return UniversityDBLibrary("Select distinct Area from Emphasis Order by Area");
  }

  /**
   * When called, this method returns a 2-D array of Strings containing all 
   * university records along with their emphases in the database. Every array 
   * row contains a complete university record followed by an emphasis. 
   * Universities with multiple emphases will have their records repeat 
   * multiple times in the array each time with a different emphasis. 
   * Universities with no emphases will not be included in the output array. 
   * Records in the array are sorted first by school name and then by emphasis 
   * in ascending order.
   * 
   * @return a 2-D array of Strings containing all (university name, emphasis)
   * pairs in the database. A null is returned if no universities have 
   * emphases in the database.
   * @throws SQLException is always thrown when this method is called 
   * requiring callers to include the call inside a try/catch block
   */
  public static String[][] getUniversityNamesWithEmphases() throws SQLException {
      return UniversityDBLibrary("Select * from Emphasis Order by School, Area");
  }
  
  /**
   * When called, this method returns a 2-D array of Strings containing all 
   * universities in the database. Every array row contains a university 
   * record which, in turn, is made up of the following fields: School String 
   * (must be unique among universities), State String, Location String, 
   * Control String, NumberOfStudents int, PercentFemales double (between 0 
   * and 100), SATVerbal double (up to 800), SATMath double (up to 800), 
   * Expenses double, PercentFinancialAid double (between 0 and 100), 
   * NumberOfApplicants int, PercentAdmitted double (between 0 and 100), 
   * PercentEnrolled double (between 0 and 100), AcademicsScale int (between 
   * 1 and 5 where is best), SocialScale int (between 1 and 5 where is best), 
   * QualityOfLifeScale int (between 1 and 5 where is best). Records in the 
   * array are sorted by School name in ascending order.
   * 
   * For example, the following Java statement 
   *      String[][] allUnivs = UniversityDBLibrary.getAllUniversities() 
   * will store all universities in array allUnivs. The State and SATVerbal 
   * fields for the first university would be stored in allUnivs[0][1] and 
   * allUser[0][6], respectively.
   * 
   * Please note that some universities have missing field information which 
   * have been indicated by the String "-1" for String fields and the number 
   * -1 for number fields.
   * 
   * @return a 2-D array of Strings containing all universities in the 
   * database. A null is returned if there are no universities in the 
   * database.
   * @throws SQLException is always thrown when this method is called 
   * requiring callers to include the call inside a try/catch block
   * @see #addUniversity(java.lang.String, java.lang.String, java.lang.String, 
   *                     java.lang.String, int, double, double, double, 
   *                     double, double, int, double, double, int, int, int) 
   */    
  public static String[][] getAllUniversities() throws SQLException {
      return UniversityDBLibrary("Select * from University Order by School");
  }
  
  
  /**
   * When called, this method deletes the given emphasis area for the 
   * specified school from the database.
   * 
   * @param school a String containing the name of the school for which the 
   * emphasis areas are being added
   * @param emphases an ArrayList<String> containing the new emphases to be 
   * added to the specified school in place of the old ones
   * @throws SQLException is always thrown when this method is called 
   * requiring callers to include the call inside a try/catch block
   * @see #addUniversityEmphasis(java.lang.String, java.lang.String) 
   */    
  public static void removeUniversityEmphases(String school, ArrayList<String> emphases) throws SQLException {
      String query = "delete from Emphasis where School='" + school + "'";
      UniversityDBLibrary(query);   
  }
  
  /**
   * When called, this method creates a new user record using the information
   * provided in the parameters.
   * 
   * @param firstName a String containing the first name for the new user
   * @param lastName a String containing the last name for the new user
   * @param username a String containing the username for the new user which 
   * must be unique among all users
   * @param password a String containing the password for the new user
   * @param type should be either 'a' for administrators or 'u' for regular 
   * users
   * @throws SQLException is always thrown when this method is called 
   * requiring callers to include the call inside a try/catch block. This 
   * method also throws an SQLException if the specified username is not 
   * unique among all users.
   * @see #getAllUsers() 
   */
  public static void addUser(String firstName, String lastName, String username, String password, char type) throws SQLException {
      String query = "Insert Into User Values(null,'" + firstName + "','"
              + lastName + "','"
              + username + "','"
              + password + "','"
              + type + "','"
              + "Y')";
      UniversityDBLibrary(query);
  }
  
  /**
   * When called, this method updates the record of the user, whose username 
   * is specified as a parameter, using the information provided in the parameters.
   * 
   * @param username a String containing the username of the user whose 
   * account is being modified 
   * @param firstName a String containing the new first name for the user
   * @param lastName a String containing the new last name for the  user
   * @param password a String containing the new password for the user
   * @throws SQLException is always thrown when this method is called 
   * requiring callers to include the call inside a try/catch block.
   * @see #getAllUsers() 
   */
  public static void editUser(String username, String firstName, String lastName, String password) throws SQLException {
      String query = "Update User set FirstName = '" + firstName + "',"
              + " LastName = '" + lastName + "',"
              + " Password = '" + password + "'"
              + " where Username='" + username + "'";
      UniversityDBLibrary(query);
  }
  
  /**
   * When called, this method returns a 2-D array of Strings containing the 
   * record(s) of the user(s) whose Username is specified as a parameter.
   * 
   * @param username a String containing the Username of the desired user(s)
   * @return a 2-D array of Strings containing the record(s) of the user(s) 
   * whose Username is specified as a parameter. A null is returned if no such 
   * users exist in the database.
   * @throws SQLException is always thrown when this method is called 
   * requiring callers to include the call inside a try/catch block
   * @see #getAllUsers()      
   */
  public static String[][] getUserNamesWithSavedSchools() throws SQLException {
      return UniversityDBLibrary("Select * from Student order by UserName);
  }
  
  /**
   * When called, this method returns a 2-D array of Strings containing all 
   * users in the database. Every array row contains a user record which, in 
   * turn, is made up of the following fields: Id int (a new unique number is 
   * assigned for every user), FirstName String, LastName String, Username 
   * String (must be unique among users), Password String, Type char (can be 
   * either 'a' for administrators or 'u' for regular users), Status char (can 
   * be either 'Y' for active accounts or 'N' inactive ones). Records in the 
   * array are sorted by user Id in ascending order.
   * 
   * For example, the following Java statement:
   *      String[][] allUsers = UniversityDBLibrary.getAllUsers() 
   * will store all system users in array allUsers. The Username and password 
   * fields for the first user would be stored in allUsers[0][3] and 
   * allUsers[0][4], respectively.
   * 
   * @return a 2-D array of Strings containing all users in the database. A 
   * null is returned if there are no users in the database.
   * @throws SQLException is always thrown when this method is called 
   * requiring callers to include the call inside a try/catch block
   */
  public static String[][] getUsers() throws SQLException {
      return UniversityDBLibrary("Select * from User Order by Id");
  }


  /**
   *When called, this method removes the specified 
   *school from the user's list of saved schools.
   * 
   * @param Id an int representing the user for whom the specified school is 
   * being removed
   * @param school a String containing the school to be removed from the 
   * user's list of saved schools
   * @throws SQLException is always thrown when this method is called 
   * requiring callers to include the call inside a try/catch block
   * @see #getAllSavedSchools() 
   * @see #getSavedSchools(int) 
   */
  public static void removeUserSchool(int Id, String school) throws SQLException {
      String query = "delete from MySavedSchools where Id=" + Id + " and School='" + school + "'";
      UniversityDBLibrary(query);
  }

  /**
   * When called, this method saves the specified school to the user's list 
   * of saved schools and returns true.
   * 
   * @param Id an int representing the user for whom the specified school is 
   * being saved
   * @param school a String containing the school to be saved to the user's 
   * list of saved schools
   * @return true if the specified shool was successfully added to the user's 
   * list of saved schools or false otherwise
   * @throws SQLException is always thrown when this method is called 
   * requiring callers to include the call inside a try/catch block
   * @see #getAllSavedSchools() 
   * @see #getSavedSchools(int) 
   */
  public static boolean saveSchool(int Id, String school) throws SQLException {
      String query = "select * from MySavedSchools where Id=" + Id + " and School like '" + school + "'";
      System.out.println(query);
      String[][] table = UniversityDBLibrary(query);

      if (table == null || table.length == 0) {
          query = "insert into MySavedSchools values(" + Id + ",'" + school + "')";
          UniversityDBLibrary(query);
          return true;
      }
      return false;
  }
}