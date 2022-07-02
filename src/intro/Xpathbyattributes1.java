package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattributes1 {

	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(100);
	  
	  //xpath by attributes;
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).click();
	   //xpath by textmethod;
	  driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']")).click();
	   //xpath by contains
	  driver.findElement(By.xpath("//h2[contains( text(),'Facebook helps')]")).click();
	 //.findElement(By.xpath("")).click()
	  

	}
}
