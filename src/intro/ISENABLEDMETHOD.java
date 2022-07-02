package intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ISENABLEDMETHOD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty( "webdriver.chrome.driver","E:\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zee5.com/signin");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath(("//button[@type='button'])[6]")));
		Thread.sleep(5000);
		driver.findElement(By.id("textField")).sendKeys("7385985053");
	   WebElement result = driver.findElement(By.xpath(""));
	    boolean r =result.isEnabled();
	    System.out.println(r);
	    
		
		
	}

}
