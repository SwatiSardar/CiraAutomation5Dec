package ciraconnect.pages;

import java.time.Duration;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ciraconnect.utilities.LoggerManager;


public class HomePage {

	protected WebDriver driver;

	public Boolean blnLogin = false;
	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		LoggerManager.debug("======== Initializing the Home Page Objects ======== ");

	}
	
	@FindBy(xpath = "//dx-button[@title='Community Search']")
	public WebElement communityIcon;
	
	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	public WebElement toolbarMenu;
	
	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//input")
	public WebElement communitysearchBox;
	
//	@FindBy(css = "dx-text-box[class='cc-search-text-input dx-show-invalid-badge dx-textbox dx-texteditor dx-show-clear-button dx-editor-underlined dx-texteditor-empty dx-widget dx-state-hover dx-state-focused'] input[role='textbox']")
//	public WebElement communitysearchBox;
	
	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	public WebElement communitysearchButton;
	
	@FindBy(linkText = "Amberwood")
	public WebElement amberwoodLink;
	
	@FindBy(xpath = "//div[@class='dx-button-content'] //i[@class='dx-icon fas fa-house-user']")
	public WebElement ownerIcon;
	
//	@FindBy(xpath = "//div[@class='cc-owner-search-component-container']//input")
//	public WebElement ownersearchBox;
	
	@FindBy(xpath = "//div[@class='cc-owner-search-component-container']//input")
	public WebElement ownersearchBox;
	
//	@ByAngularModel.FindBy(rootSelector ="")
//	public WebElement ownersearchBox;
	
	@FindBy(linkText = "10604 Beard Ave")
	public WebElement ownerLink;

	@FindBy(xpath = "//div[@class='cc-owner-search-component-container']//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	public WebElement ownersearchButton;
	
	public String owneractualURL;
	public String expectedownerURL = "https://sandbox.ciranet.com/v2/managementportal/property/405/R0337337L0002552/home";
	public String expectedCommunityURL = "https://sandbox.ciranet.com/v2/managementportal/community/730/home";
	
	
	public void clickOwnerSearch() {

		//================== OwnerSearch ==============================

		LoggerManager.info("============  Clicking on Owner Search ============");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		if (!ownersearchBox.isDisplayed()) {
			toolbarMenu.click();
		}
		
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ownersearchBox));
		wait.until(ExpectedConditions.elementToBeClickable(ownersearchBox));
		ownersearchBox.click();
		ownersearchBox.sendKeys("romich");
		ownersearchButton.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(ownerLink));
		wait.until(ExpectedConditions.elementToBeClickable(ownerLink));
		
		String ownerPopUp = driver.getWindowHandle();
		driver.switchTo().window(ownerPopUp);
	
		ownerLink.click();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList ownertabs = new ArrayList(driver.getWindowHandles());
		System.out.println("Tabs Open : " + ownertabs.size());
		driver.switchTo().window((String) ownertabs.get(1));

		System.out.println("driver switched to : " + driver.getTitle());
		 owneractualURL = driver.getCurrentUrl();
		System.out.println("Current URL : " + owneractualURL);
		Assert.assertEquals(owneractualURL, expectedownerURL);
		driver.close();
		driver.switchTo().window((String) ownertabs.get(0));		
		

	}

	public void clickCommunitySearch() {
		
	LoggerManager.info("============  Clicking on Community Search ============");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(communityIcon));
		wait.until(ExpectedConditions.elementToBeClickable(communityIcon));
		communityIcon.click();
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(communitysearchBox));
		wait.until(ExpectedConditions.elementToBeClickable(communitysearchBox));
		communitysearchBox.click();
		communitysearchBox.sendKeys("amberwood");
		communitysearchButton.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		String communityPopUp = driver.getWindowHandle();
		driver.switchTo().window(communityPopUp);
		new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(amberwoodLink));
		wait.until(ExpectedConditions.elementToBeClickable(amberwoodLink));
		amberwoodLink.click();
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		@SuppressWarnings({ "unchecked", "rawtypes" })
		ArrayList communitytabs = new ArrayList(driver.getWindowHandles());
		System.out.println("Tabs Open : " + communitytabs.size());
		driver.switchTo().window((String) communitytabs.get(1));

		System.out.println("driver switched to : " + driver.getTitle());
		String actualURL = driver.getCurrentUrl();
		System.out.println("Current URL : " + actualURL);
		driver.close();
		driver.switchTo().window((String) communitytabs.get(0));
		//driver.close();
		Assert.assertEquals(actualURL, expectedCommunityURL );
		ownerIcon.click(); //setting default
		ownersearchBox.click();
		ownersearchBox.clear();
		
	}
	
	
}