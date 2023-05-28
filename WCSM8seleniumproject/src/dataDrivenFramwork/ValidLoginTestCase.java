package dataDrivenFramwork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidLoginTestCase {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://admin/login.do");
		// to read the data from external file create the object for Flib
		Flib flib = new Flib();
		String validUsername= flib.readExcelData("./data/ActiTimeTestData.xlsx", "ValidCreds", 0, 0);
		String validPassword = flib.readExcelData("./data/ActiTimeTestData.xlsx", "ValidCreds", 0, 1);
		
		
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys(validUsername);
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(validPassword);
		Thread.sleep(2000);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
	}
}
