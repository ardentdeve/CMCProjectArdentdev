/*
 * File: University.java
 */

package project;

import java.util.*;

/**
 * A class representing a university in the CMC system.
 * 
 * @author Ardent Developers
 * @version March, 2016
 */
public class University {

	/** the name of the University*/
	private String name;
	/** the state the University is in*/
	private String state;
	/** the location of the University, i.e. urban, suburban*/
	private String location;
	/** the control on the University, i.e. private, public*/
	private String control;
	/** the number of students attending the University*/
	private int numberStudents;
	/** the percent of students that are female*/
	private double pctFemale;
	/** the average SAT verbal score*/
	private int satVerbal;
	/** the average SAT math score*/
	private int satMath;
	/** the average expenses in a typical year for a student*/
	private int expenses;
	/** the percent of students receiving financial aid*/
	private double pctFinancialAid;
	/** the number of applicants per year*/
	private int numberOfApplicants;
	/** the percent of students admitted of the applicants*/
	private double pctAdmitted;
	/** the percent of admitted students that end up enrolling*/
	private double pctEnrolled;
	/** a 1 to 5 scale of academic quality of the University*/
	private int academicScale;
	/** a 1 to 5 scale of social life quality of the University*/
	private int socialScale;
	/** a 1 to 5 scale of quality of life of the University*/
	private int qualityOfLifeScale;
	/** a list of emphases that the college is admired for*/
	private String emphases;
	/** a list of Universities with similar qualities*/
	private List<University> similarUniversities;

	/**
	 * Constructor
	 * 
	 * @param name the name to set
	 * @param state the state to set
	 * @param location the location to set
	 * @param numberStudents the numberStudents to set
	 * @param pctFemale the pctFemale to set
	 * @param satVerbal the satVerbal to set
	 * @param satMath the satMath to set
	 * @param expenses the expenses to set
	 * @param pctFinancialAid the pctFinancialAid to set
	 * @param numberOfApplicants the numberOfApplicants to set
	 * @param pctAdmitted the pctAdmitted to set
	 * @param pctEnrolled the pctEnrolled to set
	 * @param academicScale the academicScale to set
	 * @param socialScale the socialScale to set
	 * @param qualityOfLifeScale the qualityOfLifeScale to set
	 * @param control the control to set
	 * @param emphases the emphases to set
	 * @param similarUniversities the similarUniversities to set
	 */
	public University(String name, String state, String location, String control ,int numberStudents, double pctFemale,
			int satVerbal, int satMath, int expenses, double pctFinancialAid, int numberOfApplicants,
			double pctAdmitted, double pctEnrolled, int academicScale, int socialScale, int qualityOfLifeScale, String emphases) {
		super();
		this.name = name;
		this.state = state;
		this.location = location;
		this.control = control;
		this.numberStudents = numberStudents;
		this.pctFemale = pctFemale;
		this.satVerbal = satVerbal;
		this.satMath = satMath;
		this.expenses = expenses;
		this.pctFinancialAid = pctFinancialAid;
		this.numberOfApplicants = numberOfApplicants;
		this.pctAdmitted = pctAdmitted;
		this.pctEnrolled = pctEnrolled;
		this.academicScale = academicScale;
		this.socialScale = socialScale;
		this.qualityOfLifeScale = qualityOfLifeScale;
		this.emphases = emphases;
	}

	/**
	 * set the name to the specified value
	 * 
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * sets the state to the specified value
	 * 
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	
	/**
	 * sets the location to the specified value
	 * 
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	/**
	 * sets the control to the specified value
	 * 
	 * @param control the control to set
	 */
	public void setControl(String control) {
		this.control = control;
	}
	
	/**
	 * sets the numberStudents to the specified value
	 * 
	 * @param numberStudents the numberStudents to set
	 */
	public void setNumberStudents(int numberStudents) {
		this.numberStudents = numberStudents;
	}
	
	/**
	 * sets the pctFemale to the specified value
	 * 
	 * @param pctFemale the pctFemale to set
	 */
	public void setPctFemale(double pctFemale) {
		this.pctFemale = pctFemale;
	}
	
	/**
	 * sets the setDatVerbal to the specified value
	 * 
	 * @param satVerbal the satVerbal to set
	 */
	public void setSatVerbal(int satVerbal) {
		this.satVerbal = satVerbal;
	}
	
	/**
	 * sets the satMath to the specified value
	 * 
	 * @param satMath the satMath to set
	 */
	public void setSatMath(int satMath) {
		this.satMath = satMath;
	}
	
	/**
	 * sets the expenses to the specified value
	 * 
	 * @param expenses the expenses to set
	 */
	public void setExpenses(int expenses) {
		this.expenses = expenses;
	}
	
	/**
	 * sets the pctFinancialAid to the specified value
	 * 
	 * @param pctFinancialAid the pctFinancialAid to set
	 */
	public void setPctFinancialAid(double pctFinancialAid) {
		this.pctFinancialAid = pctFinancialAid;
	}
	
	/**
	 * sets the numberOfApplicants to the specified value
	 * 
	 * @param numberOfApplicants the numberOfApplicants to set
	 */
	public void setNumberOfApplicants(int numberOfApplicants) {
		this.numberOfApplicants = numberOfApplicants;
	}
	
	/**
	 * sets the pctAdmitted to the specified value
	 * 
	 * @param pctAdmitted the pctAdmitted to set
	 */
	public void setPctAdmitted(double pctAdmitted) {
		this.pctAdmitted = pctAdmitted;
	}
	
	/**
	 * sets the pctEnrolled to the specified value
	 * 
	 * @param pctEnrolled the pctEnrolled to set
	 */
	public void setPctEnrolled(double pctEnrolled) {
		this.pctEnrolled = pctEnrolled;
	}
	
	/**
	 * sets the academicScale to the specified value
	 * 
	 * @param academicScale the academicScale to set
	 */
	public void setAcademicScale(int academicScale) {
		this.academicScale = academicScale;
	}
	
	/**
	 * sets the socialScale to the specified value
	 * 
	 * @param socialScale the socialScale to set
	 */
	public void setSocialScale(int socialScale) {
		this.socialScale = socialScale;
	}
	
	/**
	 * sets the qualityOfLifeScale to the specified value
	 * 
	 * @param qualityOfLifeScale the qualityOfLifeScale to set
	 */
	public void setQualityOfLifeScale(int qualityOfLifeScale) {
		this.qualityOfLifeScale = qualityOfLifeScale;
	}
	
	/**
	 * sets the emphases to the specified value
	 * 
	 * @param emphases the emphases to set
	 */
	public void setEmphases(String emphases) {
		this.emphases = emphases;
	}
	
	/**
	 * sets the similarUniversities to the specified value
	 * 
	 * @param similarUniversities the similarUniversities to set
	 */
	public void setSimilarUniversities(List<University> similarUniversities) {
		this.similarUniversities = similarUniversities;
	}
	
	/**
	 * returns the name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * returns the state
	 * 
	 * @return the state
	 */
	public String getState() {
		return state;
	}
	
	/**
	 * returns the location
	 * 
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	
	/**
	 * returns the control
	 * 
	 * @return the control
	 */
	public String getControl() {
		return control;
	}
	
	/**
	 * returns the numberStudents
	 * 
	 * @return the numberStudents
	 */
	public int getNumberStudents() {
		return numberStudents;
	}
	
	/**
	 * returns the pctFemale
	 * 
	 * @return the pctFemale
	 */
	public double getPctFemale() {
		return pctFemale;
	}
	
	/**
	 * returns the satVerbal
	 * 
	 * @return the satVerbal
	 */
	public int getSatVerbal() {
		return satVerbal;
	}
	
	/**
	 * returns the satMath
	 * 
	 * @return the satMath
	 */
	public int getSatMath() {
		return satMath;
	}
	
	/**
	 * returns the expenses
	 * 
	 * @return the expenses
	 */
	public int getExpenses() {
		return expenses;
	}
	
	/**
	 * returns pctFinancialAid
	 * 
	 * @return the pctFinancialAid
	 */
	public double getPctFinancialAid() {
		return pctFinancialAid;
	}
	
	/**
	 * returns numberOfAplicants
	 * 
	 * @return the numberOfApplicants
	 */
	public int getNumberOfApplicants() {
		return numberOfApplicants;
	}
	
	/**
	 * returns pctAdmitted
	 * 
	 * @return the pctAdmitted
	 */
	public double getPctAdmitted() {
		return pctAdmitted;
	}
	
	/**
	 * returns pctEnrolled
	 * 
	 * @return the pctEnrolled
	 */
	public double getPctEnrolled() {
		return pctEnrolled;
	}
	
	/**
	 * returns academicScale
	 * 
	 * @return the academicScale
	 */
	public int getAcademicScale() {
		return academicScale;
	}
	
	/**
	 * returns socialScale
	 * 
	 * @return the socialScale
	 */
	public int getSocialScale() {
		return socialScale;
	}
	
	/**
	 * returns qualityOfLifeScale
	 * 
	 * @return the qualityOfLifeScale
	 */
	public int getQualityOfLifeScale() {
		return qualityOfLifeScale;
	}
	
	/**
	 * return emphases
	 * 
	 * @return the emphases
	 */
	public String getEmphases() {
		return emphases;
	}
	
	/**
	 * returns similarUniversities
	 * 
	 * @return the similarUniversities
	 */
	public List<University> getSimilarUniversities() {
		return similarUniversities;
	}

	/**
	 * returns a string description of this University
	 * 
	 * @return a string description of the university
	 */
	@Override
	public String toString() {
		return "University [name=" + name + ", state=" + state + ", location=" + location + ", control=" + control
				+ ", numberStudents=" + numberStudents + ", pctFemale=" + pctFemale + ", satVerbal=" + satVerbal
				+ ", satMath=" + satMath + ", expenses=" + expenses + ", pctFinancialAid=" + pctFinancialAid
				+ ", numberOfApplicants=" + numberOfApplicants + ", pctAdmitted=" + pctAdmitted + ", pctEnrolled="
				+ pctEnrolled + ", academicScale=" + academicScale + ", socialScale=" + socialScale
				+ ", qualityOfLifeScale=" + qualityOfLifeScale + ", emphases=" + emphases + ", similarUniversities="
				+ similarUniversities + ", getName()=" + getName() + ", getState()=" + getState() + ", getLocation()="
				+ getLocation() + ", getControl()=" + getControl() + ", getNumberStudents()=" + getNumberStudents()
				+ ", getPctFemale()=" + getPctFemale() + ", getSatVerbal()=" + getSatVerbal() + ", getSatMath()="
				+ getSatMath() + ", getExpenses()=" + getExpenses() + ", getPctFinancialAid()=" + getPctFinancialAid()
				+ ", getNumberOfApplicants()=" + getNumberOfApplicants() + ", getPctAdmitted()=" + getPctAdmitted()
				+ ", getPctEnrolled()=" + getPctEnrolled() + ", getAcademicScale()=" + getAcademicScale()
				+ ", getSocialScale()=" + getSocialScale() + ", getQualityOfLifeScale()=" + getQualityOfLifeScale()
				+ ", getEmphases()=" + getEmphases() + ", getSimilarUniversities()=" + getSimilarUniversities() + "]";
	}
}
