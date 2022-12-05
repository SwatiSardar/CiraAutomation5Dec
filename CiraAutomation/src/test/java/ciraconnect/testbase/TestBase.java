

package ciraconnect.testbase;

import java.io.File;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.time.Duration;
import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

import ciraconnect.pages.BoardApprovalsPage;
import ciraconnect.pages.FulfillmentQueuePage;
import ciraconnect.pages.HomePage;
import ciraconnect.pages.InternalTasksPage;
import ciraconnect.pages.LoginPage;
import ciraconnect.pages.PreferencesPage;
import ciraconnect.pages.ProjectsTasksPage;
import ciraconnect.pages.ResidentContactLogsPage;
import ciraconnect.pages.WorkOrdersPage;
import ciraconnect.testcases.BoardApprovalsPageTest;
import ciraconnect.pages.ClosingRequestsPage;
import ciraconnect.utilities.CommonUtilities;
import ciraconnect.utilities.EnvironmentConfig;
import ciraconnect.utilities.LoggerManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class TestBase {

	public static WebDriver driver;
 // helps to generate the logs in the test report.

	String browserName = EnvironmentConfig.environmentSetup().get("BrowserType");

	public static String applicationURL = EnvironmentConfig.environmentSetup().get("ApplicationURL");
	
	public static String HomePageURL = EnvironmentConfig.environmentSetup().get("HomePageURL");

	public static int PAGE_LOAD_TIMEOUT = Integer
			.parseInt(EnvironmentConfig.environmentSetup().get("PAGE_LOAD_TIMEOUT"));

	public static int IMPLICIT_WAIT = Integer.parseInt(EnvironmentConfig.environmentSetup().get("IMPLICIT_WAIT"));

	public static final String AUTOMATE_USERNAME = EnvironmentConfig.environmentSetup()
			.get("BROWSER_STACK_AUTOMATE_USERNAME");

	public static final String AUTOMATE_ACCESS_KEY = EnvironmentConfig.environmentSetup()
			.get("BROWSER_STACK_AUTOMATE_ACCESS_KEY");

	public LoginPage loginPage = new LoginPage(driver);
	
	public HomePage homePage = new HomePage(driver);
	
	public InternalTasksPage internalTasksPage = new InternalTasksPage(driver);
	
	public ProjectsTasksPage projectsTasksPage = new ProjectsTasksPage(driver);
	
	public PreferencesPage preferencePage = new PreferencesPage(driver);
	
	public WorkOrdersPage workOrdersPage = new WorkOrdersPage(driver);
	
	
	//creating object 
	public FulfillmentQueuePage fulfillmentQueuePage  = new FulfillmentQueuePage(driver);
	
	//creating object 
	public BoardApprovalsPage boardApprovalsPage  = new BoardApprovalsPage(driver);
	
	//creating object
	public ClosingRequestsPage closingRequestsPage = new ClosingRequestsPage(driver);
	
	
	//creating object
	public ResidentContactLogsPage residentContactLogsPage = new ResidentContactLogsPage(driver);

	DesiredCapabilities dc = new DesiredCapabilities();

	// Initializing pages here
	@BeforeMethod(alwaysRun = true)
	public void pageSetup() {
		
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		internalTasksPage = new InternalTasksPage(driver);
		projectsTasksPage = new ProjectsTasksPage(driver);
		workOrdersPage = new WorkOrdersPage(driver);
		preferencePage = new PreferencesPage(driver);
		
		fulfillmentQueuePage = new FulfillmentQueuePage(driver);

		boardApprovalsPage = new BoardApprovalsPage(driver);

		closingRequestsPage = new ClosingRequestsPage(driver);
		
	}
	
	@BeforeSuite(alwaysRun=true)
	public WebDriver setup() throws MalformedURLException, UnknownHostException {

		if (browserName.equalsIgnoreCase("Chrome")) {
			// To Load Chrome driver Instance.

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			LoggerManager.debug("------- Chrome browser loaded -------");

			// et.log(LogStatus.INFO, "Chrome browser loaded");
		} else if (browserName.equalsIgnoreCase("FireFox")) {
			// To Load FireFox driver Instance.

			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

			LoggerManager.debug("------- FireFox browser loaded -------");

			// et.log(LogStatus.INFO, "FireFox browser loaded");
		} else if (browserName.equalsIgnoreCase("Edge")) {
			// To Load Edge driver Instance.
			WebDriverManager.edgedriver().setup();
			
			driver = new EdgeDriver();

			LoggerManager.debug("------- Edge browser loaded -------");

			
		} else if (browserName.equalsIgnoreCase("Safari")) {

			// To Load Safari driver Instance.

			driver = new SafariDriver();

			LoggerManager.debug("------- Safari browser loaded -------");

			// et.log(LogStatus.INFO, "Safari browser loaded");
		} else if (browserName.equalsIgnoreCase("bs_chrome")) {

			LoggerManager.debug("Browser Stack Chrome browser loaded");

			dc.setCapability("os_version", "Catalina");
			dc.setCapability("resolution", "1920x1080");
			dc.setCapability("browser", "Chrome");
			dc.setCapability("browser_version", "latest");
			dc.setCapability("os", "OS X");
			dc.setCapability("name", "BStack-[Java] Sample Test"); // test name
			// dc.setCapability("build", buildName); // CI/CD job or build name
			// dc.setCapability("browserstack.local", browserstackLocal);
			// dc.setCapability("browserstack.localIdentifier",
			// browserstackLocalIdentifier);

			// driver = new RemoteWebDriver(new URL(URL), dc);
			driver = new RemoteWebDriver(new URL(
					"https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub.browserstack.com/wd/hub"), dc);

			driver.manage().window().maximize();

		} else if (browserName.equalsIgnoreCase("bs_iphone")) {

			LoggerManager.debug("Browser Stack iPhone Safari browser loaded");

			dc.setCapability("browserName", "iPhone");
			dc.setCapability("device", "iPhone 11 Pro");
			dc.setCapability("realMobile", "true");
			dc.setCapability("os_version", "13");
			dc.setCapability("name", "BStack-[Java] Sample Test"); // test name
			dc.setCapability("build", "BStack Build Number 2"); // CI/CD job or build name
			// driver = new RemoteWebDriver(new URL(URL), dc);
			driver = new RemoteWebDriver(new URL(
					"https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub.browserstack.com/wd/hub"), dc);

		} else {

			// Default browser set to Chrome driver Instance.

			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			LoggerManager.debug("------- Chrome browser loaded as default browser -------");

			// et.log(LogStatus.INFO, "Chrome browser loaded");

		}

		if (driver != null) {

			driver.manage().deleteAllCookies();

			driver.manage().window().maximize();

			driver.get(applicationURL);

			LoggerManager.debug("------- Application URL set to: " + applicationURL);

			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGE_LOAD_TIMEOUT));

			LoggerManager.debug("------- Page load timeout is set to: " + PAGE_LOAD_TIMEOUT);

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));

			LoggerManager.debug("------- Implicit Wait time is set to: " + IMPLICIT_WAIT);

		} else {

			driver.close();

			LoggerManager.debug("------- Browser closed");

			// Null browser Instance when close.

			driver = null;

			LoggerManager.debug("------- Browser set as NULL");
		}

		return driver;

	}

	//@BeforeSuite(alwaysRun=true)
	public void extentSetUp() throws UnknownHostException {

		

	}

	
	/*
	 * public void userLogout() {
	 * 
	 * LoggerManager.info("----- Verify Logout Start -----");
	 * 
	 * TestBase.test = TestBase.extent.createTest("Logout Test");
	 * //TestBase.test.assignCategory("Smoke Test"); TestBase.test =
	 * TestBase.test.createNode("Verify Logout");
	 * 
	 * TestBase.test.log(Status.INFO, "Verifying Logout");
	 * 
	 * assertTrue(loginPage.userlogout(), "User still logged in");
	 * 
	 * TestBase.test.log(Status.INFO, "User logged out.");
	 * 
	 * LoggerManager.info("----- Verify Valid Logout End -----"); }
	 */
	
	public static String captureScreenshot(WebDriver driver, String screenShotName) throws Exception {

		Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
// 
		String dest =  System.getProperty("user.dir") + EnvironmentConfig.environmentSetup().get("SCREEN_SHOT_PATH")  
				+ screenShotName + System.currentTimeMillis() + ".png";

		System.out.println("Screenshot captured at location: " + dest);
		//log.debug(" ########### Screenshot captured at location: ########### " + dest);

		ImageIO.write(screenshot.getImage(), "PNG", new File(dest));

		return dest;

	}
	
	//@AfterSuite(alwaysRun=true)
	public void tearDown() {
		LoggerManager.info("----- Quitting browser -----");

		//driver.quit();
		LoggerManager.debug("------- Browser quit successfully -------");
		driver.close();

	}

}
