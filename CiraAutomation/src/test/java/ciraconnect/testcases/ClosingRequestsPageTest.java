package ciraconnect.testcases;

import org.testng.annotations.Test;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class ClosingRequestsPageTest  extends TestBase{

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Closing Requests Page Title", groups = { "Smoke" })
	public void VerifyclosingRequeststURL() {

		LoggerManager.info("Verifying Closing Request Page Title");

		closingRequestsPage = loginPage.verifyClosingRequestsPage(username, password);
		closingRequestsPage.ClosingRequestspageLanding();
	}

	@Test(priority = 1, description = "Verify Fulfill Compact On Option", groups = { "Functional" })
	public void verifyFulfillCompactOnOption() 
	{

		closingRequestsPage.verifyFulfillCompactOn();
	}

	@Test(priority = 2, description = "Verify Fulfill Compact Off Option", groups = { "Functional" })
	public void verifyFulfillCompactOffOption() 
	{

		closingRequestsPage.verifyFulfillCompactOff();
	}

	@Test(priority = 3, description = "Verify Action Transfer to Collection", groups = { "Functional" })
	public void verifyActionTransfertoCollectionsOption() 
	{

		closingRequestsPage.verifyActionTransfertoCollections();
	}

	@Test(priority = 4, description = "Verify Action Transfer to Processing", groups = { "Functional" })
	public void verifyActionTransfertoProcessingOption() 
	{

		closingRequestsPage.verifyActionTransfertoProcessing();
	}

	@Test(priority = 5, description = "Verify Action Transfer to Transition", groups = { "Functional" })
	public void verifyActionTransfertoTransitionOption() 
	{

		closingRequestsPage.verifyActionTransfertoTransition();
	}

	@Test(priority = 6, description = "Verify Assign Property", groups = { "Functional" })
	public void verifyActionAssignPropertyOption() 
	{

		closingRequestsPage.verifyActionAssignProperty();
	}

	@Test(priority = 7, description = "Verify Action cancle request", groups = { "Functional" })
	public void ActionCancleRequestOption() 
	{

		closingRequestsPage.ActionCancleRequest();
	}


	@Test(priority = 8, description = "Verify Assign Property", groups = { "Functional" })
	public void VerifySwitchingTabs() 
	{

		closingRequestsPage.SwitchingTabs();
	}


	@Test(priority = 9, description = "Verify Search tab", groups = { "Functional" })
	public void VerifySearchTab() 
	{

		closingRequestsPage.SearchTab();
	}

	@Test(priority = 10, description = "Verify Search Button", groups = { "Functional" })
	public void verifySearchButton() 
	{

		closingRequestsPage.searchButton();
	}


	  @Test(priority = 11, description = "Verify Request Type", groups = {
	  "Functional" }) public void VerifyRequestTypeFilter() {
	  
	  closingRequestsPage.RequestTypeFilter(); }
	  
	  
	  @Test(priority = 12, description = "Verify Toolbar and Full Screen", groups =
	  { "Functional" }) public void VerifyToolBarFullScreen() {
	  
	  closingRequestsPage.ToolBarFullScreen(); }
	  
	 


}
