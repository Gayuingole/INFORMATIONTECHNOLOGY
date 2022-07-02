package iframepractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframepractice1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframe-name");
		Thread.sleep(1000);
		driver.findElement(By.id("et-info")).click();
		//Thread.sleep(1000);
		//driver.findElement(By.xpath("(//a[text()='About us'])[2]")).click();
		

	}

}
