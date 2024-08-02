package testPackage;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	
	@Override
	public void onTestStart(ITestResult result) {
		
		System.out.println("All our test cases are started");
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println("All our test cases are passed");
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("All our test cases are Failed");
	}
	
	@Override
	public void onTestSkipped(ITestResult result) {
		
		System.out.println("All our test cases are skipped");
	}
	
	@Override
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		    
		 
	}

		  
     public void onFinish (ITestResult result) {
		    
	}
}
