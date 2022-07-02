package kitewithexel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	@FindBy(id = "userid") private WebElement un;
	@FindBy(id = "password") private WebElement pwd;
	@FindBy(xpath = "//button[@type='submit']") private WebElement clickonloginbutton;
	 //const
	public KiteLoginPage( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//method
	public void username(String userid) 
	{
		un.sendKeys(userid);
	}
	public void password(String passw) {
	pwd.sendKeys(passw);
	}
	public void clickonlogin() {
		clickonloginbutton.click();
	}

}
