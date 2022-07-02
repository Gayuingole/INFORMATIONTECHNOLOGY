package practiseprogramsofselenium;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;import org.bouncycastle.operator.OutputAEADEncryptor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SCREENSHOT4 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("https://vctcpune.com/student-review/");
        Thread.sleep(1000);
    File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
            File dest = new File("E:\\screenshot\\scrrenshot.jpg");
            FileHandler.copy(scr, dest);
	}

}
