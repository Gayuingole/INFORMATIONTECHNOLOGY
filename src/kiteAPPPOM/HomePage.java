package kiteAPPPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//span[@class='user-id']")private  WebElement userid;
	@FindBy(css = "a[target='_self']") private WebElement clicklogout;
 //const
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//method
	public String actualuserid() 
	{
		 String actualuser = userid.getText();
		return actualuser;
		
	}
	public void validateuserid(String expectedusername) {
		String actualuserid = userid.getText();
		String expecteduserid = expectedusername;
		if(actualuserid.equals(expecteduserid)) 
		{
			System.out.println("userid matching tc is passed");
		}
		else {
			System.out.println("userid is not matching tc is failed");
		}
		
	}
	public void logout() throws InterruptedException {
		userid.click();
		Thread.sleep(400);
		clicklogout.click();
	}
	
}
