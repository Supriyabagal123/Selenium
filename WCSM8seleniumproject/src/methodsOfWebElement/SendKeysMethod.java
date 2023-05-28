package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SendKeysMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		 
		   WebDriver driver = new ChromeDriver ();
		   driver.manage().window().maximize();
		   driver.get("http://admin/login.do");
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   //by using Method Chaining
		   driver.findElement(By.name("username")).sendKeys("admin");
		   //by using refference variable
		   WebElement passwordTB=driver.findElement(By.name("pwd"));
		   passwordTB.sendKeys("manager");
	}
}
