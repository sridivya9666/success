package com.success.utility;


import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


	public class ExtentManager  {
		public static ExtentSparkReporter htmlreporter;
		public static ExtentReports extent;
		public ExtentTest test;
		
		public  static void setextent() {
			
			String timestamp = new SimpleDateFormat("yy.mm.dd.hh.mm.ss").format(new Date());
			String repName = "Test-Report-"+timestamp+".hmtl";
			htmlreporter=new ExtentSparkReporter(System.getProperty("user.dir")+"/test-output/extentTestReports/ " +repName);
			try {
				htmlreporter.loadXMLConfig(System.getProperty("user.dir")+"/extent-config.xml");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			
			
			extent= new ExtentReports();
			
			extent.attachReporter	(htmlreporter);
			extent.setSystemInfo("HostName","local host");
			extent.setSystemInfo("user","divya");
			extent.setSystemInfo("environment","QA");
			extent.setSystemInfo("ProjectName","MyStore");
			
			extent.setSystemInfo("system","window 10");
			
			//these are provided in xml report
		//	htmlreporter.config().setDocumentTitle("INetBanking");
		//	htmlreporter.config().setReportName("Functional test Report");
		//	htmlreporter.config().setTheme(Theme.DARK);
			}
		
	
		
		public  static void endextent() {
		
		extent.flush();
		
		
		
	}






	}





