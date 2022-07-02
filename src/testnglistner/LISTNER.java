package testnglistner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class LISTNER implements ITestListener
//ontestpass
//ontestfail
//ontestskip
//ontestsucess (u can use any method accor to you //require,
{
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log("testcase is failed,screenshot taken",true);
		ITestListener.super.onTestFailure(result);
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("testcase is sucess",true);
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("tc is skipped please cheked dependent tc");
		ITestListener.super.onTestSkipped(result);
	}

}
