package sequencially;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class sequence_testng {
	@Test
	  public void method1() {
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://paytm.com/");
		  Reporter.log("my method1 is running",true);
	  }
	@Test
	  public void method2() {
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://vctcpune.com/");
		  Reporter.log("my method1 is running",true);
}
	@Test
	  public void method3() {
		  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://kite.zerodha.com/");
		  Reporter.log("my method1 is running",true);
}
}