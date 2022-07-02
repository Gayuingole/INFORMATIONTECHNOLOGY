package xmlfile;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class mytest {
  @Test
  public void method1() {
	  //i want 1,3,5 and dont want 2 and 4
	  Assert.fail();
	  Reporter.log("my method 1 is running",true);
  }
  @Test
  public void method2() {
	  Reporter.log("my method2 is running",true);
  }
  @Test
  public void method3() {
	  Reporter.log("my method3 is running",true);
  }
  @Test
  public void method4() {
	  Reporter.log("my method4 is running",true);
  }
  @Test
  public void method5() {
	  Assert.fail();
	  Reporter.log("my method5 is running",true);
  }
}
