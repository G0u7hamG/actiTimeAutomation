package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class actiTimeLogin_page2 {
	//identifies userame
	@FindBy(name="username")
	private WebElement tbUsername;
	//identifies password
	@FindBy(name="pwd")
	private WebElement tbPassword;
	//identifies login button
	@FindBy(id="loginButton")
	private WebElement btnLogin;
	//constructor
	public actiTimeLogin_page2(WebDriver driver) {
		//intitializes the webelement(non static variable) in the object
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un) {
		this.tbUsername.sendKeys(un);
	}
	
	public void setPassword(String pwd) {
		this.tbPassword.sendKeys(pwd);
	}
	
	public void clickLogin() {
		this.btnLogin.click();
	}
	
	public void login(String un, String pwd) {
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pwd);
		this.btnLogin.click();
	}
	
	
}
