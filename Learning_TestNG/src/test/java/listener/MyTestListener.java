package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener
{

	public void onTestStart(ITestResult result) {
	
		System.out.println("Test started.....");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed...");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed...");
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
