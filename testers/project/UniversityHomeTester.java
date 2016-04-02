package project;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class UniversityHomeTester {
	private UniversityHome univh;
	private DBController dbl;
	
	
	@Before
	public void setUp() {
		univh = new UniversityHome("ardentdeve","ardentdeve","ajjw4");
	}
	
	
	@Test
	public void testAddUniversities() {
		University univ = new University("Dary University", "Albaman", "City", "PRIVATE", 
				5000,50.0,800,700,800,24000.0,50,1000.5,25.0,70,4,4,"4");
		assertEquals(1,univh.addUniversityToList(univ));
		assertEquals(1,univh.deleteUniversities(univ));
	
	}
	@Test
	public void testEditUniversities(){
		University univ = new University("Missipii International", "Missippi", "URBAN", "PRIVATE", 
				5000,50.0,800,800,800,22000.0,50,1000.5,25.0,70,4,4,"4");
		assertEquals(1,univh.addUniversityToList(univ));
		univ = new University("Missipii International", "Houston", "City", "PRIVATE", 
				5000,50.0,800,800,800,22000.0,50,1000.5,25.0,70,4,4,"4");
		assertEquals(1,univh.editUniversities(univ));
		assertEquals(1,univh.deleteUniversities(univ));
	}
	

	
	
	
	
}
