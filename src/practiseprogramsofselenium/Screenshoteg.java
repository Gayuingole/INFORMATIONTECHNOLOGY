package practiseprogramsofselenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshoteg {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        driver.get("https://www.facebook.com/");
        File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File dest= new File("E:\\screenshot\\scrre1.jpg");
        FileHandler.copy(scr, dest);
	}

}
