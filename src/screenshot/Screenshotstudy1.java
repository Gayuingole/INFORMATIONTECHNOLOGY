package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshotstudy1 {

	public static void main(String[] args) throws InterruptedException, IOException  {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com/");
		Thread.sleep(1000);
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\screenshot\\scr.png");
		FileHandler.copy(source, destination);
		
		String random = RandomString.make(4);
		File destination1=new File("E:\\screenshot\\scr"+random+".jpg");
		FileHandler.copy(source, destination1);
	}

}
