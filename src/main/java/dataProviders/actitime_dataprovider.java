package dataProviders;

import org.testng.annotations.DataProvider;

import generic.baseTest;
import generic.webActionUtil;

public class actitime_dataprovider {
	@DataProvider
	public Object[][] addUserdata() {
		Object[][] d = new Object[1][5];
		d[0][0]=webActionUtil.getData(baseTest.excelPath, "adduser", 1, 0);
		d[0][1]=webActionUtil.getData(baseTest.excelPath, "adduser", 1, 1);
		d[0][2]=webActionUtil.getData(baseTest.excelPath, "adduser", 1, 2);
		d[0][3]=webActionUtil.getData(baseTest.excelPath, "adduser", 1, 3);
		d[0][4]=webActionUtil.getData(baseTest.excelPath, "adduser", 1, 4);
		return d;

	}
}
