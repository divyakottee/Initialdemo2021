package Demo1;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprov {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	  System.out.println(n);
	  System.out.println(s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 2000, "Apple" },
      new Object[] { 3000, "Nimbus" },
    };
  }
}
