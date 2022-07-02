package testnglistnersindiffway;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(testnglistner.LISTNER.class)
public class MyTest {
  @Test
  public void MyMethod() {
	  Reporter.log("hi GM",true);
  }
  @Test
  public void MyMethod1() {
	  Assert.fail(); //if we want to fail tc
	  Reporter.log("hi GM",true);
	   }
  //dependson i.e skip
  @Test (dependsOnMethods = {"MyMethod1"})
  public void MyMethod2() {
	 // Assert.fail(); //if we want to fail tc
	  Reporter.log("hi GM",true);
	   }
}
