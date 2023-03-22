package test_ng;




import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import screenshot.Take;

public class Listener_Practice extends Amazon_Listener implements ITestListener {
   
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case "+result.getMethod().getMethodName()+" has been started");
	}
     
	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case"
		+result.getMethod().getMethodName()+"has been passed");
	}

	@Override
	public void onTestFailure(ITestResult result){
		System.out.println("Test case "+result.getMethod().getMethodName()+" has been failed");	
		try {
			Take.getscreen(driver,result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case"+result.getMethod().getMethodName()+" has been skipped");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test tag"+context.getName()+" has been started ");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag"+context.getName()+" has been finished ");;
	}

}
