/*
 * File: StudentUITest
 */
package project;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

/**
 * @author ArdentDevelopers
 *
 */
public class StudentUITest {
	private Student student2;
	private StudentUI studentH2;
	private ArrayList<Student>allStudents2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		student2 = new Student();
		studentH2 = new StudentUI("ardentdeve","ardentdeve","ajjw4");
		allStudents2 = new ArrayList<Student>();
	}
	
	@Test
	public void testlogOn() {
		assertEquals(true,studentH2.logOn("nicoleK", "Ash1234"));
	}
	
	@Test
	public void testisLoggedOn() {
		studentH2.logOn("nicoleK", "Ash1234");
		assertEquals(true,studentH2.isLoggedOn());
	}
	
	@Test
	public void testgetSavedUniversity() {
		studentH2.logOn("nicoleK", "Ash1234");
		assertNotNull(studentH2.getSavedUniversity());
	}
	
	@Test
	public void testlogOff() {
		studentH2.logOn("nicoleK", "Ash1234");
		studentH2.logOff();
		assertEquals(false, studentH2.isLoggedOn());

	}
}