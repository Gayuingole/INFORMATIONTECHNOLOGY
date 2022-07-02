package kiteAPPTESTCLASSES;

import java.io.IOException;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAPPBASECLASS.BaseclassusingProperty;
import kiteAPPPOM.HomePage;
import kiteAPPPOM.KiteLoginPage;
import kiteAPPPOM.PinPage;
import kiteAPPUTILITYCLASS.UtlityUsingPropertyfile;

public class KiteUnitTestUsingProperty extends BaseclassusingProperty {
	KiteLoginPage login;
	 PinPage pin;
	 HomePage home;
	 
	 
	 //launch browser
	 @BeforeClass
	 public void launchbrowser() throws IOException {
		 openbrowser();
		 login= new KiteLoginPage(driver);
		 pin= new PinPage(driver) ;
		 home= new HomePage(driver);
	 }
	 @BeforeMethod
	 public void logintokiteapp() throws IOException {
		  login.username(UtlityUsingPropertyfile.DataFromProperty("UN"));
		  login.password(UtlityUsingPropertyfile.DataFromProperty("pwd"));
		  login.clickonlogin();
		  UtlityUsingPropertyfile.implicitwait(driver, 200);
		  pin.pinbutton(UtlityUsingPropertyfile.DataFromProperty("pin"));
		  pin.continueb();
		  UtlityUsingPropertyfile.implicitwait(driver, 200);
	 }
	 
  @Test
  public void ValidateUserName() throws IOException {
           String actualuserid = home.actualuserid();
            String expecteduserid = UtlityUsingPropertyfile.DataFromProperty("UN");
            Assert.assertEquals(actualuserid,expecteduserid,"Actual and expected are not matching,TCis failed");
            Reporter.log("Actual and expected userid are matching,TC is passed ",true);
            UtlityUsingPropertyfile.takeScreenshot(driver);
  }
  @AfterMethod
  public void logoutfromKite() throws InterruptedException {
	  home.logout();
  }
  @AfterClass
  public void closeBrowser() throws InterruptedException {
	  Thread.sleep(4000);
	  driver.close();
  }
}
