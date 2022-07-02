package testNGkeyword;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class INVOCATION_COUNT_USE {
  @Test(invocationCount = 3 )
  public void Mymethod() {
	  Reporter.log("my method is running",true);
  }
  
  @AfterMethod
  public void close() {
	  Reporter.log("my method is running",true);
  }
  
}
