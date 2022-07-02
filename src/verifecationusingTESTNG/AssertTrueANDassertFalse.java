package verifecationusingTESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueANDassertFalse {
  @Test
  public void mymethod() {
	  boolean a= true;
	  boolean b= false;
	  Assert.assertFalse(b, "value is true TC is failed");
	  Reporter.log("value is false TC is passed");
	  
  }
}
