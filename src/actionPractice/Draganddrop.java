package actionPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		 WebElement dragelement = driver.findElement(By.xpath("//div[@id='draggable']"));
		 WebElement drop = driver.findElement(By.xpath("(//div[@id='droppable'])[1]"));
		  Actions a = new Actions(driver);
		  //a.dragAndDrop(dragelement, drop).perform();
		  a.clickAndHold(dragelement).moveToElement(drop).release().build().perform();
	}

}
