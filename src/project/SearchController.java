package project;

import java.util.ArrayList;

/**
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

	public ArrayList<University> search(String name, String state, String location, String control, int numberStudents, double pctFemale, double satVerbal, double satMath, 
			double expenses, double pctFinancialAid, int numberOfApplicants, double pctAdmitted, double pctEnrolled, int AcademicScale, int socialScale, int QualityOfLifeScale,ArrayList<String>emphasis){
			
			/**int numberStudentsMin, int numberStudentsMax, double pctFemaleMin, double pctFemaleMax, double satVerbalMin, double satVerbalMax, double satMathMin, double satMathMax, 
			double expensesMin, double expensesMax, double pctFinancialAidMin, double pctFinancialAidMax, int numberOfApplicantsMin, int numberOfApplicantsMax, double pctAdmittedMin, double pctAdmittedMax, double pctEnrolledMin, double pctEnrolledMax, int AcademicScaleMin, int AcademicScaleMax, int socialScaleMin, int socialScaleMax, int QualityOfLifeScaleMin, int QualityOfLifeScaleMax,ArrayList<String>emphasisMin,ArrayList<String>emphasisMax) {

**/
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

			if(satMath!=-1) {
				double uniN= u.getSatMath();
				if(uniN !=satVerbal)
				{
					includeUni = false;
				}

			}

			if(expenses!=-1.0) {
				double uniN= u.getExpenses();
				if(uniN !=expenses)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("expenses: " + includeUni);
			}

			if(pctFinancialAid!=-1.0) {
				double uniN= u.getPctFinancialAid();
				if(uniN !=pctFinancialAid)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("pctFinancialAid: " + pctFinancialAid + includeUni);
				System.out.println("expected pctFinancialAid: " + u.getPctFinancialAid());
			}

			if(numberOfApplicants!=-1) {
				int uniN= u.getNumberOfApplicants();
				if(uniN !=numberOfApplicants)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("numberOfApplicants: " + u.getNumberOfApplicants() + includeUni);
			}


			if(pctAdmitted!=-1.0) {
				double uniN= u.getPctAdmitted();
				if(uniN !=pctAdmitted)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("numberOfApplicants: " + u.getNumberOfApplicants() + includeUni);
			}


			if(pctEnrolled!=-1.0) {
				double uniN= u.getPctEnrolled();
				if(uniN !=pctEnrolled)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("numberOfApplicants: " + u.getNumberOfApplicants() + includeUni);
			}

			if(AcademicScale!=-1) {
				int uniN= u.getAcademicScale();
				if(uniN !=AcademicScale)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("numberOfApplicants: " + u.getNumberOfApplicants() + includeUni);
			}

			if(socialScale!=-1) {
				int uniN= u.getSocialScale();
				if(uniN !=socialScale)
				{
					includeUni = false;
				}

			}
			if(QualityOfLifeScale!=-1) {
				int uniN= u.getQualityOfLifeScale();
				if(uniN < QualityOfLifeScale)
				{
					includeUni = false;
				}
			}
			
	/**		if(QualityOfLifeScaleMax!=-1) {
				int uniN= u.getQualityOfLifeScale();
				if(uniN > QualityOfLifeScaleMax)
				{
					includeUni = false;
				}
			}
			if(QualityOfLifeScaleMin!=-1){
				int uniN= u.getQualityOfLifeScale();
				if(uniN > QualityOfLifeScaleMax)
				{
					includeUni = false;
				}
			}
			
			if(QualityOfLifeScaleMin!=-1){
				int uniN= u.getQualityOfLifeScale();
				if(uniN > QualityOfLifeScaleMax)
				{
					includeUni = false;
				}
			}

		
			if(numberStudentsMin!=-1) {
				int uniN= u.getNumberStudents();
				if(uniN< numberStudentsMin)
				{
					includeUni = false;
				}

			}
			
			if(numberStudentsMax!=-1) {
				int uniN= u.getNumberStudents();
				if(uniN> numberStudentsMax)
				{
					includeUni = false;
				}

			}

			if(pctFemaleMin!=-1.0) {
				double uniN= u.getPctFemale();
				if(uniN< pctFemaleMin )
				{
					includeUni = false;
				}

			}
			if(pctFemaleMax!=-1.0) {
				double uniN= u.getPctFemale();
				if(uniN> pctFemaleMax )
				{
					includeUni = false;
				}

			}

			if(satVerbalMin!=-1.0) {
				double uniN= u.getSatVerbal();
				if(uniN < satVerbalMin)
				{
					includeUni = false;
				}

			}
			
			if(satVerbalMax!=-1.0) {
				double uniN= u.getSatVerbal();
				if(uniN > satVerbalMax)
				{
					includeUni = false;
				}

			}
			
			

			if(satMathMin!=-1) {
				double uniN= u.getSatMath();
				if(uniN < satMathMin)
				{
					includeUni = false;
				}

			}
			
			if(satMathMax!=-1) {
				double uniN= u.getSatMath();
				if(uniN > satMathMax)
				{
					includeUni = false;
				}

			}

			if(expensesMin!=-1.0) {
				double uniN= u.getExpenses();
				if(uniN < expensesMin)
				{
					includeUni = false;
				}

			}
			
			if(expensesMax!=-1.0) {
				double uniN= u.getExpenses();
				if(uniN > expensesMax)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("expenses: " + includeUni);
			}

			if(pctFinancialAidMin!=-1.0) {
				double uniN= u.getPctFinancialAid();
				if(uniN < pctFinancialAidMin)
				{
					includeUni = false;
				}

			}
			
			if(pctFinancialAidMax!=-1.0) {
				double uniN= u.getPctFinancialAid();
				if(uniN > pctFinancialAidMax)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("pctFinancialAid: " + pctFinancialAid + includeUni);
				System.out.println("expected pctFinancialAid: " + u.getPctFinancialAid());
			}

			if(numberOfApplicants!=-1) {
				int uniN= u.getNumberOfApplicants();
				if(uniN !=numberOfApplicants)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("numberOfApplicants: " + u.getNumberOfApplicants() + includeUni);
			}


		/**	if(pctAdmitted!=-1.0) {
				double uniN= u.getPctAdmitted();
				if(uniN !=pctAdmitted)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("numberOfApplicants: " + u.getNumberOfApplicants() + includeUni);
			}


			if(pctEnrolled!=-1.0) {
				double uniN= u.getPctEnrolled();
				if(uniN !=pctEnrolled)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("numberOfApplicants: " + u.getNumberOfApplicants() + includeUni);
			}

			if(AcademicScale!=-1) {
				int uniN= u.getAcademicScale();
				if(uniN !=AcademicScale)
				{
					includeUni = false;
				}

			}
			if (u.getName().equals("Carli")) {
				System.out.println("numberOfApplicants: " + u.getNumberOfApplicants() + includeUni);
			}

			if(socialScale!=-1) {
				int uniN= u.getSocialScale();
				if(uniN !=socialScale)
				{
					includeUni = false;
					***/

			if(includeUni) {
				searchResult.add(u);
			}
			if (u.getName().equals("Carli")) {
				System.out.println("n: "  + includeUni);
			}


		}
		return searchResult;
	}
}


