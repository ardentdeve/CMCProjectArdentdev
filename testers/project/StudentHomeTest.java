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
	public void removeUniversityFailsForEmptySavedList()
	{
		Student student = new Student("Al","Jacob","AlJ","aj233",'a');
		sh.addStudent(student);
	   assertEquals(0, sh.removeUniversity(student,"APPLE TECHNOLOGY"));
	    sh.deleteStudent(student);
	}
	

	
	
}
