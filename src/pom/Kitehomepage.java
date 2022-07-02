package pom;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Kitehomepage {
	//datamembers or variables
    @FindBy(className = "user-id")private WebElement userid;
    @FindBy(xpath = "//a[@target='_self']")private WebElement logoutbutton;
    //contructor
    public Kitehomepage(WebDriver driver) {
    	PageFactory.initElements(driver, this);
    }
    //method
    public void validateuserid() {
    	String actualuserid=userid.getText();
    	String expecteduserid="ELR321";
    	if(actualuserid.equals(expecteduserid)) {
    		System.out.println("user Id is matching testcase is pass");;
    	}
    	else {
    		System.out.println("user ID is not matching testcase is fail");
    	}
    	
    }
    public void clickonlogoutbutton() throws InterruptedException {
    	userid.click();
    	Thread.sleep(1000);
    	logoutbutton.click();
    }
    
    
}
