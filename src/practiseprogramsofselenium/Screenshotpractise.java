package practiseprogramsofselenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshotpractise {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random = new RandomString().make(4);
		File dest = new File("E:\\screenshot\\screenshot"+random+".png");
		FileHandler.copy(source, dest);
	}

}
