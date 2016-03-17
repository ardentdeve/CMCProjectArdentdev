/**
 * @author ArdentDevelopers
 */

package project;

import java.util.ArrayList;
import java.util.HashMap;

public class StudentHome {
	/** A hashmap with a username for a key, and an Admin object as the value*/
	private HashMap<String, Student> students;
	private DBController dbl;
	private ArrayList<User> users;
	
	/** An array containing the usernames of all existing Students*/
	private String[] usernames;
	
	public StudentHome(String data, String username, String password) {
		dbl= new DBController(data,username,password);
		students = new HashMap<String, Student>();
	}

	public Student findStudent(String username) {
		return students.get(username);
	}
	
	public void addUser(Student user) {
		if(!students.containsValue(user)) {
			students.put(user.getUsername(), user);
			usernames[usernames.length+1] = user.getUsername();
		}
	}

	public HashMap<String, Student> getMap() {
		return students;
	}
	
	public HashMap <String,Student> getStudents() {
		users = dbl.getUsers();	
		for(User user : users){
			if(user.getType()== 'u')
			{
				students.put(user.getUsername(),(Student) user);
			}
		}
		return students;
	}

	public boolean isUserStudent(User u){
	    if(students.containsValue(u))
	    {
	    	return true;
	    }
	    else
	    {
	    	return false;
	    }
	    	
	}

}