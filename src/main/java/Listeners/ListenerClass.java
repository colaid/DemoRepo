package Listeners;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
//import com.relevantcodes.extentreports.ExtentTest;

import resources.base;
import utilities.ExtentReporter;

public class ListenerClass extends base implements ITestListener {
	WebDriver driver=null;
	
	ExtentReports extentReport = ExtentReporter.getExtentReport();
	public ExtentTest extentTest;
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		 extentTest = extentReport.createTest(result.getName()+" execution started");

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		extentTest.log(Status.PASS,"Test Passed");

		// TODO Auto-generated method stub


	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub

		//WebDriver driver = null;
		extentTest.fail(result.getThrowable());

		
		String testMethodName = result.getMethod().getMethodName();
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			takeScreenshot(testMethodName,driver);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		/*try {
			takeScreenshot(testMethodName);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
		extentReport.flush();
	}

}
