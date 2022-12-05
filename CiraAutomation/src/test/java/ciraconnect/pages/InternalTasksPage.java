package ciraconnect.pages;

import java.awt.AWTException;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ciraconnect.utilities.LoggerManager;

public class InternalTasksPage {

	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	private WebDriver driver;

	// Initializing the Page Objects:
	public InternalTasksPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");

	}

	String internalTaskURL = "https://sandbox.ciranet.com/v2/managementportal/my-work/internal-tasks";

	//Abhay R
	@FindBy(xpath = "//i[@class='fas fa-star fa-stack-1x dx-theme-accent-as-text-color']")
	WebElement columnChooser;
	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;
	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-minus-square']")
	WebElement collapseIcon;
	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon far fa-plus-square']")
	WebElement expandIcon;
	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;
	@FindBy(xpath = "//div//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;
	@FindBy (xpath="(//span[@class='dx-tab-text'])[2]")
 	WebElement closeTab;
	@FindBy (xpath="(//div[@role='tab'])[1]")
	WebElement openTab;
	@FindBy (xpath="//div[@class='dx-datagrid-content']")
	WebElement gridData;
	//Abhay R
	
	@FindBy(xpath = "//div[@class='cc-owner-search-component-container']//input")
	public WebElement ownersearchBox;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	public WebElement toolbarMenu;

	@FindBy(xpath = "//ul[contains(@class,'dx-treeview-node-container dx-treeview-node-container-opened')]//li//div//span[contains(text(),'My Work Queue')]")
	public WebElement menuMyWorkQueue;

	@FindBy(xpath = "//div[@class='header-text']//span[normalize-space()='Internal Tasks']")
	public WebElement menuInternalTasks;

	//department
	@FindBy(xpath = "(//div[contains(@class,'dx-dropdowneditor-icon')])[2]")
	public WebElement departmentDropDown;
	@FindBy(xpath = "//div[contains(text(),'Accounting Services Group')]")
	public WebElement departmentValue;

	// Add Task PopUp Fields
	@FindBy(xpath = "//div[@class='dx-template-wrapper dx-button-content']//div[@class='dx-dropdowneditor-icon']")
	public WebElement selectcommunityDD;
	@FindBy(xpath = "//span[normalize-space()='1100 Trinity Mills Condos']")
	public WebElement selectcommunityDDValue;
	@FindBy(xpath = "//div//input[@name='internalTask.shortDescription']")
	public WebElement shortDescription;
	@FindBy(xpath = "//div//textarea[@name='internalTask.description']")
	public WebElement description;
	@FindBy(xpath = "(//div[@class='dx-dropdowneditor-icon'])[15]")
	public WebElement priority;
	@FindBy(xpath = "//div[contains(text(),'High')]")
	public WebElement priorityValue;
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[2]/dx-box[1]/div[1]/dxi-item[1]/dx-form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")
	public WebElement calendar;
	@FindBy(xpath = "//div//textarea[@name='internalTask.statusCode']")
	public WebElement status;
	@FindBy(xpath = "//div//span[normalize-space()='Add Task']")
	public WebElement btnAddTask;
	@FindBy(xpath = "//input[@id='dx_dx-c73a5fe1-2a45-c7c4-820a-bdea20036215_internalTask.priorityId']")
	public WebElement dropdownPriority;
	@FindBy(xpath = "//dx-toolbar[@class='button-container dx-toolbar dx-widget dx-visibility-change-handler dx-collection']//div[@class='dx-toolbar-items-container']")
	public WebElement popupAddTask;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	public WebElement btnCancel;
	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement btnSave;
	@FindBy(xpath ="//sup[@class='page-help-icon']//a[@class='fas fa-question-circle']")
	public WebElement helpInternalTask;
	
	// Email Setting
	@FindBy(xpath = "//span[normalize-space()='Email Settings']")
	public WebElement emailButton;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	public WebElement emailCancel;
	// Action Button in Record
	@FindBy(xpath = "(//div[contains(@class,'dx-dropdowneditor-icon')])[1]")
	WebElement activeFilterDropdown;
	@FindBy(xpath = "//dx-select-box[@displayexpr='text']//input[@role='combobox']")
	WebElement activeFilterValue;
	@FindBy(xpath = "//div[contains(text(),'All Tasks')]")
	public WebElement allTasks;

	//dynamic Xpath
	@FindBy(xpath = "(//div[@class='dx-button-content'][contains(.,'Action')])[1]")
	public WebElement actionButton;
//	@FindBy(xpath = "//div[@id='dx-fd7308c1-f18a-c654-e238-c1442c253b41']//span[normalize-space()='Action']")
//	public WebElement actionButton;
	@FindBy(xpath = "//div[contains(text(),'Edit')]")
	public WebElement editRecord;
	@FindBy(xpath = "//span[normalize-space()='Cancel']")
	public WebElement editCancelAction;
	@FindBy(xpath = "//span[normalize-space()='Save']")
	public WebElement editSaveAction;
	@FindBy(xpath = "//span[normalize-space()='Refresh']")
	public WebElement refreshButton;
	@FindBy(xpath = "//div[@class='dx-datagrid-content']//table//tbody//td[@colspan='27']")
	public WebElement ActionVisibility;
	@FindBy(xpath = "//div[contains(text(),'Delete Task')]")
	public WebElement deleteTask;
	@FindBy(xpath = "//div[@class='dx-dropdowneditor-input-wrapper dx-selectbox-container']//span[@class='dx-icon dx-icon-clear']")
	public WebElement cleardd;
	
	public void InternalTaskPageLanding() {
		driver.navigate().to(internalTaskURL);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		System.out.println("======== Navigating to Internal Task ========");
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current Page is : " + driver.getTitle());
		Assert.assertEquals(actualURL, internalTaskURL);
	}

	public void addTaskSave() {
		System.out.println("++++++In add task save+++++++");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(departmentDropDown));
		departmentDropDown.click();
		wait.until(ExpectedConditions.elementToBeClickable(departmentValue));
		departmentValue.click();

		wait.until(ExpectedConditions.visibilityOf(btnAddTask));
		btnAddTask.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		String addTaskPopup = driver.getWindowHandle();
		driver.switchTo().window(addTaskPopup);
		System.out.println("Inside Add Task popup");

		new WebDriverWait(driver, Duration.ofSeconds(3));

		selectcommunityDD.click();
		selectcommunityDDValue.click();
		System.out.println("Community Dropdown selected");

		Actions actions = new Actions(driver);
		actions.moveToElement(shortDescription).perform();
		actions.click(shortDescription).perform();
		shortDescription.sendKeys("Test");
		System.out.println("Clicked Short Description");
		actions.moveToElement(description).perform();
		;
		actions.click(description).perform();
		description.sendKeys("Test");
		System.out.println("Clicked Description");

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", priority);
		priority.click();
		priorityValue.click();
		System.out.println("Priority Selected : " + priorityValue.getText());
		actions.moveToElement(calendar).perform();
		;
		actions.click(calendar).perform();
		calendar.sendKeys("10/14/2022");

		btnSave.click();
		System.out.println("Save click");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		Date date = new Date();
		System.out.println("Task Added on Date : " + formatter.format(date));

	}

	public void addTaskCancel() throws AWTException {
		System.out.println("++++++In add task cancel+++++++");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(departmentDropDown));
		departmentDropDown.click();
		wait.until(ExpectedConditions.elementToBeClickable(departmentValue));
		departmentValue.click();
		System.out.println("Verifying Cancel button fo Add Task");
		wait.until(ExpectedConditions.visibilityOf(btnAddTask));
		btnAddTask.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		String addTaskPopup = driver.getWindowHandle();
		driver.switchTo().window(addTaskPopup);
		System.out.println("Inside Add Task popup");

		btnCancel.click();
		System.out.println("Cancel Button Clicked");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		 Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		
		System.out.println("Cancel click");

	}
	
	public boolean columnChooserClick() {
		System.out.println("++++++In add Coloumn Chooser+++++++");

		Actions actColumnChooser = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(columnChooser));
		actColumnChooser.moveToElement(columnChooser).click().build().perform();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Clicked Column Chooser");
		String columnChooserPopUp = driver.getWindowHandle();
		driver.switchTo().window(columnChooserPopUp);
		wait.until(ExpectedConditions.elementToBeClickable(closeColChooser));
		closeColChooser.click();
		System.out.println("Coloumn Chooser closed");
		return true;

	}
	
	public boolean expandCollapseClick() {
		System.out.println("++++++In Expand Collapse+++++++");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(expandIcon));
		expandIcon.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Clicked on Expand Record icon");
		wait.until(ExpectedConditions.elementToBeClickable(collapseIcon));
		collapseIcon.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Clicked on Collapse Record icon");

		return true;
	}
	
	public boolean ToolBarFullScreen() {
		System.out.println("++++++In Full screen check+++++++");

		Actions actToolbar = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(fullScreenIcon));

		actToolbar.moveToElement(fullScreenIcon).click().build().perform();

		wait.until(ExpectedConditions.visibilityOf(normalScreenIcon));

		actToolbar.moveToElement(normalScreenIcon).click().build().perform();

		return true;
	}

	public void emailSetting() {
		System.out.println("++++++In Email Setting+++++++");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(emailButton));
		emailButton.click();
		System.out.println("Email Setting Button is Clickable \n Status : " + emailButton.isEnabled());
		String emailSettingPopup = driver.getWindowHandle();
		driver.switchTo().window(emailSettingPopup);
		System.out.println("Inside Email Setting popup");
		wait.until(ExpectedConditions.elementToBeClickable(emailCancel));
		System.out.println("Email Setting Button is Clickable \n Status : " + emailCancel.isEnabled());
		emailCancel.click();

	}
	
	public boolean switchBetweenOpenClosedTasks() {
		
		System.out.println("++++++In Switch Tabs +++++++");

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(closeTab));
		closeTab.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Closed Task Selected");
		wait.until(ExpectedConditions.elementToBeClickable(openTab));
		openTab.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Open Task Selected");
		
		return true;
	}
	
public boolean refreshClick() {
		
		//aciveFilter();
	System.out.println("++++++In Refresh Click +++++++");

		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(refreshButton));
		refreshButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Clicked on Refresh Button");
		
		//wait.until(ExpectedConditions.elementToBeClickable(gridData));
		
		return true;
		
		
	}

public boolean activeFilterSelection() {

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	wait.until(ExpectedConditions.elementToBeClickable(activeFilterDropdown));
	activeFilterDropdown.click();
	allTasks.click();
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
	System.out.println("Selected Active Filter : "+activeFilterValue.getText());

	return true;
}

	public void verifyCancelInEditRecord() throws AWTException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		System.out.println("+++In verifyCancelInEditRecord+++");
		wait.until(ExpectedConditions.elementToBeClickable(activeFilterDropdown));
		activeFilterDropdown.click();
		allTasks.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		expandIcon.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		System.out.println("Clicked on Record Expand");

		wait.until(ExpectedConditions.elementToBeClickable(actionButton));
		actionButton.click();
		System.out.println("Action Clicked");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		editRecord.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		String editRecordPopup = driver.getWindowHandle();
		driver.switchTo().window(editRecordPopup);
		wait.until(ExpectedConditions.elementToBeClickable(editCancelAction));
		System.out.println("Cancel Edit Record Functionality Status : " + editCancelAction.isEnabled());
		editCancelAction.click();
		 try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

		
		System.out.println("Cancel Edit Record PopUp Closed");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

	public void verifyDeleteRecord() throws AWTException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(expandIcon));
		expandIcon.click();
		wait.until(ExpectedConditions.visibilityOf(actionButton));
		wait.until(ExpectedConditions.elementToBeClickable(actionButton));
		actionButton.click();
		System.out.println("Action Clicked");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		deleteTask.click();
		System.out.println("Clicked on Delete Task in Action Button");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		 
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
			System.out.println("Confirmation Popup Generated \n Selected: 'NO'");
	
	}

	public void verifyEditSaveRecord() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		expandIcon.click();
		wait.until(ExpectedConditions.visibilityOf(actionButton));
		wait.until(ExpectedConditions.elementToBeClickable(actionButton));
		actionButton.click();
		System.out.println("Action Clicked");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		editRecord.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		String editRecordPopup = driver.getWindowHandle();
		driver.switchTo().window(editRecordPopup);
		wait.until(ExpectedConditions.elementToBeClickable(editSaveAction));
		System.out.println("Edit Save Record Functionality Status : " + editSaveAction.isEnabled());
		editSaveAction.click();
		System.out.println("Clicked on Save");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		Robot robot;
		robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
//		if (editSaveAction.isDisplayed() == true && editSaveAction.isEnabled() == true) {
//			System.out.println("Action Button status after Pop Up Close : " + editSaveAction.isDisplayed());
//			System.out.println("Task Updated Successfully");
//		} else {
//			
//				robot = new Robot();
//				robot.keyPress(KeyEvent.VK_ENTER);
//				robot.keyRelease(KeyEvent.VK_ENTER);
//				throw AWTException;
//		}
		}

	public void helpInternalTask() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		wait.until(ExpectedConditions.elementToBeClickable(helpInternalTask));
		helpInternalTask.click();
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs2.get(1));
	    System.out.println("current URL : "+driver.getCurrentUrl());
	    System.out.println("Clicked and Navigated to Help");
	    driver.switchTo().window(tabs2.get(0));
	    System.out.println("Navigated back to Internal Page");
	}

	}


