package kiteAPPBASECLASS;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import kiteAPPUTILITYCLASS.UtlityUsingPropertyfile;

public class BaseclassListner {

	
	 protected  static WebDriver driver; //globally we declare driver
		//BROWSERS SETTING
		//I WANT SEPRATE METHOD FOR BROWSER CALLING
		public void openbrowser() throws IOException //static is remove from here
		{
			System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(UtlityUsingPropertyfile.DataFromProperty("URL"));
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

        }
		//we paste scrrenshotcode or take.... (String TCname )is added
		//in place of random we took TCname...
		public   void takeScreenshot(String TCname) throws IOException {
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			 
			File destination = new File("E:\\screenshot\\takesscrrenshotS"+TCname+".png");
			FileHandler.copy(src, destination);

}}


