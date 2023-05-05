package Runner;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

//import com.relevantcodes.extentreports.ExtentReports;
//import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/Feature", glue = { "StepDefination",
		"hooks" }, dryRun = false, monochrome = true, 
//		tags = "@Test1 or @Test2",
		tags = "@Test6",
//		plugin = { "pretty", "html:cucumber-reports/reports_html.html", "json:cucumber-reports/report_json.json" },
		plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class MyRunner extends AbstractTestNGCucumberTests {
// this will remains empty

}


//	
//	// EXTEND REP
//	public static ExtentReports extent;
//	public static ExtentTest extentTest;
//	public static AppiumDriverLocalService service;
//
//	@BeforeSuite
//	public void setup() {
//		service = AppiumDriverLocalService.buildDefaultService();
//		service.start();
//		extent = new ExtentReports("./reports/ExtentReport.html");
//	}
//
//	@BeforeMethod
//	public void startTest(Method name) {
//		String testname = name.getName();
//		extentTest = extent.startTest(testname);
//	}
//
//	@AfterMethod
//	public void atestCaseResult(ITestResult result) throws IOException {
//		if (result.getStatus() == ITestResult.FAILURE) {
//
//			extentTest.log(LogStatus.FAIL, "Test Case Failed ");
//		} else {
//			if (result.getStatus() == ITestResult.SUCCESS) {
//				extentTest.log(LogStatus.PASS, "Test case passed successfully");
//			}
//		}
//	}
//
//	@AfterMethod
//	public void endTest() {
//		extent.endTest(extentTest);
//	}
//
//	@AfterSuite
//	public void Teardown() {
//		service = AppiumDriverLocalService.buildDefaultService();
//		service.stop();
//		extent.flush();
//		extent.close();
//	}
