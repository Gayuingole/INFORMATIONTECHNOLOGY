package webtable;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tableeg1 {

	public static void main(String[] args) {
	 System.setProperty("Webdriver.chrome.driver", "E:\\chromedriver.exe");
	 WebDriver driver = new ChromeDriver();
	 driver.get("");
	 driver.manage().window().maximize();

	}

}
