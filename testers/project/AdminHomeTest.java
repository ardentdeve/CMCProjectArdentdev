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
		assertEquals(1, ah.DeactivateUser("nicoleK"));
		assertTrue(sh.findByUsername("nicoleK").getStatus()=='N');
		
		assertEquals(1, ah.DeactivateUser("Rahal"));
		assertTrue(ah.findAdmin("Rahal").getStatus()=='N');
	}
	
	@Test
	public void testActivateUser(){
		assertEquals(1, ah.ActivateUser("nicoleK"));
		assertTrue(sh.findByUsername("nicoleK").getStatus()=='Y');
		
		assertEquals(1, ah.ActivateUser("Rahal"));
		assertTrue(ah.findAdmin("Rahal").getStatus()=='Y');
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
		
	}
	
	@Test
	public void testAddAdmin(){
		
	}
	
	@Test
	public void testEditAdmin(){
		
	}
	
	@Test
	public void testIsUserAdmin(){
		
	}
	
	@Test
	public void testIsUserStudent(){
		
	}
}
