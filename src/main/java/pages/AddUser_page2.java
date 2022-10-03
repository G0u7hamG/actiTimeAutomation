package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUser_page2 {
	@FindBy(xpath="(//input[@name='firstName'])[2]")
	private WebElement tbFirstName;
	
	@FindBy(xpath="(//input[@name='lastName'])[2]")
	private WebElement tbLastName;
	
	@FindBy(xpath="(//input[@name='email'])[2]")
	private WebElement tbEmail;
	
	@FindBy(xpath="//div[contains(text(),'Save & Send Invitation')]")
	private WebElement btnSave;
	
	public AddUser_page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void addUser(String Fn, String Ln, String e)
	{
		this.tbFirstName.sendKeys(Fn);
		this.tbLastName.sendKeys(Ln);
		this.tbEmail.sendKeys(e);
		this.btnSave.click();
	}
}
