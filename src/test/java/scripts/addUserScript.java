package scripts;

import org.testng.annotations.Test;

import dataProviders.actitime_dataprovider;
import generic.baseTest;
import pages.initializePages;

public class addUserScript extends baseTest {
	@Test(dataProviderClass=actitime_dataprovider.class,dataProvider="addUserdata")
	public void addUsercript(String un, String pwd, String fn, String ln, String em) throws InterruptedException {
		initializePages pages=new initializePages(driver);
		pages.actiLogin.login(un, pwd);
		pages.actiTimeTrack.clickUsers();
		pages.actiUsers.clickNewuser();
		Thread.sleep(3000);
		pages.actiAddUsers.addUser(fn,ln, em);


	}
}
