package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CMCDriver {
	private Student s;
	private String username;
	
	
	 public static void main(String[] args) {
			UniversityHome dbld = new UniversityHome(args[0],args[1], args[2]);
			StudentHome sh = new StudentHome(args[0],args[1], args[2]);
				DBController dbl = new DBController(args[0],args[1], args[2]);
				HashMap<String, Student> students = sh.getStudents();
				for (Map.Entry<String, Student> student : students.entrySet()) {
					String username=  student.getKey();
				      Student s = student.getValue();
				      System.out.println(s.getUsername());
				}
				
				System.out.println("Demo university_addUniversity(a a x x 1 1 1 1 1 1 1 1 1 1 1 1");
				dbld.addUniversityToList(new University("ZIMBA","south michigan","x","x",1,1,1,1,1,1,1,1,1,1,1,1,"1"));
				System.out.println("Get all users in the database");
				dbld.getUniversities();
				System.out.println("Demo user_addUser(Ashley  AshleyUser AshleyPass a N'");
		        User user = new User("Ashley", "Nneji", "AshleyUser", "AshleyPass", 'a', 'N');
				dbl.addUser(user);
				System.out.println("Get all the users with the new users included");
				ArrayList<User > us = dbl.getUsers();
				 for(User u : us) 
				 {
			     System.out.println(u);
			}
				 
				 
		          
			
			
			
			
			

	

}
}
