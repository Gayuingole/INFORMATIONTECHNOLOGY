package softassert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualsAndASSERTNOTEQUALS {
	SoftAssert soft = new SoftAssert();
  @Test
  public void myMethod() {
	  String a= "pune";
	  String b= "pune";
	  String c="Mumbai";
	  soft.assertEquals(a, c ,"test case is failed both not equal");
	  Reporter.log("testcase is passes both are equal", true);
	  soft.assertEquals(a, b,"test case is failed both are equal");
	  Reporter.log("test case is passed both are equals", true);
  }
  @Test
  public void myMethod1() {
	  boolean a = true;
	  soft.assertTrue(a, "a is not true testcase is failed");
	  soft.assertAll();
}}
