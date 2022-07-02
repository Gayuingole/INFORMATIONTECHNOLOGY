package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotationstudy {
  @Test
  public void myTest3() {
	  Reporter.log("test method is running",true);
  }
  @Test
  public void myTest4() {
	  Reporter.log("test  method1 is running",true);
  }
  @BeforeMethod
  public void login() {
	  Reporter.log("before method is running",true);
  }
  @AfterMethod
  public void logout() {
	  Reporter.log("after method is running",true);
  }
  @BeforeClass
  public void launchBrowser() {
	  Reporter.log("before class is running",true);
  }
  @AfterClass
  public void closeBrowser() {
	  Reporter.log("after class is running",true);
  }
  
  
}