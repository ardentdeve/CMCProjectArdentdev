package project;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdminHomeTest.class, AdminTester.class, AdminUITest.class, DBControllerTest.class,
		StudentHomeTest.class, StudentTest.class, StudentUITest.class, UniversityHomeTester.class,
		UniversityTest.class })
public class AllTests {

}
