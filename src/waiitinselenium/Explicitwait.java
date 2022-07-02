package waiitinselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://vctcpune.com/"); //launch url
		 WebElement review = driver.findElement(By.xpath(("(//a[text()='Student Review'])[1]")));//here we find out webelement of a review option
		 //and store it in refrence variable for future use
		 //instead of thread we use wait method
		 //
		WebDriverWait w = new WebDriverWait(driver, Duration.ofMillis(30));// here time get releae //we only use to find out perticular eelement
		w.until(ExpectedConditions.visibilityOf(review));// here we check web element is visibal or not
		review.click();
		
		
		

	}

}
