package project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdminUITest {
	
	private AdminUI aui;
	private Admin admin;
	private Student student;
	private StudentHome sh;
	private AdminHome ah;
	private UniversityHome uh;
	private University university;

	
	@Before
	public void setUp(){
		admin = new Admin();
		aui = new AdminUI("ardentdeve", "ardentdeve", "ajjw4");
		student = new Student("firstName", "lastName", "username1", "password", 'u', 'Y');
		ah = new AdminHome("ardentdeve","ardentdeve","ajjw4");
		sh = new StudentHome("ardentdeve","ardentdeve","ajjw4");
		uh = new UniversityHome("ardentdeve","ardentdeve","ajjw4");
		university = new University("name", "state", "location", "control", 1000, 50.0, 900, 900, 12000, 80.0, 2000,
				70.0, 60.0, 4, 3, 5, "Math");
	}
	
	@Test
	public void testIsLoggedOnPass() {
		aui.logOn("Rahal", "Imad");
		assertEquals(true, aui.isLoggedOn());
	}
	
	@Test
	public void testIsLoggedOnFail() {
		aui.logOn("Rahal", "Imad1");
		assertEquals(false, aui.isLoggedOn());
	}
	
	@Test
	public void testLogOnPass() {
		assertNotNull(aui.logOn("Rahal", "Imad"));
	}
	
	@Test
	public void testLogOnFail() {
		assertEquals(false, aui.logOn("Rahal", "Imad1"));
	}
	
	@Test
	public void testLogOffPass(){
		aui.logOn("Rahal", "Imad");
		aui.logOff();
		assertEquals(true, aui.isLoggedOn());
	}

	@Test
	public void testAddStudent(){
		aui.logOn("Rahal", "Imad");
		assertEquals(1, aui.addStudent(student));
		sh.deleteStudent(student);
	}
	
	@Test
	public void testAddAdmin(){
		aui.logOn("Rahal", "Imad");
		assertEquals(1, aui.addAdmin(admin));
		ah.deleteAdmin(admin);
	}
	
	@Test
	public void testDeactivateUser(){
		aui.logOn("Rahal", "Imad");
		assertEquals(1, aui.deactivateUser("nicoleK"));
		ah.ActivateUser("nicoleK");
	}
	
	@Test
	public void testAddUniversity(){
		aui.logOn("Rahal", "Imad");
		assertEquals(1, aui.addUniversity(university));
		uh.deleteUniversities(university);
	}
	
	@Test
	public void testGetAdmins(){
		aui.logOn("Rahal", "Imad");
		assertNotNull(aui.getAdmins());
	}
	
	@Test
	public void testGetAdminsFail(){
		aui.logOn("Rahal", "Imad1");
		assertNull(aui.getAdmins());
	}

	@Test
	public void testGetStudents(){
		aui.logOn("Rahal", "Imad");
		assertNotNull(aui.getStudents());
	}
	
	@Test
	public void testGetStudentsFail(){
		aui.logOn("Rahal", "Imad1");
		assertNull(aui.getStudents());
	}
	
	@Test
	public void testGetUniversities(){
		aui.logOn("Rahal", "Imad");
		assertNotNull(aui.getUniversities());
	}
	
	@Test
	public void testGetUniversitiesFail(){
		aui.logOn("Rahal", "Imad1");
		assertNull(aui.getUniversities());
	}
	
	@Test
	public void testEditStudent(){
		aui.logOn("Rahal", "Imad");
		aui.addStudent(student);
		assertEquals(1, aui.editStudent(student));
		sh.deleteStudent(student);
	}

	@Test
	public void testEditAdmin(){
		aui.logOn("Rahal", "Imad");
		aui.addAdmin(admin);
		assertEquals(1, aui.editAdmin(admin));
		ah.deleteAdmin(admin);
	}
	
	@Test
	public void testEditUniversities(){
		aui.logOn("Rahal", "Imad");
		aui.addUniversity(university);
		assertEquals(1, aui.editUniversities(university));
		uh.deleteUniversities(university);
	}

}
