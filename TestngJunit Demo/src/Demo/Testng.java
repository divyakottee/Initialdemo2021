package Demo;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("Before Test");
		Assert.assertEquals("IBM", "IBM");
	}

	
	@AfterTest
	public void aftertest()
	{
		System.out.println("After test in demo pkg");
	}
	
	@Test
	public void test()
	{
		System.out.println("Test one in demo 1");
	}
}
