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
	public void deactivateUser(){
		assertEquals(1, ah.DeactivateUser("nicoleK"));
		assertTrue(sh.findByUsername("nicoleK").getStatus()=='N');
		
		assertEquals(1, ah.DeactivateUser("Rahal"));
		assertTrue(ah.findAdmin("Rahal").getStatus()=='N');
	}
	
	@Test
	public void activateUser(){
		assertEquals(1, ah.ActivateUser("nicoleK"));
		assertTrue(sh.findByUsername("nicoleK").getStatus()=='Y');
		
		assertEquals(1, ah.ActivateUser("Rahal"));
		assertTrue(ah.findAdmin("Rahal").getStatus()=='Y');
	}
	
	@Test
	public void addStudent(){
		Student student = new Student("Andrew1", "Wiggins", "AW2", "watzpoppin", 'u', 'Y');
		assertEquals(1, ah.addStudent(student));
		assertNotNull(sh.findByUsername("AW221"));
		
		//Student newStudent = sh.findByUsername("AW22");
		//assertEquals(student,newStudent);
		
	}
}
