package actionsclass;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		 WebElement Myelement = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		 //to move cursor
		 act.moveToElement(Myelement).perform();
		 //to click on selected elements
		 act.click().perform();
		 //to right click on selected elements
		 act.click(Myelement).contextClick().perform();
		 //to drag and drop
		WebElement source = driver.findElement(By.xpath("//a[text()=' 5000 ']")); //src element
		WebElement destination = driver.findElement(By.xpath("(//li[@class ='placeholder'])[2]"));//destination element
	     //1st way
		 act.dragAndDrop(source,destination).perform();// u can choose one way
	     //2nd way
	     act.clickAndHold(source).moveToElement(destination).release().build().perform();

	}

}
