package keywordDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class ValidLogin extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(2000);
		Flib flib = new Flib();	
		String validUsername = flib.readExcelData("./data/ActiTimeTestData.xlsx","ValidCreds" , 0, 0);
		String validPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx", "ValidCreds", 0, 1);
				
		System.out.println(validUsername);
		System.out.println(validPassword);
		Thread.sleep(2000);
		bt.driver.findElement(By.name("username")).sendKeys(validUsername);
		Thread.sleep(2000);
		bt.driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(2000);
		bt.driver.findElement(By.id("loginButton")).click();
	
	}
}
