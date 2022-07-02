package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pinpage {

	@FindBy(xpath="//input[@id='pin']")private WebElement pin1;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continuebutton;
		
	
//constructor
public Pinpage(WebDriver driver) {
	PageFactory.initElements(driver, this);
     }

//method
public void sendpin() {
	pin1.sendKeys("982278");
}
public void clickoncontinue() {
	continuebutton.click();
}
}