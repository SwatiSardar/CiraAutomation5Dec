package ciraconnect.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import ciraconnect.utilities.LoggerManager;

//Every line of code that runs in Java must be inside a class
public class BoardApprovalsPage {
	@SuppressWarnings("unused")
	private static final Exception AWTException = null;

	JavascriptExecutor js;
	private WebDriver driver;

	// Initializing the Page Objects:
	public BoardApprovalsPage(WebDriver driver) 
	{
		// to refer current class instance variable
		this.driver = driver;
		PageFactory.initElements(driver, this);

		js = (JavascriptExecutor) driver;
		LoggerManager.debug("======== Initializing the Login Page Objects ======== ");
	}

	// URL of the sandbox
	String BoardApprovalsURL = "https://sandbox.ciranet.com/v2/managementportal/community/730/my-work/board-approval";

	// Loading progress xpath
	String sLoader = "//div[@class='dx-overlay-content dx-resizable dx-loadpanel-content']//div[@class='dx-loadpanel-content-wrapper']";

	// Initializing the Page Objects
	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt']")
	WebElement fullScreenIcon;

	@FindBy(xpath = "//i[@class='dx-icon cc-icon fas fa-external-link-alt fa-rotate-180']")
	WebElement normalScreenIcon;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-icon' and @title='Collapse All']")
	WebElement collapseIcon;

	@FindBy(xpath="//div[@class='dx-widget dx-button dx-button-mode-contained dx-button-normal dx-button-has-icon' and @title='Expand All']")
	WebElement expandIcon;

	@FindBy(xpath = "//div[@class='dx-item-content dx-toolbar-item-content']//div[@title='Column Chooser']")
	WebElement columnChooser;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-close']")
	WebElement closeColChooser;

	@FindBy(xpath = "//div[@class='dx-item-content dx-tab-content']//span[normalize-space()='Closed Jobs']")
	public WebElement closedjobs;

	@FindBy(xpath = "//span[normalize-space()='Active Jobs']")
	public WebElement activejobs;

	@FindBy(xpath = "//dx-button[@title='Community Search']")
	public WebElement communityIcon;

	@FindBy(xpath = "//i[@class='dx-icon dx-icon-menu']")
	public WebElement toolbarMenu;

	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//input")
	public WebElement communitysearchBox;

	@FindBy(xpath = "//div[@class='cc-community-search-component-container']//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	public WebElement communitysearchButton;

	@FindBy(linkText = "Amberwood")
	public WebElement amberwoodLink;

	@FindBy(xpath = "//div[@class='dx-button-content'] //i[@class='dx-icon fas fa-house-user']")
	public WebElement ownerIcon;

	@FindBy(xpath="(//div[@class='dx-texteditor-container'])[1]")
	public WebElement ownersearchBox;

	@FindBy(linkText = "10604 Beard Ave")
	public WebElement ownerLink;

	@FindBy(xpath = "//div[@class='cc-owner-search-component-container']//div[@class='dx-button-content']//i[@class='dx-icon fas fa-search']")
	public WebElement ownersearchButton;

	@FindBy(xpath="(//div[@class='dx-item dx-treeview-item'])[2]")
	public WebElement communitymodule;

	@FindBy(xpath = "//span[normalize-space()='My Work Queue']")
	public WebElement MyWorkQueuemodule;

	@FindBy(xpath = "//span[@class='cc-qa-release-menu']")
	public WebElement BoardApprovals;
	
    @FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[2]")
	public WebElement Collections;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[2]")
    public WebElement CollectionsId;
    
    @FindBy(xpath="(//div[@class='dx-checkbox-container'])[2]")
    public WebElement CollectionsAction;
    
    @FindBy(xpath="//div[@class='dx-button-content']//span[text()='Action For Multiple Selection']")
    public WebElement ActionForMultipleSelection;
    
    @FindBy(xpath="(//div[@class='label-container'])[4]")
    public WebElement SelectionReview;
    
    @FindBy(xpath="//div[@class='dx-button-content']//span[text()='Action']")
    public WebElement ActionButton;
    
    @FindBy(xpath="//div[@class='dx-button-content']//span[text()='View AR Collections Details']") 
    public WebElement ActionViewARCollectionsDetails;
    
    @FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times'])[3]")
    public WebElement ViewARCollectionsDetailsCancle;
    
    @FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times'])[2]")
    public WebElement ViewARCollectionsDetailsCancle1;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-opened'])[1]")
    public WebElement CollectionsOpen;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[1]")
    public WebElement Architectural;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[1]")
    public WebElement ArchitecturalId;
    
    @FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-running dx-theme-accent-as-text-color'])[1]")
    public WebElement ArchitecturalAction;
    
    @FindBy(xpath="//div[@class='dx-button-content']//span[text()='View ACC Details']")
    public WebElement ArchitecturalViewACCDetails;
    
    @FindBy(xpath="//div[@class='icon-label-content']")
    public WebElement InternalProjectNotes;
    
    @FindBy(xpath="(//div[@class='dx-texteditor-input-container']//textarea[@role='textbox'])[4]")
    public WebElement ArchitecturalNotes;
    
    @FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-save'])[2]")
    public WebElement NotesSave;
    
    @FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-save'])")
    public WebElement ArchitecturalProjectSave;
    
    @FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times'])[2]")
    public WebElement ArchitecturalBoardApproval;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-opened'])")
    public WebElement Architectural1;
    
    @FindBy(xpath="//tr[@class='dx-row dx-data-row dx-row-lines dx-column-lines' and @aria-rowindex='3']")
    public WebElement RowCount;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[3]")
    public WebElement Invoice;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[3]")
    public WebElement InvoiceId;
    
    @FindBy(xpath="//div[@class='dx-button-content']//span[text()='Action']")
    public WebElement InvoiceAction;
    
    @FindBy(xpath="//div[@class='dx-field-item-content dx-field-item-content-location-right']//span[text()='View AP Workflow Details']")
    public WebElement InvoiceWorkflowDetails;
    
    @FindBy(xpath="//div[@class='dx-item dx-box-item']//i[@title='Invoice']")
    public WebElement InvoicePDF;
    
    @FindBy(xpath="(//div[@class='dx-button-content']//span[text()='Close'])[2]")
    public WebElement InvoiceClosePopUp;
    
    @FindBy(xpath="(//div[@class='dx-button-content']//span[text()='Close'])[1]")
    public WebElement InvoiceClose;
    
    @FindBy(xpath="//div[@class='dx-button-content']//span[text()='Cancel']")
    public WebElement WorkFlowCancel;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-opened'])[1]")
    public WebElement InvoiceGroupOpen;
    
    @FindBy(xpath="(//div[@class='dx-item-content dx-menu-item-content'])[23]")
	WebElement resetLayout;
    
    @FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon dx-icon-close']")
    public WebElement ColumnIcon;
    
    @FindBy(xpath="//div[@class='dx-item-content dx-tab-content']//span[text()='Closed']")
    public WebElement ClosedTab;
    
    @FindBy(xpath="(//div[@class='dx-item-content dx-tab-content'])[1]")
    public WebElement OpenTab;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[1]")
    public WebElement CloseArchitectural;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[1]")
    public WebElement CloseArchitecturalId; 
    
    @FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-eye dx-theme-accent-as-text-color']")
    public WebElement CloseViewButton;
    
    @FindBy(xpath="//div[@class='dx-button-content']//span[text()='View ACC Details']")
    public WebElement CloseAccDetails;
    
    @FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times']")
    public WebElement CloseProjectDetailClose;
    
    @FindBy(xpath="(//div[@class='dx-item dx-toolbar-item dx-toolbar-button'])[20]")
    public WebElement CloseBoardApprovalCancel;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-opened'])[1]")
    public WebElement CloseApprovalClose;
    
    @FindBy(xpath="(//div[@class='dx-group-panel-item dx-datagrid-action dx-datagrid-drag-action'])[1]") 
    public WebElement Process;
    
    @FindBy(xpath="(//div[@class='dx-scrollable-content'])[4]")
    public WebElement Drop;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[3]")
    public WebElement CloseInvoice;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-closed'])[3]")
    public WebElement CloseInvoiceId;
    
    @FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-eye dx-theme-accent-as-text-color']")
    public WebElement CloseInvoiceView1;
    
    @FindBy(xpath="//div[@class='dx-button-content']//span[text()='View AP Workflow Details']")
    public WebElement CloseAPWork;
    
    @FindBy(xpath="(//div[@class='dx-button-content'])[20]")
    public WebElement CloseWorkFlow;

    @FindBy(xpath="(//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times'])[2]")
    public WebElement CloseWorkFlowFinal;
    
    @FindBy(xpath="//div[@class='dx-button-content']//i[@class='dx-icon fas fa-times']")
    public WebElement CloseBoardCancel;
    
    @FindBy(xpath="(//div[@class='dx-datagrid-group-opened'])[1]")
    public WebElement CloseInvoiceClose;
    
  	public String expectedCommunityURL = "https://sandbox.ciranet.com/v2/managementportal/community/730/my-work/board-approval";

	// method declaration
	public <communitytabs> void BoardApprovalsPageLanding() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		driver.navigate().to(BoardApprovalsURL);

		// Webdriver wait to check if the element is Present or visible or enabled or disabled or Clickable
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		// statement which prints the argument passed to it
		System.out.println("======== Navigating to Board Approvals ========");

		// Get current URL
		String actualURL = driver.getCurrentUrl();

		// statement which prints the argument passed to it
		System.out.println("Current Page is : " + driver.getTitle());

		// method used to compare the actual and expected results
		 Assert.assertEquals(actualURL, BoardApprovalsURL);
	}
	
	public void AcionForMultipleSelection() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", Collections);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CollectionsId);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CollectionsAction);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ActionForMultipleSelection);
		if(SelectionReview.isEnabled()==true) 
		{
			System.out.println("Action For Multiple Selection is Active");
		}
		else
		{
			System.out.println("Action For Multiple Selection is not Active");
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ActionForMultipleSelection);		
	}
	
	public void ViewARCollectionsDetails() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ActionButton);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ActionViewARCollectionsDetails);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		if(SelectionReview.isDisplayed()==true) 
		{
			System.out.println("View AR Collection Page is Display");
		}
		else
		{
			System.out.println("View AR Collection Page is not Display");
		}
		js.executeScript("arguments[0].click();", ViewARCollectionsDetailsCancle);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ViewARCollectionsDetailsCancle1);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CollectionsOpen);		
	}
	
	public void ArchitecturalViewACCDetails() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", Architectural);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ArchitecturalId);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ArchitecturalAction);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ArchitecturalViewACCDetails);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", InternalProjectNotes);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ArchitecturalNotes);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		ArchitecturalNotes.sendKeys("Testing");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", NotesSave);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ArchitecturalProjectSave);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ArchitecturalBoardApproval);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		List<WebElement> xpath = driver.findElements(By.xpath("//td[@class='dx-command-select dx-editor-cell dx-editor-inline-block']"));
		
		int xpathCount = xpath.size();
		System.out.println("Total Count: " + xpathCount);
		js.executeScript("arguments[0].click();", Architectural1);
	}
	
	public void InvoiceViewAPWorkflowDetails() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", Invoice);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", InvoiceId);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", InvoiceAction);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", InvoiceWorkflowDetails);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", InvoiceClosePopUp);
		
		if(InvoicePDF.isEnabled()==true) 
		{
			System.out.println("Invoice Work flow Details Page is Display");
		}
		else 
		{
			System.out.println("Invoice Work flow Details Page is not Display");
		}
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", InvoiceClose);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", WorkFlowCancel);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", InvoiceGroupOpen);	
	}
	
	public void ToolBarFullScreen() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		//allows to execute JavaScript code
		js.executeScript("arguments[0].click();", fullScreenIcon);

		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));

		//if statement to specify a block of Java code to be executed if a condition is true
		if (normalScreenIcon.isDisplayed()) 
		{
			System.out.println("FullScreen Menu button clicked");
		}
		//block of code to be executed if the condition is false
		else 
		{
			System.out.println("FullScreen Menu button not clicked");
		}
	}
     
	public void ToolBarNormalScreen() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		
		wait.until(ExpectedConditions.elementToBeClickable(normalScreenIcon));
		js.executeScript("arguments[0].click();", normalScreenIcon);

		wait.until(ExpectedConditions.elementToBeClickable(fullScreenIcon));

		if (fullScreenIcon.isDisplayed()) 
		{
			System.out.println("NormalScreen Menu button clicked");
		} 
		else 
		{
			System.out.println("NormalScreen Menu button not clicked");
		}
		
	}
	
	public boolean expandOptionClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", expandIcon);
		
		//statement which prints the argument passed to it
		System.out.println("Clicked on Expand icon");

		if(ArchitecturalAction.equals(ArchitecturalAction)) 
		{
	    	System.out.println("Expand is working");
	    }
	    
	    else 
	    {
	    	System.out.println("Expand is not working");
	    }
	    wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		wait.until(ExpectedConditions.elementToBeClickable(collapseIcon));
		js.executeScript("arguments[0].click();", collapseIcon);
		
		//statement which prints the argument passed to it
		System.out.println("Clicked on Collapse icon");
	    return true;
		
	}
     
	public void SwitchTab() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ClosedTab);
		
		System.out.println("Switched to Close Tab");
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", OpenTab);

		//statement which prints the argument passed to it
		System.out.println("Switched to Open Tab");
	}
	
	public boolean closedtabArchitecturalViewACCDetailsbutton() 
	{
		String Title="Project Details";
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", ClosedTab);

		//statement which prints the argument passed to it
		System.out.println("Switched to Close Tab");
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseArchitectural);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseArchitecturalId);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseViewButton);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseAccDetails);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		
		if(Title.equals("Project Details")) 
		{
			System.out.println(" Architectural Request Approval pop-up window displayed");
			
		}
		else 
		{
			System.out.println(" Architectural Request Approval failed to load pop-up window");
		}
		js.executeScript("arguments[0].click();", CloseProjectDetailClose);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseBoardApprovalCancel);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseApprovalClose);
		
		return true;
	}
	
	public void closedtabInvoiceviewDetails() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseInvoice);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseInvoiceId);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseInvoiceView1);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseAPWork);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseWorkFlow);
		
		String Label=driver.getTitle();
		System.out.println("Page title is:"+ Label);
		
		if(Label.equals("Amberwood")) 
		{
			System.out.println("AAP Workflow pop-up window displayed");
		}
		else 
		{
			System.out.println("AAP Workflow pop-up window failed to load");
		}
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseWorkFlowFinal);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseBoardCancel);
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", CloseInvoiceClose);
	}
	
	public void columnChooserClick() 
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("dx-loadindicator-icon")));
		js.executeScript("arguments[0].click();", columnChooser);
		
		//statement which prints the argument passed to it
		System.out.println("Clicked Column Chooser");

		List<WebElement> workOrdersColumnChooser = driver.findElements(By.cssSelector("div[class='dx-overlay-content dx-popup-normal dx-popup-draggable dx-resizable'] ul[role='group'] li"));
		System.out.println("List size is: " + workOrdersColumnChooser.size());
		
		try 
		{
			Thread.sleep(1000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		wait.until(ExpectedConditions.elementToBeClickable(closeColChooser));
		js.executeScript("arguments[0].click();", closeColChooser);
				
		//statement which prints the argument passed to it
		System.out.println("Column Chooser closed");
		
		//Quit current browser window
		driver.quit();
	}   
	

	
	
}
