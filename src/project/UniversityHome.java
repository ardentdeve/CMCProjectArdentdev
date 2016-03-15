package project;

import java.util.*;

public class UniversityHome {
	private List<University> universities;
	private DBController dbl;
	
	public UniversityHome(){
		universities = new ArrayList<University>();
	}
	
	public void addUniversityToList(University u){
		universities.add(u);
	}
	
	
	
	public void  getUniversities(){
		universities = dbl.getUniversities();
		ArrayList<University> uni =new ArrayList<University>(); 
		uni = dbl.getUniversities();
		 for(University u : uni)
		 {
	     System.out.println(u);
	}
	}
	

}

