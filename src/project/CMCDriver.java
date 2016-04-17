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

		/**
		SearchController searchCh = new SearchController();
		University tech = new University("Kanye West TECHNOLOGY ","Kanye City","BIG-CITY","PRIVATE",5000,50.0,800,800,800,22000.0,50,1000.5,25.0,70,4,4,null);
		ArrayList<University>uni= searchCh.search("ABILENE CHRISTIAN UNIVERSITY","TEXAS","SUBURBAN","PRIVATE",10000,50,-1,-1.0,12088,70,4000,90,80,2,3,3,null);
		for(University u : uni)
		{
			System.out.println(u);
		}
		**/
		StudentUI  studentUI= new StudentUI();
		AdminUI   adminUI= new AdminUI();
		System.out.println(studentUI.logOn("nicoleK", "imad1234"));
		System.out.print(studentUI.getStudentInfo());
		ArrayList<University>uni = studentUI.getSavedUniversity();
		for(University u: uni)
		{
			System.out.println(u);
		}
		studentUI.removeUniversity("BOSTON COLLEGE");
		studentUI.editProfile("ashley", "loyola", "imad1234");
		studentUI.logOff();
		System.out.println(adminUI.logOn("Rahal", "Imad"));
		 Student s = new Student("Mimi", "Kardashian23", "MimiLuv33", "mi1234", 'u', 'Y');
		adminUI.addStudent(s);
		Student editS = new Student("MimiN", "Kallya44", "MimiLuv33", "mi1234", 'u', 'N');
		adminUI.editStudent(editS);
		adminUI.activateUser(editS);
		adminUI.deactivateUser(editS);
		adminUI.getStudents();
		adminUI.getAdmins();
		adminUI.logOff();


















	}




















	}

