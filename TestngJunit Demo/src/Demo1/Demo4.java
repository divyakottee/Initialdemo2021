package Demo1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo4 {
	
	@Test
	public void apple()
	{
		String act = "Sunil";
		String exp = "Sunil1";
		Assert.assertEquals(act,exp);
	}
	
	@Test(dependsOnMethods = "apple" , enabled = false)
	public void dish()
	{
		System.out.println("This is my 2nd tc after apple");
	}
	
	@Test(alwaysRun = true)
	public void key()
	{
		System.out.println("This is my 3rd TC after dish");
	}

}
