package ciraconnect.testcases;

import static org.testng.Assert.assertTrue;

import java.awt.AWTException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import ciraconnect.testbase.TestBase;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;

public class InternalTasksPageTest extends TestBase {
	String username = EnvironmentConfig.environmentSetup().get("USERNAME");
	String password = EnvironmentConfig.environmentSetup().get("PASSWORD");

	@Test(priority = 0, description = "Verify InternalTaskPage Title", groups = { "Smoke" })
	public void verifyInternalTasksPageURL() {

		LoggerManager.info("Verifying Internal Task Page Title");

		internalTasksPage = loginPage.verifyInternalTaskPage(username, password);
		internalTasksPage.InternalTaskPageLanding();

	}

	@Test(priority = 1, description = "Verify Help Button", groups = { "Functional" })
	public void verifyHelpInternalTask() {

		internalTasksPage.helpInternalTask();

	}

	@Test(priority = 2, description = "Verify Toolbar - Column Chooser icon click", groups = { "Functional" })
	public void verifyColumnChooserOption() {
		assertTrue(internalTasksPage.columnChooserClick(), "Column Chooser is not selected");
	}

	@Test(priority = 3, description = "Verify Toolbar - Full screen option click", groups = { "Functional" })
	public void verifyToolbarFullScreenOption() {
		assertTrue(internalTasksPage.ToolBarFullScreen(), "Full screen and Normal screen is not working");
	}

	@Test(priority = 4, description = "Verify Email Setting button", groups = { "Smoke" })
	public void verifyEmailSetting() {
		internalTasksPage.emailSetting();

	}

	@Test(priority = 5, description = "Verify Toolbar - Expand And Collapse", groups = { "Functional" })
	public void verifyExpandCollapseOption() {
		assertTrue(internalTasksPage.expandCollapseClick(), "Expand and Collapse buttons are not working");
	}

	@Test(priority = 6, description = "Verify Active Filter selection", groups = { "Functional" })
	public void verifyActiveFilterSelect() {
		assertTrue(internalTasksPage.activeFilterSelection(), "Drop downs are not selected");

	}


	@Test(priority = 7, description = "Action Delete Record button", groups = { "Smoke" })
	public void verifyDeleteAction() throws AWTException {
		internalTasksPage.verifyDeleteRecord();
	}


	//PopUp Occurred as Edit Internal Task is Forbidden
	
	//@Test(priority = 8, description = " Action EditRecord Cancel Function", groups = { "Smoke" })
		public void verifyEditCancelAction() throws AWTException {
			internalTasksPage.verifyCancelInEditRecord();
		}
	
	//@Test(priority = 9, description = "Action Update Existing Record Save Function", groups = { "Smoke" })
	public void verifyEditSaveAction() throws Exception {
		internalTasksPage.verifyEditSaveRecord();
	}

//	 Add Task 2
//	 Successful but commented to reduce task addition each time of execution
		//@Test(priority = 10, description = "Verify Add Task Save", groups = { "Smoke" })
		public void verifyAddTaskSave() {
			internalTasksPage.addTaskSave();
		
		}
		
		@Test(priority = 11, description = "Verify Add Task Cancel", groups = { "Smoke" })
		public void verifyAddTaskCancel() throws AWTException {
			internalTasksPage.addTaskCancel();
		
		}
	
		@Test(priority = 12, description = "Open and Closed Tab Switch", groups = { "Functional" })
		public void verifySwitchOpenClosedTasks() {
			assertTrue(internalTasksPage.switchBetweenOpenClosedTasks(), "Open and Closed Tasks switch is not possible");
		}
		
	@Test(priority = 13, description = "Verify Refresh", groups = { "Functional" })
	public void verifyRefreshButton() {
		assertTrue(internalTasksPage.refreshClick(), "Refresh button is not clickable");
	}

}
