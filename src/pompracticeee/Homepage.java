package pompracticeee;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
   
	@FindBy(xpath = "//span[@class='user-id']")private WebElement userid;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	 //constructor
	public Homepage( WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//method
	public void validateuserid() {
		 String actualuserid = userid.getText();
		 String expecteduserid = "ELR321";
		 if(actualuserid.equals(expecteduserid)) {
			 System.out.println("userid is correct test case is pass");
			 
		 }
		 else {
			 System.out.println("test case is fail");
		 }}
		 public void logout() throws InterruptedException {
			userid.click();
			Thread.sleep(1000);
			logout.click();
		 }
	}
	
	

