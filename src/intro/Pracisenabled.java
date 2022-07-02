package intro;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Pracisenabled {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zee5.com/signin");
		Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.xpath("(//button[@type='button'])[6]"));
        boolean result = ele1.isEnabled();
        		System.out.println(result);
        		Thread.sleep(2000);
        driver.findElement(By.id("textField")).sendKeys("7777777777");
        if(ele1.isEnabled())
        {
        	System.out.println("login button is enabled");
        }
        else
        {
        	System.out.println("login button is disabled");
        }
        boolean result2 = ele1.isSelected();
        System.out.println(result2);
	}

}



