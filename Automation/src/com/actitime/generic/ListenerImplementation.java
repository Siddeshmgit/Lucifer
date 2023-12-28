package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener{
	@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+" method has got passed");
	}@Override
	public void onTestFailure(ITestResult result) {
//It is used to get the name of the current test method that has got executed
//To take the screenshot in multiple names we will get the names of the methods
		String res = result.getName();
		Reporter.log(res+" method has got failed");
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
//		String date = LocalDateTime.now().toString().replace(':', '-');
//		System.out.println(date);
		File dest=new File("./screenshots/"+res+".png");
		try {
			FileUtils.copyFile(temp, dest);
		} catch (IOException e) {	}
	}@Override
	public void onTestSkipped(ITestResult result) {
		String res = result.getName();
		Reporter.log(res+" method has got skipped");
	}@Override
	public void onTestStart(ITestResult result) {
	}@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}@Override
	public void onStart(ITestContext context) {
	}@Override
	public void onFinish(ITestContext context) {
	}
	
}
