package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts"); //to write url or to go on that
		driver.manage().window().maximize(); //to maximise window
		Thread.sleep(1000); //to load
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		Thread.sleep(1000);
		Alert alt = driver.switchTo().alert();
		alt.accept();
		

	}

}
