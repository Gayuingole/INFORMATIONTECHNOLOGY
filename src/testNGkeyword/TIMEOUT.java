package testNGkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TIMEOUT {
  @Test(timeOut = 1000)
  public void A() throws InterruptedException
  {
	  Thread.sleep(1200);
	  Reporter.log("A is running",true);
  }
  
  @Test
  public void C() {
	  Reporter.log("C is running",true);
  }
  @Test(enabled = false)
  public void D() {
	  Reporter.log("D is running",true);
  }
  @Test
  public void B() {
	  Reporter.log("B is running",true);
  }
}
