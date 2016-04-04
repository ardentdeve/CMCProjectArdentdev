/**
 * 
 */
package project;

import java.util.ArrayList;

/**
 * @author aonneji
 *
 */
public class SearchController{
	DBController dbl;

	public  SearchController(String db, String username, String password){
		dbl = new DBController(db,username,password);
	}

	public ArrayList<University> search(String name, String state, String location, String control ,int numberStudents, double pctFemale,
			int satVerbal, int satMath, int expenses, double pctFinancialAid, int numberOfApplicants,
			double pctAdmitted, double pctEnrolled, int academicScale, int socialScale, int qualityOfLifeScale, String emphases) {	
		ArrayList<University > universityList = dbl.getUniversities();
		ArrayList<University> searchResult = new ArrayList<University>();
		boolean includeUni = true;
		for(University u: universityList) {
			if(name!=null) {
				if(u.getName().equals(name)) 
					includeUni =false;
			}

			if(state!=null) {
				if(u.getName().equals(name)) 
					includeUni =false;
			}
			if(location!=null) {
				if(u.getName().equals(name)) 
					includeUni =false; 
			}

			if(control!=null) {
				if(u.getName().equals(name)) 
					includeUni =false;
			}
			if(numberStudents!=-1) {
				if(u.getName().equals(name)) 
					includeUni =false;
			}

			if(pctFemale!=-1) {
				if(u.getName().equals(name)) 
					includeUni =false;
			}
			if(numberStudents!=-1) {
				if(u.getName().equals(name)) 
					includeUni =false;
			}
		}

		if(includeUni) {
			searchResult.add(u);
		}

		return searchResults;
	}
}


