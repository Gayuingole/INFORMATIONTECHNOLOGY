package kiteAPPUTILITYCLASS;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;
//we dont write code of scrrenshot code using listner in utility
public class UtilitywithListner {
//	public class UtlityUsingPropertyfile {
//		public  static void takeScreenshot(WebDriver driver) throws IOException {
//			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			 String random = RandomString.make(3);
//			File destination = new File("E:\\screenshot\\takesscrrenshot"+random+".jpg");
//			FileHandler.copy(src, destination);
//	} 
		public static String DataFromProperty(String key) throws IOException 
		{
			Properties prop = new Properties();
			FileInputStream myprop = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\5thmarchbbatch\\myfile.properties");
		  prop.load(myprop);
		  String value = prop.getProperty(key);
		return value;
		}
		public static void implicitwait(WebDriver driver,int timeunit)
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeunit));
			 
}}

