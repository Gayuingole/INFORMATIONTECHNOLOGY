package testngpractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class timeout {
  @Test(timeOut = 1000)
  public void a() throws InterruptedException {
	  Thread.sleep(1200);
	  Reporter.log("a tc running it is passed",true);
  }
  @Test
  public void b() {
	  Reporter.log("b tc running it is passed",true);
  }
  @Test
  public void c() {
	  Reporter.log(" c tc running it is passed",true);
  }
}
