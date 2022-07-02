package waiitinselenium;




import java.time.Duration;import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicitwait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.discoveryplus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(7000));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		

	}

}
