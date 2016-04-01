package project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UniversityTest {
	private University univ;
	@Before
	public void init()
	{
		univ = new University("name", "state", "location", "control", 1000, 50.0, 900, 900, 12000, 80.0, 2000,
				70.0, 60.0, 4, 3, 5, "Math");
	}

	@Test
	public void testConstructor() {
		
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
		univ.setUniversity("name", "state", "location", "control", 2000, 51.0, 901, 901, 11000, 81.0, 2001,
				71.0, 61.0, 3, 2, 4, "Math");
		assertEquals("name is " + univ.getName(), univ.getName(), "name");
		assertEquals("state is " + univ.getState(), univ.getState(), "state");
		assertEquals("location is " + univ.getLocation(), univ.getLocation(), "location");
		assertEquals("control is " + univ.getControl(), univ.getControl(), "control");
		assertEquals("numberStudents is " + univ.getNumberStudents(), univ.getNumberStudents(), 2000);
		assertTrue("pctFemale is " + univ.getPctFemale(), univ.getPctFemale() == 51.0);
		assertEquals("satVerbal is " + univ.getSatVerbal(), univ.getSatVerbal(), 901);
		assertEquals("satMath is " + univ.getSatMath(), univ.getSatMath(), 901);
		assertEquals("expenses is " + univ.getExpenses(), univ.getExpenses(), 11000);
		assertTrue("pctFinancialAid is " + univ.getPctFinancialAid(), univ.getPctFinancialAid() == 81.0);
		assertEquals("numberOfApplicants is " + univ.getNumberOfApplicants(), univ.getNumberOfApplicants(), 2001);
		assertTrue("pctAdmitted is " + univ.getPctAdmitted(), univ.getPctAdmitted() == 71.0);
		assertTrue("pctEnrolled is " + univ.getPctEnrolled(), univ.getPctEnrolled() == 61.0);
		assertEquals("academicScale is " + univ.getAcademicScale(), univ.getAcademicScale(), 3);
		assertEquals("socialScale is " + univ.getSocialScale(), univ.getSocialScale(), 2);
		assertEquals("qualityOfLifeScale is " + univ.getQualityOfLifeScale(), univ.getQualityOfLifeScale(), 4);
		assertEquals("emphases are " + univ.getEmphases(), univ.getEmphases(), "Math");
	}
}