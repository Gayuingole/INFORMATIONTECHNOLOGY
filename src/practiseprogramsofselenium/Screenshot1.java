package practiseprogramsofselenium;

import java.io.File;
import java.io.IOException;



import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/Meher_Baba");
		Thread.sleep(1000);
		  File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
          File destination = new File("E:\\screenshot\\screenshot.jpg");
          FileHandler.copy(scr, destination);
          
	}

}
