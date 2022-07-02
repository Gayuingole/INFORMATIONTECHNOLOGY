package pompracticeee;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.Pinpage;

public class testclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		 //loginpage
		 LOGINPAGE login = new LOGINPAGE(driver);
		 login.username();
		 login.password();
		 login.clickonbutton();
		 //pinpage 
		 Pinpage p = new Pinpage(driver);
		 p.sendpin();
		 p.clickoncontinue();
		 //homepage 
		 Homepage hm = new Homepage(driver);
		 
		 hm.validateuserid();
		 hm.logout();
		 
	}

}
