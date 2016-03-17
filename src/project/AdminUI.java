package project;
public class AdminUI {

	private AdminHome adminHome;
	private StudentHome studentHome;
	private UniversityHome universityHome;
	private Admin user;

	/**
	 * Adds a user to the appropriate home with the information specified
	 * 
	 * @param	pass password of the User to set
	 * 			username username of the User to set
	 * 			first first name of the User to set
	 * 			last last name of the User to set
	 * 			type type of the User to set
	 * 			status status of the User to set
	 */
	public void addUser(String pass, String username, String first, String last, char type, char status){
		User u = new User(first, last, username, pass, type,status);
		if (type == 'U' || type == 'u')
			studentHome.addUser(u);
		else{
			adminHome.addUser(u);
	}
	}

	/**
	 * Deactivates the specified user by changing the Student's status
	 * 
	 * @param u the Student to deactivate
	 */
	public void deactivateUser(Student u){
		u.setStatus('N');
	}

	/**
	 * Edits the user by the username provided. Searches both the studentHome and adminHome for the User and 
	 * changes their characteristics to the provided information
	 * 
	 * @param	username the user name used to find the User in the homes
	 * 			firstName the first name of the User to set
	 * 			lastName the last name of the User to set
	 * 			password the password of the User to set
	 * 			type the type of the User to set
	 * 			status the status of the User to set
	 */
	public void editUser(User username, String firstName, String lastName, String password, char type, char status){
		User u = studentHome.findUser(username);
		if (u == null)
			u = adminHome.findUser(username);
		if (u == null)
			throw new IllegalArgumentException("(AdminUI.editUser)No user of that username was found.");
		u.setPassword(password);
		u.setFirstName(firstName);
		u.setLastName(lastName);
		u.setType(type);
		u.setStatus(status);
	}

	/**
	 * Adds a university to the university home, initializing the University information to the specified
	 * 
	 * @param	name the name of the University
	 * 			state the state the University is it
	 * 			location the location of the University
	 * 			numStudents the number of students enrolled
	 * 			pf the percent of enrolled students that are female
	 * 			vSAT the average SAT verbal score
	 * 			mSAT the average SAT math score
	 * 			expenses annual cost of tuition or other expenses
	 * 			pfa percent receiving financial aid
	 * 			applicants number of applicants
	 * 			pa percent admitted
	 *			pe percent enrolled
	 *			aScale academic scale
	 *			sScale social scale
	 *			lScale quality of life scale
	 *			control the control on the University
	 *			e the list of emphases
	 */
	public void addUniversity(String name, String state, String location, String control,
			int numStudents, double pf, int vSAT, int mSAT, double expenses, double pfa, int applicants, 
			double pa, double pe, int aScale, int sScale, int lScale, ArrayList<String> e){
		University uni = new University(name, state, location, control, numStudents, pf, vSAT, mSAT, expenses,
				pfa, applicants, pa, pe, aScale, sScale, lScale, e);
		universityHome.addUniversity(uni);
	}

	/**
	 * Edits information of a University using the information specified
	 * 
	 * @param	name the name of the University
	 * 			state the state the University is it
	 * 			location the location of the University
	 * 			numStudents the number of students enrolled
	 * 			pf the percent of enrolled students that are female
	 * 			vSAT the average SAT verbal score
	 * 			mSAT the average SAT math score
	 * 			expenses annual cost of tuition or other expenses
	 * 			pfa percent receiving financial aid
	 * 			applicants number of applicants
	 * 			pa percent admitted
	 *			pe percent enrolled
	 *			aScale academic scale
	 *			sScale social scale
	 *			lScale quality of life scale
	 *			control the control on the University
	 *			e the list of emphases
	 */
	public void editUniversities(String name, String state, String location, String control,
			int numStudents, double pf, int vSAT, int mSAT,double expenses, double pfa, int applicants, 
			double pa,double pe, int aScale, int sScale, int lScale, ArrayList<String> e) {
		University uni = UniversityHome.getUniversity(name);
		uni.setName(name);
		uni.setState(state);
		uni.setLocation(location);
		uni.setControl(control);
		uni.setNumOfEnrolled(numStudents);
		uni.setPctFemale(pf);
		uni.setSatVerbal(vSAT);
		uni.setSatMath(mSAT);
		uni.setExpenses(expenses);
		uni.setPctFinancailAid(pfa);
		uni.setNumberOfApplicants(applicants);
		uni.setPctAdmitted(pa);
		uni.setPctEnrolled(pe);
		uni.setAcademicScale(aScale);
		uni.setSocialScale(sScale);
		uni.setQualityOfLifeScale(lScale);
		uni.setEmphasises(e);
		data.removeUniversity(getName);
		adminHome.addUniversity(uni);
	}
}
