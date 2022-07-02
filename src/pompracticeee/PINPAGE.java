package pompracticeee;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PINPAGE {

	@FindBy(xpath = "//input[@label='PIN']")private WebElement pin;
	@FindBy(xpath = "//button[@type='submit']")private WebElement continuebutton;
     
	//constructor
	public PINPAGE( WebElement driver) {
		PageFactory.initElements(driver, this);
	}
	//method
	public void pinn() {
		pin.sendKeys("982278");
	}
	public void continueb() {
		continuebutton.click();
	}
	}


