package Demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class ATest1 {
	
	  @BeforeSuite
	  public void beforeSuite() {
		  
		  System.out.println("This is the first test");
	  }	
	
  @Test
  public void testcase1()
  {
	  System.out.println("This is first TC");  
  }
  
  @Test
  public void testcase2()
  {
	  System.out.println("This is second TC");  
  }
		  
		  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This will execute before every @test in test1.java");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This will execute after every @test in test1.java");
   
  }


  @BeforeClass
  public void beforeClass() {
	  System.out.println("This will execute before before test in test1.java");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("This will execute at the end of test1.java");
  }

  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("This will execute after before test suite");
  }


}
