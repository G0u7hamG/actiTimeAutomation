package scripts;

import org.testng.annotations.Test;

import dataProviders.actitime_dataprovider;
import generic.baseTest;
import pages.initializePages;

public class addUserScript_TC2 extends baseTest {
	@Test(dataProviderClass=actitime_dataprovider.class,dataProvider="addUserdata")
	public void addUsercript(String un, String pwd, String fn, String ln, String em) throws InterruptedException {
		initializePages pages=new initializePages(driver);
		logger.info("enters the username and password");
		pages.actiLogin.login(un, pwd);
		logger.info("click on users");
		pages.actiTimeTrack.clickUsers();
		logger.info("click on new users");
		pages.actiUsers.clickNewuser();
		Thread.sleep(3000);
		logger.info("enters the firstname, lastname and email");
		pages.actiAddUsers.addUser(fn,ln, em);


	}
}
