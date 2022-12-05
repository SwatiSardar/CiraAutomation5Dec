package ciraconnect.testcases;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class WorkOrdersPageTest extends TestBase{
	
	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");
	
	@Test(priority = 0, description = "Verify Work Orders Page Title", groups = { "Smoke" })
	public void verifyWorkOrdersPageURL() {

		LoggerManager.info("Verifying Work Orders Page Title");

		//workOrdersPage = loginPage.verifyWorkOrdersPage(username, password);
		workOrdersPage.WorkOrdersPageLanding();

	}
	
///   dependsOnMethods = { "verifyWorkOrdersPageURL" }   // we can use this also
	
	@Test(priority = 1, description = "Verify Toolbar - Full screen option click", groups = { "Functional" })
	public void verifyToolbarFullScreenOption() 
	{
		workOrdersPage.ToolBarFullScreen();
	}

	@Test(priority = 2, description = "Verify Toolbar - Normal screen option click", groups = { "Functional" })
	public void verifyToolbarNormalScreenOption() 
	{
		workOrdersPage.ToolBarNormalScreen();
	}
	
	@Test(priority = 3, description = "Verify tab Switching", groups = { "Functional" })
	public void verifySwitchtab() 
		{
			workOrdersPage.Switchtab();
		}
	
	@Test(priority = 4, description = "Verify Closed Work Orders In Past days textbox", groups = { "Functional" })
	public void verifyClosedDaysTextbox() 
	{
		workOrdersPage.ClosedDaysTextbox();
	}
	
	@Test(priority = 5, description = "Verify Toolbar - Expand icon click", groups = { "Functional" })
	public void verifyExpandOption() {
		assertTrue(workOrdersPage.expandOptionClick(),"Expand icon is not clicked");
	}
	
	@Test(priority = 6, description = "Verify Toolbar - collapsed icon click", groups = { "Functional" })
	public void verifyCollapseOption() {
		assertTrue(workOrdersPage.collapseOptionClick(),"Collapse icon is not clicked");
	}
	
	@Test(priority = 7, description = "Verify Toolbar - Column Chooser icon click", groups = { "Functional" })
	public void verifyColumnChooserOption() {
		assertTrue(workOrdersPage.columnChooserClick(),"Column Chooser is not selected");
	}
	
	@Test(priority =8, description = "Verify that View Edit Work Order and close", groups= {" Functional" })
	public void verifyViewEditCloseWorkOrderClick()
	{
		workOrdersPage.ViewEditCloseWorkOrderClick(); //Open and Close
	}
	
	@Test(priority =9, description = "Verify that View Edit Work Order", groups= {" Functional" })
	public void verifyViewEditWorkOrder()
	{
		workOrdersPage.ViewEditWorkOrder(); //Save and Close
	}
	
	@Test(priority =10, description = "Verify that View Edit Work Order and save", groups= {" Functional" })
	public void verifyViewEditSaveWorkOrderClick()
	{
		workOrdersPage.ViewEditSaveWorkOrderClick(); //Save
	}
	

	@Test(priority = 11, description = "Verify Work Authorization", groups = { "Functional" })
	public void verifyManageWorkAuthorization() 
	{
		workOrdersPage.verifyManageWorkAuthorization();
	}
	
	@Test(priority =12, description = "Verify that Manage Praposal PopUp", groups= {" Functional" })
	public void VerifyManageProposal() 
	{
		workOrdersPage.ManageProposal();
	}
	
	@Test(priority =13, description = "Verify the Chanage Status", groups= {" Functional" })
	public void verifychangeStatus()
	{
		workOrdersPage.changeStatus();
	}
	
	
	@Test(priority = 14, description = "Verify Manage Task References Popup", groups = { "Functional" })
	public void VerifyManageTaskReferences() 
	{
		workOrdersPage.manageTaskReferences();

	}
	
	@Test(priority =15, description = "Verify that Add Work Oreders and Close", groups= {" Functional" })
	public void verifycloseWorkOrder()
	{
		workOrdersPage.closeAddWorkOrder();
	}
	
	//@Test(priority = 16, description = "Verify Add New Work Order button click", groups = { "Functional" })
		public void VerifyAddNewWorkOrderClick() 
		{
			workOrdersPage.AddNewWorkOrderClick();
		}
	

	
}
