package practicepopup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childwindowpopuppractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.id("newWindowBtn")).click();
		 Set<String> pageid = driver.getWindowHandles();
		 ArrayList<String>ar=new ArrayList<>(pageid);
		 for(int i=0; i<=ar.size()-1;i++) {
			 System.out.println(ar.get(i));
		 }
		 String mainpageid = ar.get(0); //mainpageid
		String childwindowid = ar.get(1); //choldpageid
		 //now we will switch focous to childwindow
		driver.switchTo().window(childwindowid);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Gayatri");
		driver.findElement(By.id("lastName")).sendKeys("ingole");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));
		driver.close();
		driver.switchTo().window(mainpageid);
	
	}
}
