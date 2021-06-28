package Demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class Junit {
		
		//this will run before the test
		@Before 
		public void beforetest()
		{
			System.out.println("Before test method is running");
			Assert.assertEquals("IBM", "IBM");
		}
		
		@Test
		public void test()
		{
			System.out.println("Test Case one");
		}
		
		
		//this will run after the test
		@After 
		public void aftertest()
		{
			System.out.println("After test is running");
		}
		
		
		
		
	}

