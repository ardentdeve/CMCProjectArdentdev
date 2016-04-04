package project;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DBControllerTest {

	DBController dbl;
	University uni;
	Student student;

	@Before
	public void setUp() throws Exception {
		dbl = new DBController();
	}

	@Test
	public void testGetUniversities() {

	}

	@Test
	public void testAddUniversity() {
		uni = new University("Titleist University", "Albaman", "City", "PRIVATE", 
				5000,50.0,800,700,800,24000.0,50,1000.5,25.0,70,4,4,"4");
		assertEquals(1,dbl.addUniversity(uni));
		dbl.deleteUniversity(uni);
	}

	@Test
	public void testAddStudent() {
		student = new Student("Wes", "Dickhaus", "wesd1", "password1", 'u', 'Y');
		assertEquals(1, dbl.addStudent(student));
		dbl.deleteStudent("Wes");
	}

	@Test
	public void testEditUniversity(){

	}

	@Test
	public void testDeleteUniversity(){

	}

	@Test
	public void testGetStudents(){

	}

	@Test
	public void testGetSavedSchools(){

	}

	@Test
	public void testGetAdmins(){

	}

	@Test
	public void testRemoveSchool(){

	}

	@Test
	public void testSaveSchool(){

	}

	@Test
	public void testDeleteStudent(){

	}

	@Test
	public void testDeleteAdmin(){

	}

	@Test
	public void testAddUniversityEmphasis(){

	}

	@Test
	public void testAddAdmin(){

	}

	@Test
	public void testEditStudent(){

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

	@Test
	public void testRemoveUniversityEmphasis(){

	}

}





