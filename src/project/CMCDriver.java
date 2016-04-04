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
		
		 SearchController searchCh = new SearchController();
		 University tech = new University("Kanye West TECHNOLOGY ","Kanye City","BIG-CITY","PRIVATE",5000,50.0,800,800,800,22000.0,50,1000.5,25.0,70,4,4,"4");
       ArrayList<University>uni= searchCh.search("Kanye West TECHNOLOGY ","Kanye City","BIG-CITY","PRIVATE",5000,50.0,800);
       for(University u : uni)
	   {
		  System.out.println(u);
	   }
        /**
		System.out.println(studentUI.logOn("nicoleK", "Ash1234"));
		studentUI.getStudentInfo();
		studentUI.getSavedUniversity();
		studentUI.saveUni("BOSTON COLLEGE");
		studentUI.removeUniversity("BOSTON");
		studentUI.logOff();
		Admin admin = adminH.findAdmin("Rahal");
		System.out.println(admin.getFirstName());
		Student s = new Student("Mimi", "Kardashian", "MimiLuv", "mi1234", 'u', 'Y');
		adminUI.addStudent(s);
		Student editS = new Student("MimiN", "Kardashian", "MimiLuv", "mi1234", 'u', 'Y');
		//adminUI.editStudent(editS);
		adminUI.getStudents();
		adminUI.getAdmins();
		University tech = new University("Kanye West TECHNOLOGY ","Kanye City","BIG-CITY","PRIVATE",5000,50.0,800,800,800,22000.0,50,1000.5,25.0,70,4,4,"4");
		adminUI.addUniversity(tech);
		adminUI.logOff();
**/


















	}
}
