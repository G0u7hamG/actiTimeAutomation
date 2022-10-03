package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import generic.baseTest;

public class myListener implements ITestListener{


	public void onTestFailure(ITestResult result) {
		String scriptName=result.getMethod().getMethodName();
		baseTest.actionUtil.captureScreenshot(scriptName);
	}
	
	
}
