package testNGkeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PRIORITY {
  @Test
  public void A() {
	  Reporter.log("A is running",true);
  }
  @Test
  
  public void C() {
	  Reporter.log("C is running",true);
  }
  @Test
  public void D() {
	  Reporter.log("D is running",true);
  }
  @Test
  public void B() {
	  Reporter.log("B is running",true);
  }
}
