package project;

import java.util.*;

public class University {


	private String name;
	private String state;
	private String location;
	private String control;
	private int numberStudents;
	private double pctFemale;
	private int satVerbal;
	private int satMath;
	private int expenses;
	private double pctFinancialAid;
	private int numberOfApplicants;
	private double pctAdmitted;
	private double pctEnrolled;
	private int academicScale;
	private int socialScale;
	private int qualityOfLifeScale;
	private String emphases;
	private List<University> similarUniversities;
	
	
	/**
	 * @param name
	 * @param state
	 * @param location
	 * @param numberStudents
	 * @param pctFemale
	 * @param satVerbal
	 * @param satMath
	 * @param expenses
	 * @param pctFinancialAid
	 * @param numberOfApplicants
	 * @param pctAdmitted
	 * @param pctEnrolled
	 * @param academicScale
	 * @param socialScale
	 * @param qualityOfLifeScale
	 * @param control 
	 * @param emphases 
	 * @param similarUniversities 
	 */
	public University(String name, String state, String location, String control ,int numberStudents, double pctFemale,
			int satVerbal, int satMath, int expenses, double pctFinancialAid, int numberOfApplicants,
			double pctAdmitted, double pctEnrolled, int academicScale, int socialScale, int qualityOfLifeScale, String emphases, List<University> similarUniversities) {
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
		this.similarUniversities = similarUniversities;
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
	 * @param emphases the emphases to set
	 */
	public void setEmphases(String emphases) {
		this.emphases = emphases;
	}
	/**
	 * @param similarUniversities the similarUniversities to set
	 */
	public void setSimilarUniversities(List<University> similarUniversities) {
		this.similarUniversities = similarUniversities;
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
	/**
	 * @return the emphases
	 */
	public String getEmphases() {
		return emphases;
	}
	/**
	 * @return the similarUniversities
	 */
	public List<University> getSimilarUniversities() {
		return similarUniversities;
	}
	
	 /* (non-Javadoc)
	 * @see java.lang.Object#toString()
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
