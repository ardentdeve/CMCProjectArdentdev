package project;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class SearchControllerTester {
	SearchController searchCh;
	University uni;
	@Before
	public void setUp() throws Exception {
	 searchCh = new SearchController();
	}

	@Test
	public void test() {
		 University tech = new University("Kanye West TECHNOLOGY ","Kanye City","BIG-CITY","PRIVATE",5000,50.0,800,800,800,22000.0,50,1000.5,25.0,70,4,4,"4");
		ArrayList <University > uniLists = searchCh.search("Kanye West TECHNOLOGY ","Kanye City","BIG-CITY","PRIVATE", 5000,50.0,800);
	       assertEquals(true, uniLists.contains(tech));
	}

}

