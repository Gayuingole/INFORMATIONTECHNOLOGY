package xmlfile;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class mytest4 {
	 @Test(groups = "regression")
	  public void method6() {
		  Reporter.log("my method6 regression is running",true);
	  }
	  @Test(groups = "sanity")
	  public void method7() {
		  Reporter.log("my method7 sanity is running",true);
	  }
	  @Test
	  public void method8() {
		  Reporter.log("my method8  is running",true);
	  }
	  @Test
	  public void method9() {
		  Reporter.log("my method9 is running",true);
	  }
	  @Test
	  public void method10() {
		  Reporter.log("my method10  is running",true);
	  }
}
