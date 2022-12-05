package ciraconnect.testlisteners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.LoggerManager;

public class TestListener implements ITestListener {

	public void onStart(ITestContext context) {

		LoggerManager.debug("*** Test Suite " + context.getName() + " started ***");
	}

	public void onFinish(ITestContext context) {

		LoggerManager.debug(("*** Test Suite " + context.getName() + " ending ***"));

		// this.sendTestClassStatus(context);

	}

	public void onTestStart(ITestResult result) {

		LoggerManager.debug(("*** Running test method " + result.getMethod().getMethodName() + "..."));

	}

	public void onTestSuccess(ITestResult result) {

		LoggerManager.debug("*** Executed " + result.getMethod().getMethodName() + " test successfully...");

		// this.sendTestMethodStatus(result, "PASS");

	}

	public void onTestFailure(ITestResult result) {

		LoggerManager.debug("*** Test execution " + result.getMethod().getMethodName() + " failed...");

		try {

			// String screenShotPath = TestBase.captureScreenshot(TestBase.driver, "Error_"); // .captureScreenshot (TestBase.driver, "Error_");
			LoggerManager.debug("*** Executed " + result.getMethod().getMethodName() + " test Failed...");

			 //TestBase.test.fail("Snapshot below : " +
			// TestBase.test.addScreenCaptureFromPath(screenShotPath));

		} catch (Exception e) {
			LoggerManager.debug("=========== Error while taking Screenshot : ===========");
			e.printStackTrace();
		}

		// this.sendTestMethodStatus(result, "FAIL");

	}

	public void onTestSkipped(ITestResult result) {

		LoggerManager.debug("*** Test " + result.getMethod().getMethodName() + "skipped...");

		// this.sendTestMethodStatus(result, "SKIPPED");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		LoggerManager.debug("*** Test failed but within percentage % " + result.getMethod().getMethodName());

	}

	/*
	 * private void sendTestMethodStatus(ITestResult iTestResult, String status) {
	 * 
	 * Point point =
	 * Point.measurement("testmethod").time(System.currentTimeMillis(),
	 * TimeUnit.MILLISECONDS) .tag("testclass",
	 * iTestResult.getTestClass().getName()).tag("name", iTestResult.getName())
	 * .tag("description", iTestResult.getMethod().getDescription()).tag("result",
	 * status) .addField("duration", (iTestResult.getEndMillis() -
	 * iTestResult.getStartMillis())).build();
	 * 
	 * ResultSender.send(point); }
	 * 
	 * private void sendTestClassStatus(ITestContext iTestContext) {
	 * 
	 * Point point = Point.measurement("testclass").time(System.currentTimeMillis(),
	 * TimeUnit.MILLISECONDS) .tag("name",
	 * iTestContext.getAllTestMethods()[0].getTestClass().getName())
	 * .addField("duration", (iTestContext.getEndDate().getTime() -
	 * iTestContext.getStartDate().getTime())) .build(); ResultSender.send(point); }
	 */

}
