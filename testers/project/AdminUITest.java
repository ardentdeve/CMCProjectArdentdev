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
		Student student = new Student("Jacob", "Hinnenkamp", "jacob6", "hello", 'u', 'Y');
		assertEquals(1, aui.addStudent(student));
		sh.deleteStudent(student);
	}
	
	@Test
	public void testAddAdmin(){
		aui.logOn("Rahal", "Imad");
		Admin admin = new Admin("Jacob", "Hinnenkamp", "jacob6", "hello", 'a', 'Y');
		assertEquals(1, aui.addAdmin(admin));
		ah.deleteAdmin(admin);
	}
	
	@Test
	public void testDeactivateUser(){
		aui.logOn("Rahal", "Imad");
		Student student = new Student("Andrew1", "Wiggins", "Apple21", "watzpoppin", 'u', 'Y');
		aui.addStudent(student);
		assertEquals(1, aui.deactivateUser(student));
		sh.deleteStudent(student);
	}
	
	@Test
	public void testAddUniversity(){
		aui.logOn("Rahal", "Imad");
		university = new University("Swag U2", "Albaman", "City", "PRIVATE", 
				5000,50.0,800,700,800,24000.0,50,1000.5,25.0,70,4,4,"4");
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
		Student student = new Student("Jacob", "Hinnenkamp", "jacob4", "hello", 'a', 'Y');
		sh.addStudent(student);
		assertEquals(1,ah.editStudent("jacob4", "Jacob", "Hinnenkamp", "goodbye", 'a', 'Y'));
		sh.deleteStudent(student);
	}

	@Test
	public void testEditAdmin(){
		aui.logOn("Rahal", "Imad");
		Admin admin = new Admin("Jacob", "Hinnenkamp", "jacob4", "hello", 'a', 'Y');
		aui.addAdmin(admin);
		assertEquals(1,ah.editAdmin("jacob4", "Jacob", "Hinnenkamp", "goodbye", 'a', 'Y'));
		ah.deleteAdmin(admin);
	}
	
	@Test
	public void testEditUniversities(){
		aui.logOn("Rahal", "Imad");
		university = new University("Swag University", "Albaman", "City", "PRIVATE", 
				5000,50.0,800,700,800,24000.0,50,1000.5,25.0,70,4,4,"4");
		aui.addUniversity(university);
		assertEquals(1, aui.editUniversities("Swag University", "Alabama", "Rural", "PRIVATE", 
				4000,50.0,800,700,800,24000.0,50,1000.5,25.0,70,4,4));
		uh.deleteUniversities(university);
	}

}
