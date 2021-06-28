package Demo1;

import org.testng.annotations.Test;

public class Demo3 {
	
	
	@Test (priority = 1)
	public void tc1()
	{
		System.out.println("This is first TC");
	}
	
	@Test (priority = 3)
	public void yc2()
	{
		System.out.println("This is second TC");	
	}
	
	@Test (priority = 2)
	public void ac3()
	{
		System.out.println("This is 3rd TC");	
	}
	
	@Test (priority = 0)
	public void dc4()
	{
		System.out.println("This is fourth TC");
	}
	
	@Test
	public void test1()
	{
		System.out.println("This is 5th TC");
	}
	
	@Test 
	public void test2()
	{
		System.out.println("This is 6th TC");
	}
	
	

}
