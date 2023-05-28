package selectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue1 {
	public static void main(String[] args) throws InterruptedException {
		//for multiSelect dropDown
		System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				
				WebDriver driver =new FirefoxDriver ();
				driver.manage().window().maximize();
				driver.get("file:///C:/Users/Supriya/Desktop/webelements/multiselectdropdown.html");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				WebElement dropDown = driver.findElement(By.name("menu"));
				Select sel = new Select(dropDown);
				Thread.sleep(2000);
				//select single options from multiSelct dropDown
				sel.selectByValue("v6");
				//select multiple options from multiSelect dropDown
					sel.selectByValue("v4");
					sel.selectByValue("v2");			
	}
}
