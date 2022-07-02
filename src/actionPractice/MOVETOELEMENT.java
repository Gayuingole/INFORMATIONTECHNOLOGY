package actionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MOVETOELEMENT {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		  WebElement f = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		  Actions a = new Actions(driver);
		  a.moveToElement(f).perform();
		  a.click().perform();
		  // a.click(f).perform(); \\2nd way
		  //a.moveToElement(f).click().build().perform();
	}

}
