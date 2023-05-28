package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver ();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		   driver.get("file:///C:/Users/Supriya/Desktop/webelements/textbox.html");
		   Thread.sleep(2000);
		   driver.findElement(By.id("i1")).sendKeys("abcd@123");
	}
}
