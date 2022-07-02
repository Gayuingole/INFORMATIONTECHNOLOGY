package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		//kiteloginpage zerodha
		POMtest1 login =new POMtest1(driver);
		
		login.username();
		login.password();
		login.clickonbutton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		//kitepinpage zerodha
		
		//create obj f pin page
		Pinpage pin2 = new Pinpage(driver);
		
		pin2.sendpin();
		pin2.clickoncontinue();
		
		//homepage
		Kitehomepage home= new Kitehomepage(driver);
		home.validateuserid();
		home.clickonlogoutbutton();
		driver.close();
		

	}

}
