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
			
			     StudentUI studentUI= new StudentUI(args[0],args[1], args[2]);
			      AdminUI   adminUI = new AdminUI(args[0],args[1], args[2]);
			   studentUI.logOn("nicoleK", "Ash1234");
			   studentUI.getStudentInfo();
			   System.out.println("Get Saved universities");
				 studentUI.getSavedUniversity();
				 System.out.println();
				 studentUI.saveUni("BOSTON COLLEGE");
				 studentUI.removeUniversity("BOSTON");
				 studentUI.getStudentInfo();
				 studentUI.logOff();
				adminUI.logOn("Rahal", "Imad");
			     Student s = new Student("Mimi", "Kardashian", "MimiLuv", "mi1234", 'u', 'Y');
			   adminUI.addStudent(s);
			    Student editS = new Student("MimiN", "Kardashian", "MimiLuv", "mi1234", 'u', 'Y');
			  adminUI.editStudent(editS);
			 adminUI.deactivateUser("Rahal");
		      adminUI.getStudents();
			 adminUI.getAdmins();
			University tech = new University("Kanye West TECHNOLOGY ","Kanye City","BIG-CITY","PRIVATE",5000,50.0,800,800,800,22000.0,50,1000.5,25.0,70,4,4,"4");
			adminUI.addUniversity(tech);
			adminUI.logOff();
			
		     
	

				
				 
	 
		
				 
				 
		          
			
			
			
			
			

	

}
}
