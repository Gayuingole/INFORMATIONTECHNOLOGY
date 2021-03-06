package misc;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Multielements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("q")).sendKeys("honda");
		 List<WebElement> myele = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		String expectedresult ="honda amaze";
		for(WebElement text:myele) {
			System.out.println(text.getText());
		}
		for(WebElement search:myele) {
			String actualresult=search.getText();
			if(actualresult.equals(expectedresult)) {
				search.click();
				break;
			}
		}
		WebElement rev = driver.findElement(By.linkText("Images"));
		//driver.findElement(By.partialLinkText("Img"))
		 WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(30));
		w.until(ExpectedConditions.visibilityOf(rev));
		rev.click();
	}

}
