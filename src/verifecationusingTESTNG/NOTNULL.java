package verifecationusingTESTNG;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NOTNULL {
	@Test
	  public void method2() {
		  String m =null;
		  String n= "pune";
		  
		  Assert.assertNull(n,"value is null tc is failed ");
		  Reporter.log("value is not null tc is PASSED", true);
	  }
  }

