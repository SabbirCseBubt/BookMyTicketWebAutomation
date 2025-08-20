package com.makemttrip.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.makemytrip.base.BaseTest;
import com.makemytrip.util.TestUtil;

public class CustomListener extends BaseTest implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String methodName = result.getName();
        String logText = "<b>"+"Test Case: -"  + methodName.toUpperCase() + " Passed"+"</b>";
        Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
        test.log(Status.PASS, m);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName()+"Test Failed");
		String  Screenshotpath=TestUtil.getScreenshot();
		test.fail(result.getThrowable().getMessage(),MediaEntityBuilder.createScreenCaptureFromPath(Screenshotpath).build());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
		if (extent != null) {
            extent.flush();
        }
	}
	
	
	

}
