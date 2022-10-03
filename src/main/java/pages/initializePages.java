package pages;

import org.openqa.selenium.WebDriver;

public class initializePages {
	
	public actiTimeLogin_page2 actiLogin;
	public actiTimeEnterTimetrack_page2 actiTimeTrack;
	public UserList_page2 actiUsers;
	public AddUser_page2 actiAddUsers;
	
	public initializePages(WebDriver driver) {
		this.actiLogin= new actiTimeLogin_page2(driver);
		this.actiTimeTrack=new actiTimeEnterTimetrack_page2(driver);
		this.actiAddUsers=new AddUser_page2(driver);
		this.actiUsers=new UserList_page2(driver); 
	}
}
