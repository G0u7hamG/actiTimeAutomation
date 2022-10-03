package pages;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class UserList_page2 {
		@FindBy(xpath="(//div[@class='components_button_label'])[1]")
	private WebElement btnNewuser;
	
	public UserList_page2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void clickNewuser()
	{
		this.btnNewuser.click();
	}
}
