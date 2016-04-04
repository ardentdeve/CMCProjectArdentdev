package project;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class DBControllerTest {

	DBController dbl;
	University uni;
	Student student;
	Admin admin;

	@Before
	public void setUp() throws Exception {
		dbl = new DBController();
		dbl.deleteStudent("wesd2");
		dbl.deleteStudent("wesd3");
		dbl.deleteStudent("wesd8");
		dbl.deleteStudent("wesd9");
		dbl.deleteAdmin("wesd2");
		dbl.deleteAdmin("wesd3");
		dbl.deleteAdmin("wesd8");
		dbl.deleteAdmin("wesd9");
		
	}

	@Test
	public void testGetUniversities() {
		assertEquals(195, dbl.getUniversities().size());
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
		student = new Student("Wes", "Dickhaus", "wesd5", "password1", 'u', 'Y');
		assertEquals(1, dbl.addStudent(student));
		dbl.deleteStudent("wesd5");
	}

	@Test
	public void testEditUniversity(){
		uni = new University("Swag University", "Albaman", "City", "PRIVATE", 
				5000,50.0,800,700,800,24000.0,50,1000.5,25.0,70,4,4,"4");
		dbl.addUniversity(uni);
		assertEquals(1, dbl.editUniversity("Swag University", "Alabama", "City", "State", 
				5000,50.0,800,700,800,24000.0,50,1000.5,25.0,70,4,4));
		dbl.deleteUniversity(uni);
	}

	@Test
	public void testDeleteUniversity(){
		uni = new University("Swag U", "Albaman", "City", "PRIVATE", 
				5000,50.0,800,700,800,24000.0,50,1000.5,25.0,70,4,4,"4");
		dbl.addUniversity(uni);
		assertEquals(1, dbl.deleteUniversity(uni));
	}

	@Test
	public void testGetStudents(){
		assertEquals(14,dbl.getStudents().size());
	}

	@Test
	public void testGetSavedSchools(){
		student = new Student("Wes", "Dickhaus", "wesd1", "password1", 'u', 'Y');
		dbl.saveSchool(student, "BUCKNELL");
		assertEquals(2,dbl.getSavedSchool("wesd1").size());
		dbl.removeSchool("wesd1", "BUCKNELL");
		dbl.deleteStudent("wesd1");
	}

	@Test
	public void testGetAdmins(){
		assertEquals(7,dbl.getAdmins().size());
	}

	@Test
	public void testRemoveSchool(){
		student = new Student("Wes", "Dickhaus", "wesd3", "password1", 'u', 'Y');
		dbl.addStudent(student);
		dbl.saveSchool(student, "BUTLER");
		assertEquals(1, dbl.removeSchool("wesd3", "BUTLER"));
		dbl.deleteStudent("wesd3");
	}

	@Test
	public void testSaveSchool(){
		student = new Student("Wes", "Dickhaus", "wesd3", "password1", 'u', 'Y');
		dbl.addStudent(student);
		assertEquals(1, dbl.saveSchool(student, "BUTLER"));
		dbl.removeSchool("wesd3", "BUTLER");
		dbl.deleteStudent("wesd3");
	}

	@Test
	public void testDeleteStudent(){
		student = new Student("Wes", "Dickhaus", "wesd3", "password1", 'u', 'Y');
		dbl.addStudent(student);
		assertEquals(1, dbl.deleteStudent("wesd3"));
	}

	@Test
	public void testDeleteAdmin(){
		admin = new Admin("Wes", "Dickhaus", "wesd4", "password1", 'a');
		dbl.addAdmin(admin);
		assertEquals(1, dbl.deleteAdmin("wesd4"));
	}

	@Test
	public void testAddUniversityEmphasis(){
		uni = new University("Swag University", "Albaman", "City", "PRIVATE", 
				5000,50.0,800,700,800,24000.0,50,1000.5,25.0,70,4,4,"4");
		dbl.addUniversity(uni);
		assertEquals(1, dbl.addUniversityEmphasis( uni, "Math"));
		dbl.deleteUniversity(uni);
	}

	@Test
	public void testAddAdmin(){
		admin = new Admin("Wes", "Dickhaus", "wesd5", "password1", 'a');
		assertEquals(1, dbl.addAdmin(admin));
		dbl.deleteAdmin("wesd5");
	}

	@Test
	public void testEditStudent(){
		student = new Student("Wes", "Dickhaus", "wesd8", "password1", 'u', 'Y');
		dbl.addStudent(student);
		assertEquals(1, dbl.editStudent("wesd8", "Wesley", "Dickhaus", "pass", 'u', 'Y'));
		dbl.deleteStudent("wesd8");
	}

	@Test
	public void testEditAdmin(){
		admin = new Admin("Wes", "Dickhaus", "wesd3", "password1", 'a', 'Y');
		dbl.addAdmin(admin);
		assertEquals(1, dbl.editAdmin("wesd3", "Wes", "Dickhaus", "password11", 'a', 'Y'));
		dbl.deleteAdmin("wesd3");
	}

	@Test
	public void testIsUserAdmin(){
		admin = new Admin("Wes", "Dickhaus", "wesd3", "password1", 'a', 'Y');
		dbl.addAdmin(admin);
		assertEquals(true, dbl.isUserAdmin("wesd3"));
		dbl.deleteAdmin("wesd3");
		
		student = new Student("Wes", "Dickhaus", "wesd3", "password1", 'u', 'Y');
		dbl.addStudent(student);
		assertEquals(false, dbl.isUserAdmin("wesd3"));
		dbl.deleteStudent("wesd3");
	}

	@Test
	public void testIsUserStudent(){
		
		student = new Student("Wes", "Dickhaus", "wesd3", "password1", 'u', 'Y');
		dbl.addStudent(student);
		assertEquals(true, dbl.isUserStudent("wesd3"));
		dbl.deleteStudent("wesd3");
		
		admin = new Admin("Wes", "Dickhaus", "wesd3", "password1", 'a', 'Y');
		dbl.addAdmin(admin);
		assertEquals(false, dbl.isUserStudent("wesd3"));
		dbl.deleteAdmin("wesd3");
	}

	@Test
	public void testRemoveUniversityEmphasis(){
		uni = new University("Swag University", "Albaman", "City", "PRIVATE", 
				5000,50.0,800,700,800,24000.0,50,1000.5,25.0,70,4,4,"4");
		dbl.addUniversity(uni);
		dbl.addUniversityEmphasis( uni, "Math");
		assertEquals(1, dbl.removeUniversityEmphasis(uni.getName(), "Math"));
		dbl.deleteUniversity(uni);
	}

}





