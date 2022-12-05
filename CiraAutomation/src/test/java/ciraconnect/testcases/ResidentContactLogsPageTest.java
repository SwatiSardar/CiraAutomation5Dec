package ciraconnect.testcases;

import org.testng.annotations.Test;

import ciraconnect.pages.ResidentContactLogsPage;
import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class ResidentContactLogsPageTest  extends TestBase{

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify Resident Contact Logs", groups = { "Smoke" })
	public void verifyResidentContactLogsURL() 
	{

		LoggerManager.info("Verifying Resident Contact Logs Page Title");
		residentContactLogsPage = loginPage.verifyResidentContactLogsPage(username, password);
		residentContactLogsPage.ResidentContactLogsLanding();
	}
	
	  @Test(priority = 1, description = "Verify Community Alert icon", groups= { "functional" }) 
	  public void verifyCommunityAlerticon() 
	  {
		  residentContactLogsPage.CommunityAlerticon(); 
	  }
	  
	  @Test(priority = 2, description = "Verify Community Alert Historical Tab", groups= { "functional" }) 
	  public void verifyCommunityAlertHistoricalTab() 
	  {
		  residentContactLogsPage.CommunityAlertHistoricalTab(); 
	  }
	  
	  @Test(priority = 3, description = "Verify Community Alert Upcoming Tab", groups= { "functional" }) 
	  public void verifyCommunityAlertUpcomingTab() 
	  {
		  residentContactLogsPage.CommunityAlertUpcomingTab(); 
	  }
	  
	  @Test(priority = 4, description = "Verify Community Alert Add Community alert button", groups= { "functional" }) 
	  public void verifyCommunityAlertAddCommunityalertbutton() 
	  {
		  residentContactLogsPage.CommunityAlertAddCommunityalertbutton(); 
	  }
	  @Test(priority = 5, description = "Verify Community Alert Add Community alert button", groups= { "functional" }) 
	  public void verifyCommunityAlertAddCommunityalertpopupCancelbutton() 
	  {
		  residentContactLogsPage.CommunityAlertAddCommunityalertpopupCancelbutton(); 
	  }
	    
	 @Test(priority = 6, description = "Verify historical column filter", groups = { "functional" })
	  public void verifyHistoricalColumnFilter() 
	  {
		residentContactLogsPage.HistoricalColumnFilter();
	  }  
	  @Test(priority = 7, description = "Verify collections filter", groups = { "functional" })
	  public void verifyIssueColumn() 
	  {
		residentContactLogsPage.IssueColumn();
	  }
	  @Test(priority = 8, description = "Verify Account Status Balance History", groups= { "functional" }) 
	  public void verifyAccountStatusBalance_History() 
	  {
		  residentContactLogsPage.AccountStatusBalance_History(); 
	  }
	  @Test(priority = 9, description = "Verify collections filter", groups = { "functional" })
	  public void verifyCollection() 
	  {
		residentContactLogsPage.Collection();
	  } 
	  
	  
	 
}
