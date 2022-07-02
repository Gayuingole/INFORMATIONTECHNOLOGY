package testnglistner;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


import kiteAPPBASECLASS.BaseclassListner;



public class LISTNERFORFAILTESTCASE implements ITestListener
{
    BaseclassListner b = new BaseclassListner();
//ontestpass
//ontestfail
//ontestskip
//ontestsucess (u can use any method accor to you //require,

	@Override
	public void onTestFailure(ITestResult result)
	{
		 String TCname = result.getName();
		try {
		  b.takeScreenshot(TCname);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("testcase is sucess",true);
		ITestListener.super.onTestSuccess(result);
		Reporter.log("sucess tc name is"+result.getName(),true);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("tc is skipped please cheked dependent tc");
		Reporter.log("skipped tc  is"+result.getName(),true);
		ITestListener.super.onTestSkipped(result);
		
	}

}
