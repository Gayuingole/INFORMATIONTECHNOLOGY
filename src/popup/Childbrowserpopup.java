package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childbrowserpopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.name("NewWindow")).click();
		Thread.sleep(1000);
		String idofmainpage = driver.getWindowHandle(); //for one window
		System.out.println("main page id"+idofmainpage);
		Set<String> allwindows = driver.getWindowHandles();//formultiple window
		//set need to convert into arraylist
		ArrayList<String> ar= new ArrayList<>(allwindows);
		for(int i=0; i<=ar.size()-1;i++)
		{
			System.out.println(ar.get(i));
		}
		//String MainPageId =ar.get(0); // we store main page  id 0 index of main page
		String childpageid = ar.get(1);// we store child  page index of 1
		driver.switchTo().window(childpageid);// here we change main page focous to child page
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.id("the7-search")).sendKeys("selenium");
		driver.findElement(By.xpath("//a[@class='submit']"));
				//if name id not present we get xpath
        
	}

}
