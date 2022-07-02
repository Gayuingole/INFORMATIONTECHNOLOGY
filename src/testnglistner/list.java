package testnglistner;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class list implements ITestListener {

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("ts is sucess", true);
		ITestListener.super.onTestSuccess(result);
	}
	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("tc is failed",true);
		ITestListener.super.onTestFailure(result);
	}
	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("tc is skipped",true);
		ITestListener.super.onTestSkipped(result);
	}
	
}
