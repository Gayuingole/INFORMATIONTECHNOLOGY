package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//here we first take webelement of rightclick then webelement of copy
		WebElement rightclick = driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement copy = driver.findElement(By.xpath("//span[text()='Copy']"));
		Actions act = new Actions(driver);
		act.contextClick(rightclick).click(copy).build().perform();
		

	}

}
