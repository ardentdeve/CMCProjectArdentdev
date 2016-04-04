package project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdminHomeTest {
	private AdminHome ah;
	private StudentHome sh;

	@Before
	public void setUp() {
		ah = new AdminHome("ardentdeve","ardentdeve","ajjw4");
		sh = new StudentHome("ardentdeve","ardentdeve","ajjw4");
	}

	@Test
	public void testLoginPasses() {
		assertNotNull(ah.login("Rahal", "Imad"));
	}

	@Test
	public void testLoginFails(){
		assertNull(ah.login("Rahall", "Imad"));
	}

	@Test
	public void testFindAdminPasses(){
		assertNotNull(ah.findAdmin("Rahal"));
	}
	
	@Test
	public void testFindAdminFails(){
		assertNull(ah.findAdmin("Rahall"));
	}
	
	@Test
	public void testDeactivateUser(){
		Student student = new Student("Andrew1", "Wiggins", "Apple21", "watzpoppin", 'u', 'Y');
		ah.addStudent(student);
		assertEquals(1, ah.deactivateUser(student));
	}
	
	@Test
	public void testActivateUser(){
		Student student = new Student("Andrew1", "Wiggins", "Apple21", "watzpoppin", 'u', 'N');
		assertEquals(1, ah.activateUser(student));
	}
	
	@Test
	public void testAddStudent(){
		Student student = new Student("Andrew1", "Wiggins", "hello12", "watzpoppin", 'u', 'Y');
		assertEquals(1, ah.addStudent(student));
		Student newStudent = sh.findByUsername("hello12");
		assertEquals(student.getUsername(), newStudent.getUsername());
		sh.deleteStudent(student);
	}
	
	@Test
	public void testEditStudent(){
		Student student = new Student("Jacob", "Hinnenkamp", "jacob4", "hello", 'a', 'Y');
		sh.addStudent(student);
		assertEquals(1,ah.editStudent("jacob4", "Jacob", "Hinnenkamp", "goodbye", 'a', 'Y'));
		sh.deleteStudent(student);
	}
	
	@Test
	public void testAddAdmin(){
		Admin admin = new Admin("Jacob", "Hinnenkamp", "jacob4", "hello", 'a', 'Y');
		assertEquals(1, ah.addAdmin(admin));
		Admin newAdmin = ah.findAdmin("jacob4");
		assertEquals(admin.getUsername(), newAdmin.getUsername());
		ah.deleteAdmin(admin);
	}
	
	@Test
	public void testEditAdmin(){
		Admin admin = new Admin("Jacob", "Hinnenkamp", "jacob4", "hello", 'a', 'Y');
		ah.addAdmin(admin);
		assertEquals(1,ah.editAdmin("jacob4", "Jacob", "Hinnenkamp", "goodbye", 'a', 'Y'));
		ah.deleteAdmin(admin);
	}
	
	@Test
	public void testIsUserAdmin(){
		assertEquals(true, ah.isUserAdmin("Rahal"));
	}
	
	@Test
	public void testIsUserAdminFails(){
		assertEquals(false, ah.isUserAdmin("Rahal1"));
	}
	
	@Test
	public void testIsUserStudent(){
		assertEquals(true, ah.isUserStudent("nicoleK"));
	}
	
	@Test
	public void testIsUserStudentFails(){
		assertEquals(false, ah.isUserStudent("nicoleK1"));
	}
}
