package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority {
  @Test(priority = 1)
  public void a() {
	Reporter.log("a is running tc is passed",true);  
  }
  @Test(priority = -1)
  public void b() {
	  Reporter.log("b is running tc is passed",true);
  }
  @Test(priority = 2)
  public void c() {
	  Reporter.log("c is running tc is passed",true);
  }
  @Test(priority = -2)
  public void d() {
	  Reporter.log("d is running tc is passed",true);
  }
}
