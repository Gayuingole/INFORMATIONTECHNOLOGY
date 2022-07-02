package xmlfile;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class mytest3 {
  @Test(groups = "sanity")
  public void method1() {
	  Reporter.log("my method1 sanity is running",true);
  }
  @Test
  public void method2() {
	  Reporter.log("my method2 is running",true);
  }
  @Test(groups = "regression")
  public void method3() {
	  Reporter.log("my method3 regression is running",true);
  }
  @Test
  public void method4() {
	  Reporter.log("my method4 is running",true);
  }
  @Test(groups ="regression" )
  public void method5() {
	  Reporter.log("my method5 regression is running",true);
  }
}
