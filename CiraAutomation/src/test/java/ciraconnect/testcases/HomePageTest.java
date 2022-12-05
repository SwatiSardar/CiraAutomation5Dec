package ciraconnect.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;

public class HomePageTest extends TestBase {

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");
	
	
	@Test(priority = 1, description = "Verify Owner", groups = { "Functional" })
	public void verifyOwnerSearch() {
		
		homePage = loginPage.verifyHomePage(username, password);
		homePage.clickOwnerSearch();

	}
	
	@Test(priority = 2, dependsOnMethods = "verifyOwnerSearch", description = "Verify Community", groups = { "Functional" })
	public void verifyCommunitySearch() {
		
		homePage.clickCommunitySearch();

	}
	
	
}
