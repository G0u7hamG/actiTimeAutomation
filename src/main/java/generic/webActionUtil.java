 package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webActionUtil {
	WebDriver driver;
	public webActionUtil(WebDriver x) {
		this.driver=x;
		
	}
	public static String getData(String path, String sn, int r, int c) {
		try {
			// reads the data from excel
			FileInputStream f = new FileInputStream(path);
			// creates the workbook
			Workbook book = WorkbookFactory.create(f);
			// reads the data from the specified cell of the workbook
			String data = book.getSheet(sn).getRow(r).getCell(c).getStringCellValue();
			// reaturns the data
			return data;
		} catch (Exception e) {
			return null;
		}

	}

	public void validateTitle(String expectedTitle) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs(expectedTitle));
			System.out.println("Pass: Title is matching");
		} catch (Exception e) {
			System.out.println("Fail: Title is not matching");
			Assert.fail();
		}
	}
	
	public void captureScreenshot(String scriptname) {
		TakesScreenshot t=(TakesScreenshot) driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File(baseTest.userDir+"//screenshots//"+scriptname+".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			
		}
	}
}
