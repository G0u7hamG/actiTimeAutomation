package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeEnterTimetrack_page2 {
	//identifies the tasks
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement lnkTask;
	//identifies the reports
	@FindBy(xpath="//a[@class='content reports']")
	private WebElement lnkReports;
	//idetnifies the users
	@FindBy(xpath="//a[@class='content users']")
	//a[@class='content selected users']
	private WebElement lnkUSers;
	//idenntifies the logoutbutton
	@FindBy(id="logoutLink")
	private WebElement btnLogout;
	//constructor to initialize non static variables
	public actiTimeEnterTimetrack_page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//clicks on tasks
	public void clickTask()
	{
		this.lnkTask.click();
	}
	//clicks on reports
	public void clickReports()
	{
		this.lnkReports.click();
	}
	//clicks on users
	public void clickUsers()
	{
		this.lnkUSers.click();
	}
	//clicks on logout
	public void clickLogout()
	{
		this.btnLogout.click();
	}
	
}
