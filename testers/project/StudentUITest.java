package project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentUITest {
	
	private StudentUI sui;
	private AdminUI aui;
	private Student student;
	private StudentHome sh;
	private UniversityHome uh;
	private University university;

	
	@Before
	public void setUp(){
		student = new Student();
		sui = new StudentUI("ardentdeve", "ardentdeve", "ajjw4");
		aui = new AdminUI("ardentdeve", "ardentdeve", "ajjw4");
		student = new Student("firstName", "lastName", "username1", "password", 'u', 'Y');
		sh = new StudentHome("ardentdeve","ardentdeve","ajjw4");
		uh = new UniversityHome("ardentdeve","ardentdeve","ajjw4");
		university = new University("name1", "state", "location", "control", 1000, 50.0, 900, 900, 12000, 80.0, 2000,
				70.0, 60.0, 4, 3, 5, "Math");
	}
	
	@Test
	public void testIsLoggedOnPass() {
		sui.logOn("AW2", "watzpoppin");
		assertEquals(true, sui.isLoggedOn());
	}
	
	@Test
	public void testIsLoggedOnFail() {
		sui.logOn("AW2", "watzpopping");
		assertEquals(false, sui.isLoggedOn());
	}
	
	@Test
	public void testLogOnPass() {
		assertNotNull(sui.logOn("AW2", "watzpoppin"));
	}
	
	@Test
	public void testLogOnFail() {
		assertEquals(false, sui.logOn("AW2", "watzpopping"));
	}
	
	@Test
	public void testLogOffPass(){
		sui.logOn("AW2", "watzpoppin");
		sui.logOff();
		assertEquals(false, sui.isLoggedOn());
	}

	@Test
	public void testgetSavedUniversity(){
		sui.logOn("AW2", "watzpoppin");
		assertNotNull(student.getSavedUniversity());
	}
	
	@Test
	public void testsaveUni(){
		sui.logOn("AW2", "watzpoppin");
		aui.addUniversity(university);
		assertEquals(1, sui.saveUni(university.getName()));
		uh.deleteUniversities(university);

	}
	
	

}