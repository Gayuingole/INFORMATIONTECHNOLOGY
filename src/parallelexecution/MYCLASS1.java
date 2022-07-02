package parallelexecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MYCLASS1 {
  @Test
  public void method1() {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://paytm.com/");
	  Reporter.log("my method1 is running",true);
  }
}
