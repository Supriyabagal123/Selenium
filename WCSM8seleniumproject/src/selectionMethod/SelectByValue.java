package selectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {
	public static void main(String[] args) throws InterruptedException {
		// for single select checkBox
	System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			
			WebDriver driver =new FirefoxDriver ();
			driver.manage().window().maximize();
			driver.get("file:///C:/Users/Supriya/Desktop/webelements/singleselectdropdown.html");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement dropDown = driver.findElement(By.name("menu"));
			Select sel = new Select(dropDown);
			Thread.sleep(2000);
			sel.selectByValue("v3");
	}
}
