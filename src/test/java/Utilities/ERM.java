package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.ITestListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import TestBase.BaseClass;

public class ERM implements ITestListener{
	public ExtentSparkReporter ESR;    //UI report
	public ExtentReports EReport;   //common info report
	public ExtentTest ETest;    //entry data into report
	String repName;
	
	public void onStart(ITestContext context) {
		String timestamp=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
		repName="Test-Report-"+timestamp+".html";
		//set the Location of folder
		ESR=new ExtentSparkReporter(".\\Reports\\"+repName); //get 
		ESR.config().setDocumentTitle("Automation testing");
		ESR.config().setReportName("SwagLabs Test");                  //set
		ESR.config().setTheme(Theme.STANDARD);
		
		//Common Info
		EReport =new ExtentReports();
		EReport.attachReporter(ESR);
		EReport.setSystemInfo("Maven", "Eclipse");
		EReport.setSystemInfo("Tester","Suri");
		EReport.setSystemInfo("OS", "Windows 11");
		EReport.setSystemInfo("Browser", "Chrome");
		
	}
	public void onTestSuccess(ITestResult result) {
		ETest=EReport.createTest(result.getName());//Creating a Entry in Report
		ETest.log(Status.PASS, "Test is Passed:"+result.getName());//Update the Info in the Report
		System.out.println("Test is Passed");
		try {
			String imgpath=new BaseClass().capture(result.getName());
			ETest.addScreenCaptureFromPath(imgpath);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void onTestFailure(ITestResult result) {
		ETest=EReport.createTest(result.getName());
		ETest.log(Status.FAIL, "Test is failed:"+result.getName());
		ETest.log(Status.FAIL, "Test is failed:"+result.getThrowable());//reason for failure
		try {
			String imgpath=new BaseClass().capture(result.getName());
			ETest.addScreenCaptureFromPath(imgpath);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void onTestSkipped(ITestResult result) {
		ETest=EReport.createTest(result.getName());
		ETest.log(Status.SKIP, "Test is skipped:"+result.getName());
		ETest.log(Status.SKIP, "Test is skipped:"+result.getThrowable());
		try {
			String imgpath=new BaseClass().capture(result.getName());
			ETest.addScreenCaptureFromPath(imgpath);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void onFinish(ITestContext context) {
		EReport.flush();
	}

}
