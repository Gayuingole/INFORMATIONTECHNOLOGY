package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enabled {
  @Test
  public void A() 
  {
	  Reporter.log("a is running tc is passed",true);
  }
  @Test
  public void B() 
  {
	  Reporter.log("b is running tc is passed",true);
  }
  @Test(enabled = false )
  public void C() 
  {
	  Reporter.log("c is running tc is passed",true);
  }
}
