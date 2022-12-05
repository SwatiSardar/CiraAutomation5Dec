package ciraconnect.testcases;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ciraconnect.pages.FulfillmentQueuePage;
import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class FulfillmentQueuePageTest extends TestBase{

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Fulfillment Queue Page Title", groups = { "Smoke" })
	public void verifyFulfillmentQueuePageURL() 
	{
		LoggerManager.info("Verifying Fulfillment Queue Page Title");
		
		fulfillmentQueuePage = loginPage.verifyFulfillmentQueuePage(username, password);
		fulfillmentQueuePage.FulfillmentQueuePageLanding();
		
	}

	@Test(priority = 1, description ="Verify Toolbar - Full screen option click", groups = { "Functional" })
	public void verifyToolbarFullScreenOption() 
	{
		fulfillmentQueuePage.ToolBarFullScreen(); 
	}

	@Test(priority = 2, description ="Verify Toolbar - Normal screen option click", groups = { "Functional" })
	public void verifyToolbarNormalScreenOption() 
	{
		fulfillmentQueuePage.ToolBarNormalScreen(); 
	}

	@Test(priority = 3, description = "Verify Toolbar - Expand icon click",groups = { "Functional" })
	public void verifyExpandOption() 
	{
		assertTrue(fulfillmentQueuePage.expandCollapseOptionClick()	,"Expand icon is not clicked"); 
	}

	@Test(priority = 4, description ="Verify Toolbar - Column Chooser icon click", groups = { "Functional" })
	public void verifyColumnChooserOption() 
	{
		assertTrue(fulfillmentQueuePage.columnChooserClick(),"Column Chooser is not selected"); 
	}

	@Test(priority = 5, description = "Verify tab Switching", groups = {"Functional" })
	public void verifySwitchtab() 
	{
		fulfillmentQueuePage.Switchtab(); 
	}

	@Test(priority = 6, description = "Verify Action Button save  ", groups = { "Functional" })
	public void verifyactionSaveClick() 
	{
		fulfillmentQueuePage.actionSaveClick();
	}

	@Test(priority =7, description = "Verify that View Edit Action close button", groups= {" Functional" })
	public void verifyActionCloseButton() 
	{
		fulfillmentQueuePage.verifyActionCloseButton(); 
	}

	@Test(priority = 8, description = "Verify Action Button SAVE and Close ", groups = { "Functional" })
	public void verifyactionSaveCloseClick() 
	{
		fulfillmentQueuePage.actionSaveCloseClick();
	}

	@Test(priority = 9, description = "Verify Refresh Queue ", groups = { "Functional" })
	public void verifyrefreshQueuebutton() 
	{
		fulfillmentQueuePage.refreshQueuebutton();
	}

	@Test(priority = 10, description = "Verify Documents tab ", groups = { "Functional" })
	public void verifyActionDocumenttabclick() 
	{
		fulfillmentQueuePage.ActionDocumenttabclick();
	}
		
	@Test(priority = 11, description = "Verify Action completion Job tab ", groups = { "Functional" })
	public void verifyActionCompletionttabclick() 
	{
		fulfillmentQueuePage.ActionCompletionttabclick();
	}

	@Test(priority = 12, description = "Verify Add Job save and close", groups ={ "Functional" }) 
	public void verifyAddJobSaveAndCloseButton() 
	{
		fulfillmentQueuePage.AddJobSaveAndCloseButton(); 
	}

	@Test(priority = 13, description = "Verify Add Completion Job tab ", groups = { "Functional" }) 
	public void verifyAddCompletionJobtab() 
	{
		fulfillmentQueuePage.AddCompletionJobtab(); 
	}

	@Test(priority = 14, description = "Verify Closed Jobs Search Button ", groups = { "Functional" })
	public void verifyClosedJobsSearchButton() 
	{
		fulfillmentQueuePage.ClosedJobsSearchButton();
	}

	@Test(priority = 15, description = "Verify Add Completed Job Save & Add Documents button click ", groups =
		{ "Functional" }) 
	public void verifyAddCompletedJobbuttonSaveandAddDocuments() 
	{
		fulfillmentQueuePage.AddCompletedJobbuttonSaveandAddDocuments(); 
	}
	
		@Test(priority = 16, description = "Verify Add Completed Job Close button click ", groups ={ "Functional" }) 
	public void verifyAddCompletedJobbuttonclick() 
	{
		fulfillmentQueuePage.AddCompletedJobbuttonclick(); 
	}


}
