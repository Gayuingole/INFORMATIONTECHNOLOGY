package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathbyattributes {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.nobroker.in/");
	driver.manage().window().maximize();
	Thread.sleep(100);
	driver.findElement(By.xpath("//input[@type='text']")).click();

	}

}
