package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframeeg1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//switch the focous to selenium page to iframe
		driver.switchTo().frame("iframe-name"); //id,name,index,webelement u can select
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		//so we change the focous to main page to iframe
		

	}
}
