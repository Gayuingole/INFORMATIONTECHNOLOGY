package practiseprogramsofselenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class SCRRENSHOT {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/title/tt0235917/");
		Thread.sleep(1000);
		  File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   String random = new RandomString().make(4);
		  File destination = new File("E:\\screenshot\\screenshot"+random+".jpg");
		  FileHandler.copy(scr, destination);
		      
				 

	}

	
}
