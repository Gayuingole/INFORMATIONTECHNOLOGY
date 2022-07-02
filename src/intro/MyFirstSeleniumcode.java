package intro;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumcode {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
          WebDriver driver = new ChromeDriver();
          driver.get("https://vctcpune.com/");
         // driver.close(); //to close the current tab of browser
         // driver.quit();  //multiple tabs get quite or  (close)
          driver.manage().window().maximize(); //usedfor maximize
         // driver.manage().window().minimize(); //used for minimize 
         // driver.navigate().to("https://www.facebook.com/"); //itused for navigate otherurl or page
         // driver.navigate().back(); //it used for to get in privious tab
         // driver.navigate().forward(); //it is used for to forward next tab
         // driver.navigate().refresh();  //it is used for refresh page
     
       System.out.println(driver.getTitle()); //it used to print title where we call method get  title here and driver is obj here
       // String title = driver.getTitle();
       // System.out.println("title is"+title);
       System.out.println(driver.getCurrentUrl());
	} 

}
