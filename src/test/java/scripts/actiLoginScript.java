package scripts;

import org.testng.annotations.Test;

import generic.baseTest;
import pages.initializePages;

public class actiLoginScript extends baseTest {
	
	@Test
	public void actiLoginscript() {
		
		initializePages pages=new initializePages(driver);
		pages.actiLogin.login(prop.getProperty("username"), prop.getProperty("password"));
		baseTest.actionUtil.validateTitle("actiTIME -  Enter Time-Track");
	}
}
