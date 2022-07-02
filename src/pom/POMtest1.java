package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMtest1 {
	
	//data members or variables
	@FindBy( id = "userid" )private WebElement un;
	@FindBy(id = "password") private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']")private WebElement loginbutton;
	
   //constructor
	public 	POMtest1( WebDriver driver) {
		PageFactory.initElements(  driver,this);
	}
	
	//METHOD
	public void username() {
		un.sendKeys("ELR321");
		}
	public void password() {
		pwd.sendKeys("Dhana1111");
	}
	public void clickonbutton() {
	    loginbutton.click();
	}
}
