package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class envocationcount {
  @Test(invocationCount = 3)
  public void f() {
	  Reporter.log("f is running",true);
  }
  @Test
  public void g() {
	 Reporter.log("g is running",true); 
  }
}
