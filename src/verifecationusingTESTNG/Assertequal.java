package verifecationusingTESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assertequal {
	@Test
	  public void method2() {
		  String m ="pune";
		  String n= "pune";
		  String o= "nagpur";
		  Assert.assertEquals(m,n,"Strings are not matching tc is failed ");
		  Reporter.log("Strings are  matching TC is PASSED", true);
	  }
}
