package project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentHomeTest {
	private StudentHome sh;

	@Before
	public void setUp() {
		sh = new StudentHome("ardentdeve","ardentdeve","ajjw4");
	}

	@Test
	public void testLoginPasses() {
		assertNotNull(sh.login("nicoleK", "Ash1234"));
	}

	@Test
	public void testLoginFails() {
		assertNull(sh.login("nicole1K", "Ash1234"));
	}

	@Test
	public void findByUserNamePasses()
	{
		assertNotNull(sh.findByUsername("nicoleK"));
	}
	@Test
	public void findByUserNameFailsForWrongUser()
	{
		assertNull(sh.findByUsername("nicol1"));
	}
	@Test
	public void removeUniversityPasses()
	{
		Student student = new Student("Al","Jacob","AlJ","aj233",'a');
		sh.addStudent(student);
		sh.saveUniversity(student,"APPLE TECHNOLOGY");
		assertEquals(1, sh.removeUniversity(student,"APPLE TECHNOLOGY"));
		sh.deleteStudent(student);  
	}

	@Test 
	public void removeUniversityFailsForSavedList()
	{
		Student student = new Student("Al","Jacob","AlJ","aj233",'a');
		sh.addStudent(student);
		assertEquals(0, sh.removeUniversity(student,"APPLE TECHNOLOGY"));
		sh.deleteStudent(student);
	}
	@Test
	public void editStudentProfilePasses()
	{	
		Student student = sh.login("nicoleK", "Ash1234");
		assertEquals(1, sh.editProfile("NicoleSwag7", "Nneji", "Ash1234"));
		sh.editProfile("Nicole", "Nneji", "Ash1234");
		sh.logoff();
	}
	@Test(expected =IllegalArgumentException.class)
	public void editProfileFailsForInvalidUserInfo()
	{
		Student student = sh.login("nicoleK123", "Ash1234");
		sh.editProfile("Nicole", "Nneji", "Ash1234");	
	}
	@Test
	public void getSavedUniversityPasses()
	{
		Student student = sh.login("ash5star", "ash1234");
		sh.saveUniversity(student, "ADELPHI");
		assertNotNull(sh.getSavedUniversity());
		sh.removeUniversity(student,"ADELPHI");
		sh.logoff();

	}
	@Test(expected = IllegalArgumentException.class)
	public void getSavedUniversityFailsForInvalidUser()
	{
		Student student = sh.login("ni1oleK1", "Ash1234");
		sh.getSavedUniversity();
		sh.logoff();
	}

	@Test
	public void testisUserStudent()
	{
		assertEquals(true,sh.isUserStudent("nicoleK"));
	}

	@Test
	public void testisUserStudentFails()
	{
		assertEquals(false,sh.isUserStudent("nicoleK1"));
	}







}
