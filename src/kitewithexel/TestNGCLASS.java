package kitewithexel;



import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGCLASS {
	 WebDriver driver;
	 Sheet mysheet;
	 KiteLoginPage login;
	 PinPage pn;
	 HomePage HM;
	@BeforeClass
	public void launchbrowser() throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		File myfile = new File("E:\\5thmarch.xlsx");
		mysheet= WorkbookFactory.create(myfile).getSheet("Sheet4");
		 login = new KiteLoginPage(driver);
		 pn = new PinPage(driver);
	     HM = new HomePage(driver);
	}
	@BeforeMethod

	public void KiteLogin() {
		
	 login.username(mysheet.getRow(0).getCell(0).getStringCellValue());
	 Reporter.log("sending username......",true);
	 login.password(mysheet.getRow(0).getCell(1).getStringCellValue());
	 Reporter.log("sending password......",true);
	 login.clickonlogin();
	 Reporter.log("clickonlogin......",true);
	 driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	 pn.pinbutton(mysheet.getRow(0).getCell(2).getStringCellValue());
	 Reporter.log("sending pin......",true);
	 pn.continueb();
	 Reporter.log("clickoncontinue......",true);
	} 
	
		
	
  @Test
  public void Validateuserid() {
	String expecteduserid = mysheet.getRow(0).getCell(0).getStringCellValue();
	String actual = HM.actualuserid();
	Assert.assertEquals(expecteduserid,actual,"test case is failed");
	Reporter.log("testcase is passed",true);
  }
  @AfterMethod
  public void logout() throws InterruptedException 
  {
	  HM.logout();
	  Reporter.log("loging out......",true);
  }
  @AfterClass
  public void closebrowser() {
	  Reporter.log("closing browser......",true);
	  driver.close();
  }
  
}
