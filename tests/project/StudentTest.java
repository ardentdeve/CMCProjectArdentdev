package project;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class StudentTest {
	private Student student;

	@Before
	public void setUp() {
		student = Student("firstname", "lastName", "username", "password", 'a', 'Y');
	}
	
	
}