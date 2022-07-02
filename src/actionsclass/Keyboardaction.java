package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keyboardaction {

	public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.new.chromedriver","E:\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://vctcpune.com/selenium/practice.html");
	 driver.manage().window().maximize();
	 Thread.sleep(100);
	 
	 driver.findElement(By.id("autocomplete"));
	 
	 
	 
	 
	 

	}

}
