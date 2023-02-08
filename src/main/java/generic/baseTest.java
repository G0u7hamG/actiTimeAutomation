package generic;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseTest {
	public static final String userDir= System.getProperty("user.dir");
	public static final String chromeKey="webdriver.chrome.driver";
	public static final String geckoKey="webdriver.gecko.driver";
	public static final String chromeValue=userDir+"\\drivers\\chromedriver.exe";
	public static final String geckoValue=userDir+"\\drivers\\geckodriver.exe";
	public static final String excelPath=userDir+"//data/Excel.xlsx";
	public WebDriver driver;
	public static Properties prop;
	public static webActionUtil actionUtil;
	public static Logger logger;
	
	/*sets the path for the drivers*/
	@BeforeClass
	public void setPath() {
		try {
		FileInputStream f=new FileInputStream(userDir+"//data//config.properties");
		prop= new Properties();
		prop.load(f);
		}
		catch (Exception e) {
			
		}
		System.setProperty(chromeKey, chromeValue);
		System.setProperty(geckoKey, geckoValue);
		
		
	}
	
	/*launches the browser, defines the explicit wait and fetches the actitime application*/
	@Parameters("Browser")
	@BeforeMethod
	public void launchBrowser(String bn) {

		if(bn.equals("chrome"))
			driver=new ChromeDriver();
		else if(bn.equals("firefox"))
			driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(prop.getProperty("url"));
		actionUtil=new webActionUtil(driver);
		
		//logger = Logger.getLogger("actitime");
		//PropertyConfigurator.configure("log4j.properties");
	}
	
	/*closes the browser*/
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
	
	@AfterSuite
	public void killDriver() {
		try {
			Runtime.getRuntime().exec("taskkill /im chromedriver.exe /t /f");
			Runtime.getRuntime().exec("taskkill /im geckodriver.exe /t /f");
		}
		catch (Exception e) {
			
		}
	}
	
	
	
}
