package ciraconnect.testcases;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class PreferencesPageTest extends TestBase {

	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");
	
	
	@Test(priority = 0, description = "Verify Preferences", groups = { "Functional" })
	public void HomePageLanding() throws AWTException {
		LoggerManager.info("Verifying Preferences");
		
		//preferencePage = loginPage.verifyPreferencesPage(username, password);
		preferencePage.HomePageLanding();

	}
	
	
	@Test(priority = 1, description = "Verify Preferences", groups = { "Functional" })
	public void clickPreferences() throws AWTException {
		LoggerManager.info("Verifying Preferences");
		
		preferencePage.clickPreferences();

	}
	
}
