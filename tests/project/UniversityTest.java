package project;

import static org.junit.Assert.*;

import org.junit.Test;

public class UniversityTest {
	private University univ;

	@Test
	public void testConstructor() {
		univ = new University("name", "state", "location", "control", 1000, 50.0, 900, 900, 12000, 80.0, 2000,
				70.0, 60.0, 4, 3, 5, "Math");
		assertEquals("name is " + univ.getName(), univ.getName(), "name");
		assertEquals("state is " + univ.getState(), univ.getState(), "state");
		assertEquals("location is " + univ.getLocation(), univ.getLocation(), "location");
		assertEquals("control is " + univ.getControl(), univ.getControl(), "control");
		assertEquals("numberStudents is " + univ.getNumberStudents(), univ.getNumberStudents(), 1000);
		assertTrue("pctFemale is " + univ.getPctFemale(), univ.getPctFemale() == 50.0);
		assertEquals("satVerbal is " + univ.getSatVerbal(), univ.getSatVerbal(), 900);
		assertEquals("satMath is " + univ.getSatMath(), univ.getSatMath(), 900);
		assertEquals("expenses is " + univ.getExpenses(), univ.getExpenses(), 12000);
		assertTrue("pctFinancialAid is " + univ.getPctFinancialAid(), univ.getPctFinancialAid() == 80.0);
		assertEquals("numberOfApplicants is " + univ.getNumberOfApplicants(), univ.getNumberOfApplicants(), 2000);
		assertTrue("pctAdmitted is " + univ.getPctAdmitted(), univ.getPctAdmitted() == 70.0);
		assertTrue("pctEnrolled is " + univ.getPctEnrolled(), univ.getPctEnrolled() == 60.0);
		assertEquals("academicScale is " + univ.getAcademicScale(), univ.getAcademicScale(), 4);
		assertEquals("socialScale is " + univ.getSocialScale(), univ.getSocialScale(), 3);
		assertEquals("qualityOfLifeScale is " + univ.getQualityOfLifeScale(), univ.getQualityOfLifeScale(), 5);
		assertEquals("emphases are " + univ.getEmphases(), univ.getEmphases(), "Math");
	}

	@Test
	public void testSetters() {
		univ.setName("name");
		assertEquals("Name is "+ univ.getName(), univ.getName(), "name");
		univ.setState("state");
		assertEquals("State is "+ univ.getState(), univ.getState(), "state");
		univ.setLocation("location");
		assertEquals("Location is " + univ.getLocation(), univ.getLocation(), "location");
		univ.setControl("control");
		assertEquals("Control is " + univ.getControl(), univ.getControl(), "control");
		univ.setNumberStudents(10);
		assertEquals("The number of students is " + univ.getNumberStudents(), univ.getNumberStudents(), 10);
		univ.setPctFemale(50.0);
		assertTrue("The percent is " + univ.getPctFemale(), univ.getPctFemale() == 50);
		univ.setSatVerbal(1000);
		assertEquals("The percent is " + univ.getSatVerbal(), univ.getSatVerbal(), 1000);
		univ.setSatMath(1000);
		assertEquals("The percent is " + univ.getSatMath(), univ.getSatMath(), 1000);
		univ.setExpenses(1000);
		assertEquals("The percent is " + univ.getExpenses(), univ.getExpenses(), 1000);
		univ.setPctFinancialAid(1000);
		assertTrue("The percent is " + univ.getSatMath(), univ.getSatMath() == 1000);
	}
}
