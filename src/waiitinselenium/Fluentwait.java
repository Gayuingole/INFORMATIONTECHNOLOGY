package waiitinselenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.discoveryplus.in/");
		WebElement signin = driver.findElement(By.xpath(("(// h6[text()='Sign In'])[2]")));
		Thread.sleep(2000);
		//fluent wait(single elemnt,condition ,frequency)
		//Wait<WebDriver>w=new FluentWait<WebDriver>(driver) //created obj of fluent wait
		//.withTimeout(Duration.ofSeconds(50)) //so we declare the timeout here for fluent wait for signin function visibility
		//.pollingEvery(Duration.ofSeconds(5)) //after every 5 sec it checks element visibal or not 
		//.ignoring(NoSuchElementException.class); //if it dont found in 20sec then throw no suchelemnt exception
		//w.until(ExpectedConditions.visibilityOf(signin));// checks visibility of web element
		signin.click();
		

	}

}

