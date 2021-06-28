package Demo1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterSuite;

public class BTest {
	
	@BeforeClass
	public void bc(){
		System.out.println("This will run before test2.java");
	}
	
  @Test
  public void f() {
	  
	  System.out.println("This is TC 3 test2.java");
	  
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("This will run before After test suite");
	  
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("This is the end");
  }

}
