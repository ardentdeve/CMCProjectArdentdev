package project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest{
	private Student student;
	
	@Before
	public void setUp()throws Exception {
		student = new Student("password", "Username", "firstName", "lastName", 'a', 'y');
	}
	
	
	@Test 
	public void testConstructor(){
	student = new Student("firstName", "lastName", "username", "password", 's', 'y');
	assertEquals("password is " + student.getPassword(), student.getPassword(),  "password");
	assertEquals("Username is " + student.getUsername(), student.getUsername(),  "username");
	assertEquals("firstName is " + student.getFirstName(), student.getFirstName(),  "firstName");
	assertEquals("lastName is " + student.getLastName(), student.getLastName(),  "lastName");
	assertTrue("type is " + student.getType(), student.getType()==  's');
	assertEquals("status is " + student.getStatus(), student.getStatus(),  'y');
	}
	
	@Test 
	public void testConstructor2(){
	student = new Student("firstName", "lastName", "Username", "password", 's');
	assertEquals("password is " + student.getPassword(), student.getPassword(),  "password");
	assertEquals("Username is " + student.getUsername(), student.getUsername(),  "Username");
	assertEquals("firstName is " + student.getFirstName(), student.getFirstName(),  "firstName");
	assertEquals("lastName is " + student.getLastName(), student.getLastName(),  "lastName");
	assertEquals("type is " + student.getType(), student.getType(),  's');
	}
}
