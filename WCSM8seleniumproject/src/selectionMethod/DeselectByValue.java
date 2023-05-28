package selectionMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByValue {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Supriya/Desktop/webelements/multiselectdropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement dropDown = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDown);
		//to select multiple option
		for (int i=0;i<4;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		//to deSelect multiple option
		sel.deselectByValue("v3");
		Thread.sleep(2000);
		sel.deselectByValue("v2");
	}
}