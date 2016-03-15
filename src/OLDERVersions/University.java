package project;

import java.util.*;


public class University {
	//instance variables

	/** The name of the University*/
	private String name;
	/** The state the University is in */
	private String state;
	/** The location the University resides in (i.e. urban, suburban)*/
	private String location;
	/** The control on the University (i.e. private, public)*/
	private String control;
	/** The number of Students enrolled at the University */
	private int numberStudents;
	/** The percentage of students enrolled that are female */
	private double pctFemale;
	/** The average SAT verbal score for enrolled students */
	private int satVerbal;
	/** The average SAT math score for enrolled students*/
	private int satMath;
	/** The value of annual expenses or tuition to attend the University*/
	private double expenses;
	/** The percent of enrolled students receiving financial aid */
	private double pctFinancialAid;
	/** The total number of applicants that apply to the school annually */
	private int numberOfApplicants;
	/** The percent of applicants that get admitted */
	private double pctAdmitted;
	/** The percent of applicants that decide to enroll */
	private double pctEnrolled;
	/** An integer value between 1 and 5 indicating the academic scale of the school */
	private int academicScale;
	/** An integer value between 1 and 5 indicating the social life at the school */
	private int socialScale;
	/** An integer value between 1 and 5 indicating the quality of life at the school */
	private int qualityOfLifeScale;
	/** A list of up to five areas of study in which the schoole excels */
	private ArrayList<String> specialties;


	/**
	 * Constructor
	 * 
	 * @param 	name name to set
	 * 		  	state state to set
	 * 		  	location location to set
	 * 			control the control to set
	 * 			numStudents the numberStudents to set
	 * 			pf the percentFemale to set
	 * 			vSAT the satVerbal value to set
	 * 			mSAT the satMath value to set
	 * 			expenses the expenses value to set
	 * 			pfa the pctFinancialAid value to set
	 * 			applicants the numberOfApplicants value to set
	 * 			pa the pctAdmitted value to set
	 * 			pe the pctAdmitted value to set
	 * 			aScale the academicScale to set
	 * 			sScale the socialScale to set
	 * 			lScale the the qualityOfLifeScale to set
	 * 			e the specialties value to set
	 */
	public University(String name, String state, String location, String control,
			int numStudents, double pf, int vSAT, int mSAT,
			double expenses, double pfa, int applicants, double pa,
			double pe, int aScale, int sScale, int lScale, ArrayList<String> e){
		this.name = name;
		this.state = state;
		this.location = location;
		this.control = control;
		this.numberStudents = numStudents;
		this.pctFemale = pf;
		this.satVerbal = vSAT;
		this.satMath = mSAT;
		this.expenses = expenses;
		this.pctFinancialAid = pfa;
		this.numberOfApplicants = applicants;
		this.pctAdmitted = pa;
		this.pctEnrolled = pe;
		this.academicScale = aScale;
		this.socialScale = sScale;
		this.qualityOfLifeScale = lScale;
		this.specialties = e;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @param control the control to set
	 */
	public void setControl(String control) {
		this.control = control;
	}
	/**
	 * @param numberStudents the numberStudents to set
	 */
	public void setNumberStudents(int numberStudents) {
		this.numberStudents = numberStudents;
	}
	/**
	 * @param pctFemale the pctFemale to set
	 */
	public void setPctFemale(double pctFemale) {
		this.pctFemale = pctFemale;
	}
	/**
	 * @param satVerbal the satVerbal to set
	 */
	public void setSatVerbal(int satVerbal) {
		this.satVerbal = satVerbal;
	}
	/**
	 * @param satMath the satMath to set
	 */
	public void setSatMath(int satMath) {
		this.satMath = satMath;
	}
	/**
	 * @param expenses the expenses to set
	 */
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	/**
	 * @param pctFinancialAid the pctFinancialAid to set
	 */
	public void setPctFinancialAid(double pctFinancialAid) {
		this.pctFinancialAid = pctFinancialAid;
	}
	/**
	 * @param numberOfApplicants the numberOfApplicants to set
	 */
	public void setNumberOfApplicants(int numberOfApplicants) {
		this.numberOfApplicants = numberOfApplicants;
	}
	/**
	 * @param pctAdmitted the pctAdmitted to set
	 */
	public void setPctAdmitted(double pctAdmitted) {
		this.pctAdmitted = pctAdmitted;
	}
	/**
	 * @param pctEnrolled the pctEnrolled to set
	 */
	public void setPctEnrolled(double pctEnrolled) {
		this.pctEnrolled = pctEnrolled;
	}
	/**
	 * @param academicScale the academicScale to set
	 */
	public void setAcademicScale(int academicScale) {
		this.academicScale = academicScale;
	}
	/**
	 * @param socialScale the socialScale to set
	 */
	public void setSocialScale(int socialScale) {
		this.socialScale = socialScale;
	}
	/**
	 * @param qualityOfLifeScale the qualityOfLifeScale to set
	 */
	public void setQualityOfLifeScale(int qualityOfLifeScale) {
		this.qualityOfLifeScale = qualityOfLifeScale;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @return the control
	 */
	public String getControl() {
		return control;
	}
	/**
	 * @return the numberStudents
	 */
	public int getNumberStudents() {
		return numberStudents;
	}
	/**
	 * @return the pctFemale
	 */
	public double getPctFemale() {
		return pctFemale;
	}
	/**
	 * @return the satVerbal
	 */
	public int getSatVerbal() {
		return satVerbal;
	}
	/**
	 * @return the satMath
	 */
	public int getSatMath() {
		return satMath;
	}
	/**
	 * @return the expenses
	 */
	public int getExpenses() {
		return expenses;
	}
	/**
	 * @return the pctFinancialAid
	 */
	public double getPctFinancialAid() {
		return pctFinancialAid;
	}
	/**
	 * @return the numberOfApplicants
	 */
	public int getNumberOfApplicants() {
		return numberOfApplicants;
	}
	/**
	 * @return the pctAdmitted
	 */
	public double getPctAdmitted() {
		return pctAdmitted;
	}
	/**
	 * @return the pctEnrolled
	 */
	public double getPctEnrolled() {
		return pctEnrolled;
	}
	/**
	 * @return the academicScale
	 */
	public int getAcademicScale() {
		return academicScale;
	}
	/**
	 * @return the socialScale
	 */
	public int getSocialScale() {
		return socialScale;
	}
	/**
	 * @return the qualityOfLifeScale
	 */
	public int getQualityOfLifeScale() {
		return qualityOfLifeScale;
	}
	//SPECIALTIES
	/**
	 * @return the specialties
	 */
	public ArrayList<String> getEmphasis() {
		return specialties;
	}
	/**
	 * @param specialties the specialties to set
	 */
	public void setEmphasises(ArrayList<String> specialties) {
		this.specialties = specialties;
	}

	/**
	 * adds the specified String to the list of specialties
	 * 
	 * @param e the emphasis to be added
	 */
	public void addEmphasis(String e) {
		if(specialties.size() < 5)
			specialties.add(e);
		else
			System.out.println("There are already five specialities for this University");
	}

	/**
	 * toString method describing the school
	 * 
	 * @return String representation of the name of the universtiy and the state it is in
	 */
	public String toString(){
		return s + "Name: "+ schoolName + " State: " + state;
	}	

}
