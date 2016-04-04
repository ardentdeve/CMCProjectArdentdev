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

	public  SearchController(){
		dbl = new DBController();
	}

	public ArrayList<University> search(String name, String state, String location, 
			String control,int numberStudents, double pctFemale, int satVerbal)
	{
		ArrayList<University > universityList = dbl.getUniversities();
		ArrayList<University> searchResult = new ArrayList<University>();
		for(University u: universityList) {
			boolean includeUni = true;
			if(name!=null) {
				if(!(u.getName().equals(name)))
				{
					includeUni = false;
				}
					
			}
			if(state!=null) {
				String uniN= u.getState();
				if(!(uniN.equals(state)))
				{
					includeUni = false;
				}
					
			}
			if(location!=null) {
				String uniN= u.getLocation();
				if(!(uniN.equals(location)))
				{
					includeUni = false;
				}
					
			}

			if(control!=null) {
				String uniN= u.getControl();
				if(!(uniN.equals(control)))
				{
					includeUni = false;
				}
					
			}
			if(numberStudents!=-1) {
				int uniN= u.getNumberStudents();
				if(uniN !=numberStudents)
				{
					includeUni = false;
				}
					
			}

			if(pctFemale!=-1.0) {
				double uniN= u.getPctFemale();
				if(uniN !=pctFemale)
				{
					includeUni = false;
				}
					
			}
			
			

			if(satVerbal!=-1.0) {
				double uniN= u.getSatVerbal();
				if(uniN !=satVerbal)
				{
					includeUni = false;
				}
					
			}
			
		if(includeUni) {
			searchResult.add(u);
		}

		
	}
		return searchResult;
	}
}


