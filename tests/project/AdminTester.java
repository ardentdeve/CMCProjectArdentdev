package project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdminTester {
	private Admin admin;
	
	@Before
	public void setUp()throws Exception {
		admin = new Admin("password", "Username", "firstName", "lastName", 'a', 'y');
	}
	
	
	@Test 
	public void testConstructor(){
	admin = new Admin("password", "Username", "firstName", "lastName", 'a', 'y');
	assertEquals("password is " + admin.getPassword(), admin.getPassword(),  "password");
	assertEquals("Username is " + admin.getUsername(), admin.getUsername(),  "Username");
	assertEquals("firstName is " + admin.getFirstName(), admin.getFirstName(),  "firstName");
	assertEquals("lastName is " + admin.getLastName(), admin.getLastName(),  "lastName");
	assertTrue("type is " + admin.getType(), admin.getType()==  'a');
	assertEquals("status is " + admin.getStatus(), admin.getStatus(),  'y');
	}
	
	@Test 
	public void testConstructor2(){
	admin = new Admin("firstName", "lastName", "Username", "password", 'a');
	assertEquals("password is " + admin.getPassword(), admin.getPassword(),  "password");
	assertEquals("Username is " + admin.getUsername(), admin.getUsername(),  "Username");
	assertEquals("firstName is " + admin.getFirstName(), admin.getFirstName(),  "firstName");
	assertEquals("lastName is " + admin.getLastName(), admin.getLastName(),  "lastName");
	assertEquals("type is " + admin.getType(), admin.getType(),  'a');
	}
}
