package zerodha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		WebElement id = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	     
	     id.sendKeys("ELR321");
	     password.sendKeys("DHANA1111");
	     login.click();
	     WebElement pin = driver.findElement(By.id("pin"));
		    WebElement continu = driver.findElement(By.xpath("//button[@type='submit']"));
	     driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	     pin.sendKeys("982278");
	     continu.click();
	}
}
