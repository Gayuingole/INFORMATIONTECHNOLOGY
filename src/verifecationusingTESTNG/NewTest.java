package verifecationusingTESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void mymethod1() {
	  boolean b= true;
	  boolean c= false;
	    
	  
	Assert.assertTrue(c, "value is true tc is failed");
	Reporter.log("value is false tc is passed ", true);  
  }
}
