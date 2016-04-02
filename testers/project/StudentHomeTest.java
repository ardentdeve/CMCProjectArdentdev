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
	
}
