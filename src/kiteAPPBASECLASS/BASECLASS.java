package kiteAPPBASECLASS;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
         
public class BASECLASS {
	 protected WebDriver driver; //globally we declare driver
	//BROWSERS SETTING
	//I WANT SEPRATE METHOD FOR BROWSER CALLING
	public void openbrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
	}
}
