package verifecationusingTESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  @Test
  public void method1() {
	  String m ="pune";
	  String n= "pune";
	  String o= "nagpur";
	  Assert.assertNotEquals(m,n,"Strings are matching tc is failed ");
	  Reporter.log("Strings are not matching TC is PASSED", true);
  }
}
