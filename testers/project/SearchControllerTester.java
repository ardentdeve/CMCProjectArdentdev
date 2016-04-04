package project;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SearchControllerTester {
	SearchController searchCh;
	@Before
	public void setUp() throws Exception {
	 searchCh = new SearchController();
	}

	@Test
	public void test() {
		searchCh.search("Kanye West TECHNOLOGY" ,"Kanye City","BIG-CITY","PRIVATE", 5000,50,800);
	}

}

