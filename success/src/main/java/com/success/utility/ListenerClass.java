package com.success.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.success.action.ActionsClass;
import com.success.page.BaseClass;

public class ListenerClass extends ExtentManager implements ITestListener {
	
	
	
		
		public void onTestStart(ITestContext tr) {
			test=extent.createTest(tr.getName());
			test.createNode(tr.getName());
		}
		
	public void onTestSuccess(ITestResult tr) {
		test=extent.createTest(tr.getName());
		if (tr.getStatus()==ITestResult.SUCCESS) {
		test.log(Status.PASS , MarkupHelper.createLabel(tr.getName(), ExtentColor.GREEN));
		}
		
	}

	public void onTestSkipped(ITestResult tr) {
		test=extent.createTest(tr.getName());
		if (tr.getStatus()==ITestResult.SKIP) {
		test.log(Status.SKIP, MarkupHelper.createLabel(tr.getName(), ExtentColor.ORANGE));
		
		
	}}
	public void onTestFailure(ITestResult tr) {
		test=extent.createTest(tr.getName());
		if(tr.getStatus()==ITestResult .FAILURE) {
		test.log(Status.FAIL , MarkupHelper.createLabel(tr.getName(), ExtentColor.RED));
		
		 String screnshotpath;
		try {
			screnshotpath = ActionsClass.captureScreen(BaseClass.getDriver(),tr.getName() );
			File f=new File(screnshotpath );
			if (f.exists()) {
				test.fail("Screenshot is below:" + MediaEntityBuilder.createScreenCaptureFromPath(screnshotpath));
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		}}
		
		public void onTestFinish (ITestContext tr) {
		
			test=extent.createTest(tr.getName());
			test.createNode(tr.getName());
		
		
	}






	}





