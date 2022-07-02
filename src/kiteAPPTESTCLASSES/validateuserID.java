

package kiteAPPTESTCLASSES;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import kiteAPPBASECLASS.BASECLASS;
import kiteAPPPOM.HomePage;
import kiteAPPPOM.KiteLoginPage;
import kiteAPPPOM.PinPage;
import kiteAPPUTILITYCLASS.Utilityclass;

public class validateuserID extends BASECLASS{
	KiteLoginPage login;
	 PinPage pin;
	 HomePage home;
	
	 
	@BeforeClass
	public void launchBrowser() {
		openbrowser();
		login = new KiteLoginPage(driver);
		pin= new PinPage(driver);
		home=new HomePage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		}
	
	@BeforeMethod
	
	public void logintokiteapp() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
	    login.username(Utilityclass.readdatafromexcel(0, 0));
		login.password(Utilityclass.readdatafromexcel(0, 1));
		login.clickonlogin();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.pinbutton(Utilityclass.readdatafromexcel(0, 2));
		pin.continueb();
	}
  @Test
  public void validateusername() throws EncryptedDocumentException, IOException {
	 String actualusername = home.actualuserid();
	 String expectedusername= Utilityclass.readdatafromexcel(0, 0);
	 Assert.assertEquals(actualusername,expectedusername,"tc is failed" );
	 Reporter.log("username are matching testcase is passed",true);
	 Utilityclass.takeScreenshot(driver);
  }
  @AfterMethod
  public void logoutfromkiteapp() throws InterruptedException {
	  home.logout();
  }
  @AfterClass 
  public void closebrowser() {
	driver.close();  
  }
 
}
