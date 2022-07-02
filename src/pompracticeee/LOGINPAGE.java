package pompracticeee;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LOGINPAGE {
	// for variables or datamember
      @FindBy(id = "userid")private WebElement un;
      @FindBy(id = "password")private  WebElement pwd;
      @FindBy(xpath = "//button[@type='submit']") private WebElement submitbutton;
     
       //constructor
      public LOGINPAGE( WebDriver driver) {
    	  PageFactory.initElements(driver, this);
      }
      //for method
      public void username() {
    	  un.sendKeys("ELR321");
      }
      public void password() {
    	  pwd.sendKeys("Dhana1111");
      }
      public void clickonbutton() {
    	 submitbutton.click(); 
      }
	   
}
