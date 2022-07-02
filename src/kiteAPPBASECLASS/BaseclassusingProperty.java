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
import net.bytebuddy.utility.RandomString;

public class BaseclassusingProperty {

	
	
		 protected WebDriver driver; //globally we declare driver
			//BROWSERS SETTING
			//I WANT SEPRATE METHOD FOR BROWSER CALLING
			public void openbrowser() throws IOException {
				System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get(UtlityUsingPropertyfile.DataFromProperty("URL"));
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

	}
			public  static void takeScreenshot(WebDriver driver) throws IOException {
				File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 String random = RandomString.make(3);
				File destination = new File("E:\\screenshot\\takesscrrenshot"+random+".jpg");
				FileHandler.copy(src, destination);

			}}
