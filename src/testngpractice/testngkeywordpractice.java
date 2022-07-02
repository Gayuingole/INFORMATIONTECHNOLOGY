package testngpractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngkeywordpractice {
  @Test
  public void f() {
	  Assert.fail();
	  Reporter.log("f tc is failed",true);
  }
  @Test (dependsOnMethods = {"f"})
  public void a() 
  {
	  Reporter.log("a tc is passed",true);
  }
  @Test
  public void b() {
	 Reporter.log("b tc is passed",true); 
  }
  @Test
  public void n() {
	  Reporter.log("n tc is passed",true);
  }
}
