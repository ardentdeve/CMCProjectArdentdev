package project;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class UniversityHomeTester {
	private UniversityHome univh;
	private DBController dbl;
	
	
	@Before
	public void setUp() throws Exception {
		univh = new UniversityHome("data", "username", "password");
		dbl = new DBController("aonneji", "aonneji", "ajjw");
	}
	
	
	@Test
	public void testGetUniversities() {
		University univ = new University("name", "state", "location", "control", 
				10000, 50.0, 900, 800, 12000, 90.0, 8000, 70.0, 30.0, 5, 4, 3, "Math");
		dbl.addUniversity(univ);
		ArrayList universities = dbl.getUniversities();
		University univCopy = (University)universities.get(0);
		assertTrue("The universities do not match", univ.equals(univCopy));
	}
	
	
}
