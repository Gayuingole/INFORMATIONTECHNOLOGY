package testnglistner;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import testNGkeyword.Dependson;
@Listeners(testnglistner.list.class)
public class listner1 {
	@Test
  public void m1() {
		Reporter.log("hi gm",true);
  }
	@Test
	  public void m2() {
	         Assert.fail();
			Reporter.log("hi gm",true);
	  }
	@Test
	  public void m3() {
			Reporter.log("hi goodafternoon",true);
	  }
	@Test (dependsOnMethods = {"m2"})
	  public void m4() {
			Reporter.log("hi gm",true);
	  }
}
