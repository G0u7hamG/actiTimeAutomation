package scripts;

import org.testng.annotations.Test;
import generic.baseTest;
import pages.initializePages;

public class actiLoginScript_TC1 extends baseTest {
	
	@Test
	public  void actiLoginscript() {
		logger.info("setup the browser");
		initializePages pages=new initializePages(driver);
		logger.info("enters the user name and passowrd");
		pages.actiLogin.login(prop.getProperty("username"), prop.getProperty("password"));
		logger.info("validate title");
		baseTest.actionUtil.validateTitle("actiTIME - Enter Time-Track");
		
		  
	}
}