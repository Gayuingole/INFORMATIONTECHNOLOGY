package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddendivison {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/"); //to write url or to go on that
		driver.manage().window().maximize(); //to maximise window
		Thread.sleep(1000); //to load
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("iphone13 pro"); //for search bar name always be q sendkeys to enter value in searchbar
		driver.findElement(By.xpath("//button[@type='submit']")).click();//we click on search inspect and take element
		                                                                  
		
	}

}
