package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe" );
		WebDriver driver =new ChromeDriver();
		driver.get("https://demoqa.com/alertsWindows");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		 WebElement text1 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		 System.out.println(text1.getText());
		 Thread.sleep(1000);
		 WebElement text2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		 driver.switchTo().frame(text2);
		 Thread.sleep(1000);
		WebElement text3 = driver.findElement(By.xpath("//p['text()='Child Iframe']"));
		System.out.println(text3.getText());

	}
}

