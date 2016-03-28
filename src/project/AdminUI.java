package project;

import java.util.ArrayList;

public class AdminUI {
	private AdminHome adminH;
	private Admin admin;
	private Student student;
	private ArrayList<Admin>allAdmins;
	private UniversityHome uniH;
	

	public AdminUI(String n ,String us, String p){
		admin = new Admin();
		adminH= new AdminHome(n,us,p);
		uniH= new UniversityHome(n,us,p);
		allAdmins = new ArrayList<Admin>();
	}
	
	
	
	public void logOn(String n, String p)
	{
		admin= adminH.login(n, p);
		if(admin==null)
		{
			System.out.println("log on failed");
		}
		else
		{
			System.out.println("log on successful");
		}
	}
	
	public void logOff()
	{
		adminH.logoff();
	}
	public void addStudent(Student s)
	{
		adminH.addStudent(s);
	}
	
	public void addAdmin(Admin a)
	{
		adminH.addAdmin(a);
	}

	/**
	 * Deactivates the specified user by changing the Student's status
	 * 
	 * @param u the Student to deactivate
	 */
	public void deactivateUser(String username){
	   adminH.DeactivateUser(username);
	}

	
	public boolean editStudent(Student s)
	{
	   return adminH.editStudent(s);
	}
	public boolean editAdmin(Admin a)
	{
	   return adminH.editAdmin(a);
	}
	
	public void getStudents()
	{
		adminH.getStudents();
	}
	
	public void getAdmins()
	{
		adminH.getAdmins();
	}
	
	public void addUniversity(University u)
	{
		uniH.addUniversityToList(u);
	}
	
	public void getUniversities(){
	      uniH.getUniversities();
	}
}

	
