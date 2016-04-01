package project;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class StudentTest{
	private Student student1;
	private Student student2;
	private Student student3;
	
		  @Before
		  public void init(){
		    student1 = new Student("Kian","Larson","KianL","k1234",'a','Y');
		    student2= new Student("Al","Jacob","AlJ","aj233",'a');
		  }
		  @Test
		  public void testFirstdConstructor(){
			assertEquals("Kian",student1.getFirstName());
			assertEquals("Larson",student1.getLastName());
			assertEquals("KianL",student1.getUsername());
			assertEquals("k1234",student1.getPassword());
			assertEquals('a',student1.getType());
			assertEquals('Y',student1.getStatus());
		  }
		  @Test
		  public void testSecondConstructor()
		  {
			  assertEquals("Al",student2.getFirstName());
				assertEquals("Jacob",student2.getLastName());
				assertEquals("AlJ",student2.getUsername());
				assertEquals("aj233",student2.getPassword());
				assertEquals('a',student2.getType());
		  }
		  @Test
		  public void testSetterMethods()
		  {
			  student1.setFirstName("Ashley");
			  assertEquals("Ashley",student1.getFirstName());
			  student1.setLastName("Nandy");
			  assertEquals("Nandy",student1.getLastName());
			  student1.setPassword("Na1234");
			  assertEquals("Na1234",student1.getPassword());
			  student1.setStatus('N');
			  assertEquals('N',student1.getStatus());
			  student1.setUsername("annie1");
			  assertEquals("annie1",student1.getUsername());
			  student1.setType('u');
			  assertEquals('u',student1.getType());
		  }
		    
			  
		  }
		  