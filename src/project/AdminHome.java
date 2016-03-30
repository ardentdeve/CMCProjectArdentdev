package project;

import java.util.ArrayList;

public class AdminHome {
	
	
	/** An array containing the usernames of all existing Students*/
	private String[] usernames;
	private Admin admin;
	private Student student;
	private ArrayList<Admin>allAdmins;
	private ArrayList<Student>allStudents;
	private DBController dbl;

	public AdminHome(String d, String username, String password) {
		 dbl = new DBController(d,username,password);
		 admin = null;
	}
	public Admin login(String username, String password)
	{
		boolean result = this.isUserAdmin(username);
		if(result == true)
		{
		 Admin admin = this.findAdmin(username);
			if(admin.getPassword().equals(password))
			{
				this.admin=  admin;
				admin.setLoginStatus(true);
				
			}
							
		}
		
	
		return this.admin;
		
		
}
	
	public void logoff()
	{
		try
		{
		if(!(admin==null))
		{
	       admin.setLoginStatus(false);
	       admin = null;
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
	
	
	
	/**
	 * searches the hashmap in this class for an admin of the specified 
	 * username and returns it if found. If not found it returns null
	 * 
	 * @param username the username of the admin to search for
	 * @return the admin corresponding to the username specified
	 */
	public Admin findAdmin(String username){
		allAdmins = dbl.getAdmins();
		Admin ad = new Admin();
		for(Admin a : allAdmins)
		{
			if(a.getUsername().equals(username))
			{
		       ad = a;
	}
		}
		return ad;
	}
	
	
	
	
	
	public void DeactivateUser(String username)
	{
		allStudents= dbl.getStudents();
		boolean value = false;
	  if(this.isUserAdmin(username)== true)
	  {
		  Admin adminS = findAdmin(username);
		  adminS = new Admin(adminS.getFirstName(),adminS.getLastName(),adminS.getUsername(), adminS.getPassword(),adminS.getType(),'N');
		  value = this.editAdmin(adminS);
		  System.out.println("The Admin with this username : " + username + " - has been deactivated"); 
	  }
	  else if(this.isUserStudent(username)== true)
	  {
		 for(Student s :allStudents) 
		 {
			 if(s.getUsername().equals(username))
				{
			       student = s;
			      student = new Student(student.getFirstName(),student.getLastName(),student.getUsername(), student.getPassword(),student.getType(),'N');
			       value = this.editStudent(student);
		}
		 }
		 System.out.println("The student with this username : " + username + " - has been deactivated"); 
	  }
	  else
	  {
		  System.out.println("User does not exist");
	  }
	 
}
	
	public void addStudent(Student student) {
		dbl.addStudent(student);
		
	}
	
	public boolean editStudent(Student s)
	{
		return dbl.editStudent(s);
	}
	
	public void addAdmin(Admin admin) {
		dbl.addAdmin(admin);
		
	}
	public boolean editAdmin(Admin admin)
	{
		return dbl.editAdmin(admin);
	}
	

	public void getAdmins(){
		allAdmins = dbl.getAdmins();
		for(Admin ad : allAdmins)
		{
			System.out.println(ad);
		}
	}
	
	public void getStudents()
	{
		allStudents = dbl.getStudents();
		for(Student s : allStudents)
		{
			System.out.println(s);
		}
	}

	public boolean isUserAdmin(String username){
		return dbl.isUserAdmin(username);
}
	
	public boolean isUserStudent(String username){
		return dbl.isUserStudent(username);
}
}