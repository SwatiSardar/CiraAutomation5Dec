package ciraconnect.testcases;

import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ciraconnect.pages.FulfillmentQueuePage;
import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class BoardApprovalsPageTest extends TestBase{

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Board Approval Page Title", groups = { "Smoke" })
	public void verifyBoardApprovalsURL() 
	{
		LoggerManager.info("Verifying Board Approval Page Title");

		boardApprovalsPage = loginPage.verifyBoardApprovalsPage(username, password);
		boardApprovalsPage.BoardApprovalsPageLanding();
	}
	
	
	  @Test(priority = 1, description = "Verify Toolbar Full Screen Option", groups
	  = { "functional" }) public void verifyToolbarFullScreenOption() {
	  boardApprovalsPage.ToolBarFullScreen(); }
	  
	  @Test(priority = 2, description = "Verify Toolbar Normal Screen option",
	  groups = { "functional" }) public void verifyToolBarNormalScreenOption() {
	  boardApprovalsPage.ToolBarNormalScreen(); }
	  
	  @Test(priority = 3, description = "Verify Acion For Multiple Selection", groups = { "functional" })
	  public void verifyAcionForMultipleSelection() 
	  {
		  boardApprovalsPage.AcionForMultipleSelection();
	  }

	  @Test(priority = 4, description = "Verify View AR Collections Details", groups = { "functional" })
	  public void verifyViewARCollectionsDetails() 
	  {
		  boardApprovalsPage.ViewARCollectionsDetails();
	  }

	  @Test(priority = 5, description = "Verify Architectural View ACC Details", groups = { "functional" })
	  public void verifyArchitecturalViewACCDetails() 
	  {
		  boardApprovalsPage.ArchitecturalViewACCDetails();
	  }

	  @Test(priority = 6, description = "Verify Invoice View APWorkflowDetails", groups = { "functional" })
	  public void verifyInvoiceViewAPWorkflowDetails() 
	  {
		  boardApprovalsPage.InvoiceViewAPWorkflowDetails();
	  }

	  @Test(priority = 7, description = "Verify Architectural View AccDetails", groups = { "functional" })
	  public void verifyclosedtabArchitecturalViewACCDetailsbutton() 
	  {
		  boardApprovalsPage.closedtabArchitecturalViewACCDetailsbutton();
	  }

	  @Test(priority = 8, description = "Verify Invoice View Details", groups = { "functional" })
	  public void VerifyclosedtabInvoiceviewDetails() 
	  {

		  boardApprovalsPage.closedtabInvoiceviewDetails();
	  }

	  @Test(priority = 9, description = "Verify Switching tabs Open tab and Closed tab", groups = { "functional" })
	  public void verifySwitchTab() 
	  {
		  boardApprovalsPage.SwitchTab();
	  }

	  @Test(priority = 10, description = "Verify Exapnd All Option", groups = { "functional" })
	  public void verifyExpandOptionClick() 
	  {


		  boardApprovalsPage.expandOptionClick();
	  }

	  @Test(priority = 11, description = "Verify Column Chooser Option", groups = { "functional" })
	  public void verifyColumnChooserOption() 
	  {


		  boardApprovalsPage.columnChooserClick();
	  }
	  
}
