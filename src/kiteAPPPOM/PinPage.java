package kiteAPPPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
       //datamembers or variables
		@FindBy(id = "pin") private WebElement pin;
		
		@FindBy(xpath = "//button[@type='submit']") private WebElement continuebutton;
		 //constructor
		public PinPage(WebDriver driver) 
		{
			PageFactory.initElements(driver, this);
		}
		//method
		public void pinbutton(String Pin) 
		{
			pin.sendKeys(Pin);
		}
		public void continueb() 
		{
			continuebutton.click();
		}

	}


