package webBasedPopup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import methodsOfWebElement.getTextMethod;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
		
		WebDriver driver =new FirefoxDriver ();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file://C:/Users/Supriya/Desktop/webelements/Popup/Alert.html");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[.='Click me!']")).click();
		
		Thread.sleep(2000);
		Alert al = driver.switchTo().alert();
		System.out.println(driver.getTitle());
		al.dismiss();
	}
}
